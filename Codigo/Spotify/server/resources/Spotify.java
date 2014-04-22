package aiss.server.resources;

import java.util.Arrays;
import java.util.Collection;

import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import aiss.shared.domain.spotify.Track;

public class Spotify {
	
	private String uri = "http://ws.spotify.com/search/1/track.json?q=";
	
	public Collection<Track> getCanciones(String cancion){
		
		Track[] lista = null;
		try{
			ClientResource cr = new ClientResource(uri+cancion);
			cr.get(Track[].class);
		}catch(ResourceException e){
			
			System.out.print("no se ha podido encontrar la cancion");
		}
		return Arrays.asList(lista);
	}
	

}
