package play_us.server.resources;

import java.net.URLEncoder;
import java.util.Arrays;
import java.util.List;

import org.restlet.resource.ClientResource;

import play_us.shared.domain.Track;

public class SoundcloudResource {

	private static final String CLIENT_ID = "3989c2f241c8e4776d091b30d658a6a8";
	private static final String CLIENT_SECRET = "1ca36b3d14f05e0e89ddd7da02b090e5";
	private static final String uri = "https://api.soundcloud.com";
	
	public List<Track> getTracks(String filter, Integer pagina,
			Integer canciones) {
		@SuppressWarnings("deprecation")
		ClientResource cr = null;
		Track[] lista = null;
		
		cr = new ClientResource(uri + "/tracks.json?client_id="+CLIENT_ID+
				"&limit="+canciones+
				"offset="+canciones*pagina
				+"&q="+URLEncoder.encode(filter)
				+"&filter=downloadable");
		lista = cr.get(Track[].class);			
		
		return Arrays.asList(lista);
	}
}
