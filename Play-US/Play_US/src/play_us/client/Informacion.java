package play_us.client;

import com.google.gwt.user.client.ui.HTMLPanel;



public class Informacion {
	static String d1 = "Hay ocasiones en las que la canción que buscamos no se encuentra en nuestro reproductor de musica online. Otras veces tenemos varias canciones que nos gustan, pero hay una que no esta en nuestro reproductor preferido, por lo que no podemos hacer listas de reproducciones de todas las canciones que deseamos. Algunas veces deseamos hacer un comentario en alguna red social, sobre la canción que estamos escuchando, y en ese momento no estamos metido en ella.";
	static String d2 = "Para la solución de esos problemas y más vamos a realizar una aplicación que englobe los 3 reproductores principales de musica online: Grooveshark, SoundCloud y Spotify. También vamos ha conectar dos redes sociales: Twitter y Facebook. Podremos realizar listas de reproducciones con canciones de diferentes reproductores, hacer comentarios mientras estamos escuchando nuestras canciones sin tener que abrir otra pestaña e incluso mencionar nuestra canción en nuestro comentario con el símbolo |> .";
	static String d3 = "Con todo esto, agrupamos lo mejor de cada reproductor en un mismo sitio web, además con la posibilidad de realizar comentarios.";
	static String d4 = "Como servicios vamos a ofrecer la posibilidad de realizar búsquedas de canciones, devolveremos una lista de canciones y en que servidor la podemos encontrar. También se podrá realizar la búsqueda de canciones en servidores concretos.";
	
	public static HTMLPanel getDescripcionHTML(){
		HTMLPanel ph = new HTMLPanel("<p>"+d1+"<br>"+d2+"<br>"+d3+"<br>"+d4+"</p>");
		ph.setWidth("100pct");
		return ph;
	}
}
