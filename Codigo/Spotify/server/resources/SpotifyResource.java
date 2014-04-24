package aiss.server;

import org.restlet.resource.ClientResource;

import aiss.client.SpotifyService;
import aiss.shared.domain.spotify.Track;


import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class SpotifyResource extends RemoteServiceServlet implements SpotifyService {
	
	
	@Override
	public Track buscaCancion(String cancion) {
		ClientResource cr = new ClientResource("http://ws.spotify.com/search/1/track.json?q="+cancion);
		
		return cr.get(Track.class);
        }
	

	
}
