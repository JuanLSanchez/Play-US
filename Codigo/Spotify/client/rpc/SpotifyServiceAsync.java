package aiss.client.rpc;

import java.util.Collection;

import aiss.shared.domain.spotify.Track;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface SpotifyServiceAsync {
	
	void getCanciones(String artist, AsyncCallback<Collection<Track>> callback);

}
