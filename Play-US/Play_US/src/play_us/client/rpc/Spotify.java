package play_us.client.rpc;

import play_us.shared.domain.spotify.TrackSpotify;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("Spotify")
public interface Spotify extends RemoteService{
	
	public TrackSpotify buscaCancion(String cancion);
	
}
