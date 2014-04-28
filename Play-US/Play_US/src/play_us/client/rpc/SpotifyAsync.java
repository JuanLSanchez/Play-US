package play_us.client.rpc;

import play_us.shared.domain.spotify.TrackSpotify;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface SpotifyAsync {

	void buscaCancion(String cancion, AsyncCallback<TrackSpotify> callback);

}
