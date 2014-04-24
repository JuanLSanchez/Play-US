package aiss.client;

import aiss.shared.domain.spotify.Track;


import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("mashup")
public interface SpotifyService extends RemoteService {
	Track buscaCancion(String cancion);
	
	
	
	
	
}
	