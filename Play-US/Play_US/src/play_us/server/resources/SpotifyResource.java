package play_us.server.resources;

import java.net.URLEncoder;

import org.eclipse.jetty.util.UrlEncoded;
import org.restlet.resource.ClientResource;

import play_us.shared.domain.spotify.TrackSpotify;

public class SpotifyResource {
	
	public TrackSpotify buscaCancion(String cancion) {
		ClientResource cr = new ClientResource("http://ws.spotify.com/search/1/track.json?q="+URLEncoder.encode(cancion));
		return cr.get(TrackSpotify.class);
   }

}
