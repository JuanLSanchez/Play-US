package aiss.client.rpc;

import java.util.Collection;

import aiss.shared.domain.spotify.Track;

import com.google.gwt.user.client.rpc.RemoteService;

public interface SpotifyService extends RemoteService{
	
	Collection<Track> getCanciones(String cancion);

}
