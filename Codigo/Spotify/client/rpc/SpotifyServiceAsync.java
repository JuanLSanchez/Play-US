package aiss.client;

import aiss.shared.domain.spotify.Track;


import com.google.gwt.user.client.rpc.AsyncCallback;


public interface SpotifyServiceAsync {

	void buscaCancion(String cancion, AsyncCallback<Track> callback);
	
}
