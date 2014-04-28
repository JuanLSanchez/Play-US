package play_us.client;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.TabLayoutPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class Maqueta {
	public DockLayoutPanel titulo;
	public DockLayoutPanel reproductor;
	public TabLayoutPanel izquierda;
	public TabLayoutPanel centro;
	public VerticalPanel inicio;
	
	public TabLayoutPanel derecha;
	public DockLayoutPanel p;
	public Unit unidad;
	
	public Maqueta(){
		unidad = Unit.PCT;
		
		titulo = new DockLayoutPanel(unidad);
		
		reproductor = new DockLayoutPanel(unidad);
		
		izquierda = new TabLayoutPanel(1.5, Unit.EM);
		izquierda.add(new SimplePanel(), "Sound Cloud");
		izquierda.add(new SimplePanel(), "Grooveshark");
		izquierda.add(new SimplePanel(), "Spotify");
		
		inicio = new VerticalPanel();
		centro = new TabLayoutPanel(1.5, Unit.EM);
		centro.add(inicio, "Inicio");
		centro.add(new SimplePanel(), "Configuracion");
		centro.add(Informacion.getDescripcionHTML(), "Informacion");

		derecha = new TabLayoutPanel(1.5, Unit.EM);;
		derecha.add(new SimplePanel(), "Lista de reproducción");
		
		p = new DockLayoutPanel(unidad);
		p.addNorth(titulo, 15);
		p.addSouth(reproductor, 15);
		p.addWest(new SimplePanel(), 2.5);
		p.addWest(izquierda, 20);
		p.addWest(new SimplePanel(), 2.5);
		p.addWest(centro, 50);
		p.addWest(new SimplePanel(), 2.5);
		p.addWest(derecha, 20);
	}
	
	public DockLayoutPanel getPanel(){
		return p;
	}
	
	public void añadirCentro(Widget wid){
		inicio.add(wid);
		
	}

}
