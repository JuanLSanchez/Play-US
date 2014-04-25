package aiss.server.rpc;

import java.util.Collection;

import aiss.client.rpc.SpotifyService;
import aiss.server.resources.SpotifyResource;
import aiss.shared.domain.spotify.Track;
import aiss.shared.domain.spotify.Tracks;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class SpotifyImpl extends RemoteServiceServlet implements SpotifyService{

	SpotifyResource sr = new SpotifyResource();
	
	public Collection<Tracks> getCanciones(String cancion) {
		
		return sr.getCanciones(cancion);
	}

}
