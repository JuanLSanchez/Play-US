package play_us.server.rpc;

import play_us.client.rpc.Spotify;
import play_us.server.resources.SpotifyResource;
import play_us.shared.domain.spotify.TrackSpotify;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

@SuppressWarnings("serial")
public class SpotifyImpl extends RemoteServiceServlet implements Spotify{
	
	private SpotifyResource sr = new SpotifyResource();
	public TrackSpotify buscaCancion(String cancion) {
		return sr.buscaCancion(cancion);
	}
	
}
