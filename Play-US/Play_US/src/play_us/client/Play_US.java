package play_us.client;


import java.util.ArrayList;
import java.util.List;

import play_us.client.rpc.FacebookService;
import play_us.client.rpc.FacebookServiceAsync;
import play_us.client.rpc.GoogleDrive;
import play_us.client.rpc.GoogleDriveAsync;
import play_us.client.rpc.Grooveshark;
import play_us.client.rpc.GroovesharkAsync;
import play_us.client.rpc.Soundcloud;
import play_us.client.rpc.SoundcloudAsync;
import play_us.client.rpc.Spotify;
import play_us.client.rpc.SpotifyAsync;
import play_us.shared.domain.GetCountry;
import play_us.shared.domain.GetSongSearchResults;
import play_us.shared.domain.Song;
import play_us.shared.domain.Track;
import play_us.shared.domain.facebook.User;
import play_us.shared.domain.googledrive.FileItem;
import play_us.shared.domain.googledrive.Files;
import play_us.shared.domain.spotify.TrackSpotify;


import com.gargoylesoftware.htmlunit.javascript.host.Window;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.DoubleClickEvent;
import com.google.gwt.event.dom.client.DoubleClickHandler;
import com.google.gwt.event.dom.client.EndedEvent;
import com.google.gwt.event.dom.client.EndedHandler;
import com.google.gwt.media.client.Audio;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.TabLayoutPanel;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.sun.java.swing.plaf.windows.resources.windows;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Play_US implements EntryPoint {
	//Servicios
	private final SoundcloudAsync soundcloud = GWT.create(Soundcloud.class);
	private final GroovesharkAsync grooveshark = GWT.create(Grooveshark.class);
	private final SpotifyAsync spotify = GWT.create(Spotify.class);
	private final FacebookServiceAsync facebook = GWT.create(FacebookService.class);
	private final GoogleDriveAsync googleDrive = GWT.create(GoogleDrive.class);

	//Esquema basico
	private final Unit unidad = Unit.PCT;
	private final DockLayoutPanel titulo = new DockLayoutPanel(unidad);
	private final TabLayoutPanel izquierda = new TabLayoutPanel(1.5, Unit.EM);
	private final TabLayoutPanel centro = new TabLayoutPanel(1.5, Unit.EM);{
		centro.setAnimationDuration(500);
	}
	private final TabLayoutPanel derecha = new TabLayoutPanel(1.5, Unit.EM);
	private final HorizontalPanel reproductor = new HorizontalPanel();
	
	//Izquierda
	private final VerticalPanel facebookPanel = new VerticalPanel();
	private TextArea comentario = new TextArea();{
		comentario.setCharacterWidth(30);
		comentario.setVisibleLines(5);
	}
	private Button comentarFacebook = new Button("Comentar");
	
	//Centro
	
	//Inicio
	private VerticalPanel inicio = new VerticalPanel();{
		inicio.setWidth("100%");
	}
	
	private HorizontalPanel buscador = new HorizontalPanel();
	private HorizontalPanel searchPanel = new HorizontalPanel();
	private Button searchButton = new Button("Search");
	private TextBox searchField = new TextBox();	 
	private Label searchStatus = new Label();
	private ListBox searchServer = new ListBox();{
		searchServer.addItem("SoundCloud");
		searchServer.addItem("GrooveShark");
		searchServer.addItem("Spotify");
		searchServer.addItem("Google Drive");
	}
	private ListBox resultadoBusqueda = new ListBox();{
		resultadoBusqueda.setVisibleItemCount(20);
		resultadoBusqueda.setVisible(false);
		resultadoBusqueda.setWidth("100%");
	}
	//Configuracion
	private Configuracion configuracion = new Configuracion();
	
	//Reproductor
	private Reproductor r = new Reproductor();
		
	//Auxiliares
	private List<String> urlBusqueda = new ArrayList<String>();
	
	//private String ip = "85.56.8.79 ";
	private GetCountry country = null;
	private String sesionID = "";
	
	
	//private Integer refresco = 1000;
		
	public void onModuleLoad() {
		cargaIzquierda();
		cargarCentro();
		cargarDerecha();
		cargarReproductor();
		
		
		DockLayoutPanel p = new DockLayoutPanel(unidad);
		p.addNorth(titulo, 15);
		p.addSouth(reproductor, 15);
		p.addWest(new SimplePanel(), 2.5);
		p.addWest(izquierda, 20);
		p.addWest(new SimplePanel(), 2.5);
		p.addWest(centro, 50);
		p.addWest(new SimplePanel(), 2.5);
		p.addWest(derecha, 20);
		RootLayoutPanel.get().add(p);

		grooveshark.getCountry(new AsyncCallback<GetCountry>() {
			public void onFailure(Throwable caught) {
				
			}
			public void onSuccess(GetCountry result) {
				country = result;
			}
		});
		
		grooveshark.getIDSesion(new AsyncCallback<String>() {
			public void onFailure(Throwable caught) {				
			}
			public void onSuccess(String result) {
				sesionID = result;
				
			}
		});
		
		//Acciones
		searchButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				searchStatus.setText("Buscando..");
				buscar();
			}
		});
		
		resultadoBusqueda.addDoubleClickHandler(new DoubleClickHandler() {
			public void onDoubleClick(DoubleClickEvent event) {
				añadirAListaDeReproduccion();				
			}
		});
		
		comentarFacebook.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				comentarEnFacebook(comentario.getText());				
			}
		});
	}
	
	public void comentarEnFacebook(String texto){
		//String token = null;
		String token = configuracion.getTokenFacebook();
		if(token==null){
			com.google.gwt.user.client.Window.alert("Debes de estar logeado.");
		}else{
			facebook.publicarEstado(texto, token,new AsyncCallback<Boolean>() {
				public void onFailure(Throwable caught) {					
				}
				public void onSuccess(Boolean result) {
					com.google.gwt.user.client.Window.alert("Comentado");
				}
			});
		}

//		com.google.gwt.user.client.Window.alert(token);
	}
	
	public void añadirAListaDeReproduccion(){
		Integer i = resultadoBusqueda.getSelectedIndex();
		final String title = resultadoBusqueda.getValue(i);
		if(urlBusqueda.get(urlBusqueda.size()-1).compareTo("GrooveShark")==0){
			grooveshark.getURLStreaming(urlBusqueda.get(i), country, sesionID, new AsyncCallback<String>() {
				public void onFailure(Throwable caught) {
					com.google.gwt.user.client.Window.alert("Error al pedir la url al servidor de grooveshark:"+caught.getMessage());
				}
				public void onSuccess(String result) {
					r.addSong(result, title);
				}
			});
		}else{
			r.addSong(urlBusqueda.get(i), title);
		}
	}
	
	public void buscar(){
		searchStatus.setText("Buscando...");
		resultadoBusqueda.setVisible(true);
		resultadoBusqueda.clear();
		urlBusqueda.clear();
		String query = searchField.getText();
		String servidor = searchServer.getItemText(searchServer.getSelectedIndex());
		if(servidor.compareTo("SoundCloud")==0){
			soundcloud.getTracks(query, 0, 20, new AsyncCallback<List<Track>>() {
				@Override
				public void onFailure(Throwable caught) {searchStatus.setText("");	}
				public void onSuccess(List<Track> result) {
					for(Track t:result){
						resultadoBusqueda.addItem(t.getTitle());
						if(t.getStreamable()){
							urlBusqueda.add(t.getStream_url()+"?client_id=YOUR_CLIENT_ID");
						}else{
							urlBusqueda.add(t.getDownload_url()+"?client_id=YOUR_CLIENT_ID");
						}
						
					}
					urlBusqueda.add("SoundCloud");
					searchStatus.setText("");
				}							
			});
		}else if(servidor.compareTo("GrooveShark")==0){
			grooveshark.getSongSearchResults(query, 20, 0, country, new AsyncCallback<GetSongSearchResults>() {
				public void onFailure(Throwable caught) {searchStatus.setText("");}
				public void onSuccess(GetSongSearchResults result) {
					for(Song s:result.getResult().getSongs()){
						resultadoBusqueda.addItem(s.getSongName());
						urlBusqueda.add(s.getSongID().toString());
					}
					urlBusqueda.add("GrooveShark");
					searchStatus.setText("");
				}
			});			
		}else if(servidor.compareTo("Spotify")==0){
			spotify.buscaCancion(query, new AsyncCallback<TrackSpotify>() {
				public void onFailure(Throwable caught) {
					searchStatus.setText("");
				}
				public void onSuccess(TrackSpotify result) {
					int i = 0;
					while(i<20||result.getTracks().size()>i){
						resultadoBusqueda.addItem(result.getTracks().get(i).getName());
						urlBusqueda.add("");
						i++;
					}
					searchStatus.setText("");
				}
			});
		}else if(servidor.compareTo("Google Drive")==0){
			if(configuracion.getTokenGoogleDrive()==null){
				configuracion.loginGoogleDrive();
				searchStatus.setText("");
			}else{
				googleDrive.getMusica(query, configuracion.getTokenGoogleDrive(), new AsyncCallback<Files>() {
					public void onFailure(Throwable caught) {
						searchStatus.setText("");						
					}
					public void onSuccess(Files result) {
						int i = 0;					
						while(i<20||result.getItems().size()>i){
							resultadoBusqueda.addItem(result.getItems().get(i).getTitle());
							//urlBusqueda.add("");
							urlBusqueda.add(result.getItems().get(i).getWebContentLink());
							i++;
						}
						searchStatus.setText("");
					}
				});
			}			
		}
	}
	
	public void cargarReproductor(){
		reproductor.add(r.getReproductor());
	}
	
	public void cargarCentro(){
		centro.add(inicio, "Inicio");
		centro.add(configuracion.getConfiguracionPanel(), "Configuracion");
		centro.add(Informacion.getDescripcionHTML(), "Informacion");
		cargaInicio();
	}
	
	public void cargaIzquierda(){
		izquierda.add(facebookPanel, "FaceBook");
		facebookPanel.add(comentario);
		facebookPanel.add(comentarFacebook);
	}
	
	public void cargaInicio(){
		buscador.add(searchField);
		buscador.add(searchButton);
		buscador.add(searchServer);
		buscador.add(searchStatus);
		inicio.add(buscador);
		inicio.add(resultadoBusqueda);
	}	
	
	public void cargarDerecha(){
		derecha.add(r.getListaReproduccion(), "Lista de reproducción");
	}
}