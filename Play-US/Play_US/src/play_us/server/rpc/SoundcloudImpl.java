package play_us.server.rpc;


import java.util.ArrayList;
import java.util.List;
import play_us.client.rpc.Soundcloud;
import play_us.server.resources.SoundcloudResource;
import play_us.shared.domain.Track;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

@SuppressWarnings("serial")
public class SoundcloudImpl extends RemoteServiceServlet implements Soundcloud{
	
	private SoundcloudResource scr = new SoundcloudResource();
	@Override
	public List<Track> getTracks(String filter, Integer pagina,
			Integer canciones) {
		return scr.getTracks(filter, pagina, canciones);
	}

	@Override
	public List<String> getTitulos(String filter, Integer pagina,
			Integer canciones) {
		List<String> res = new ArrayList<String>();
		for(Track t:this.getTracks(filter, pagina, canciones)){
			res.add(t.getTitle());
		}
		return res;
	}
	
	
	
	

}
