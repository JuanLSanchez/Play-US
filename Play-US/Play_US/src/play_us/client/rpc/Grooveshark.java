package play_us.client.rpc;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;


import play_us.shared.domain.GetCountry;
import play_us.shared.domain.GetSongSearchResults;

@RemoteServiceRelativePath("GrooveShark")
public interface Grooveshark extends RemoteService{
	
	public GetSongSearchResults getSongSearchResults(String query, Integer limit, Integer offset, GetCountry country);
	public GetCountry getCountry(String ip);
	public String getIDSesion();
	public String getURLStreaming(String songID, GetCountry country, String sesionID);
	public GetCountry getCountry();
	
}
