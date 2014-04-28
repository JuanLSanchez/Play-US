package play_us.client;

import java.util.ArrayList;
import java.util.List;

import com.allen_sauer.gwt.voices.client.Sound;
import com.allen_sauer.gwt.voices.client.SoundController;
import com.google.appengine.api.images.ImagesServicePb.OutputSettings.MIME_TYPE;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.DoubleClickEvent;
import com.google.gwt.event.dom.client.DoubleClickHandler;
import com.google.gwt.media.client.Audio;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class Reproductor {
	private VerticalPanel reproductor;
	private HorizontalPanel controles;
	private Label title;
	private Button play;
	private Button next;
	private Button last;
	private Audio cancion;{
		cancion = Audio.createIfSupported();
	}
	private boolean reproduciendo;
	private Integer nReproduciendo;
	private List<String> urls;
	private ListBox listaDeReproduccion;
	private Timer tiempo ;
		
	public Reproductor(){
		tiempo = new Timer() {
			public void run() {
				aumentarTiempo();		
			}
		};
		tiempo.scheduleRepeating(1000);
		nReproduciendo = -1;
		urls = new ArrayList<String>();
		listaDeReproduccion =  new ListBox();{
			listaDeReproduccion.setVisibleItemCount(25);
			listaDeReproduccion.setVisible(false);
			listaDeReproduccion.setWidth("100%");
		};
		reproductor = new VerticalPanel();
		controles = new HorizontalPanel();
		play = new Button("Play");
		next = new Button("Next");
		last = new Button("Last");
		reproduciendo = false;
		controles.add(last);
		controles.add(play);
		controles.add(next);
		reproductor.add(controles);
		//reproductor.add(title);
		
		//Acciones
		play.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				play(listaDeReproduccion.getSelectedIndex());
				
			}
		});
		
		next.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				listaDeReproduccion.setSelectedIndex(next());
			}
		});
		
		last.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				listaDeReproduccion.setSelectedIndex(last());
			}
		});
		
		listaDeReproduccion.addDoubleClickHandler(new DoubleClickHandler() {
			public void onDoubleClick(DoubleClickEvent event) {
				deleteSong(listaDeReproduccion.getSelectedIndex());
			}
		});
		
		
	}
	
	//public void addURL(String url){	urls.add(url);	}
	public void addSong(String url, String title){
		urls.add(url);
		listaDeReproduccion.addItem(title);
	}
	
	public void deleteSong(Integer i){
		urls.remove(i);
		listaDeReproduccion.removeItem(i);
	}
		
	public void aumentarTiempo(){
		if(cancion.hasEnded()&&reproduciendo){
			listaDeReproduccion.setSelectedIndex(next());
		}
		
	}
	
	public void play(int indice){
		if(nReproduciendo != indice){
			cancion.setSrc(urls.get(indice));
			cancion.play();
			nReproduciendo=indice;
			reproduciendo=true;
		}else if(reproduciendo){
			cancion.pause();
			reproduciendo=false;
		}else{
			reproduciendo=true;
			if(indice==-1){
				cancion.setSrc(urls.get(0));
				cancion.play();
				nReproduciendo=0;
				listaDeReproduccion.setSelectedIndex(0);
			}else{
				cancion.play();
			}
		}
	}
	
	
	public int next(){
		int max = urls.size()-1;
		if(nReproduciendo<max){
			nReproduciendo++;
		}else{
			nReproduciendo=0;
		}
		cancion.setSrc(urls.get(nReproduciendo));
		if(reproduciendo){
			cancion.play();
		}
		return nReproduciendo;
	}
	
	public int last(){
		int max = urls.size()-1;
		if(nReproduciendo>0){
			nReproduciendo--;
		}else{
			nReproduciendo=max;
		}
		cancion.setSrc(urls.get(nReproduciendo));
		if(reproduciendo){
			cancion.play();
		}
		return nReproduciendo;
	}
	
	public VerticalPanel getReproductor(){
		return reproductor;
	}
	
	public ListBox getListaReproduccion(){
		return listaDeReproduccion;
	}
}
