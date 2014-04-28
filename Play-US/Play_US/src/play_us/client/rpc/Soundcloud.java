package play_us.client.rpc;

import java.util.List;

import play_us.shared.domain.Track;


import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("SoundCloud")
public interface Soundcloud extends RemoteService{
	public List<Track> getTracks(String filter, Integer pagina, Integer canciones);
	public List<String> getTitulos(String filter, Integer pagina, Integer canciones);

}
