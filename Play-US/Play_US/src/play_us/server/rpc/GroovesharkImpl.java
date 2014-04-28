package play_us.server.rpc;


import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import play_us.client.rpc.Grooveshark;
import play_us.server.resources.GroovesharkResource;
import play_us.shared.domain.GetCountry;
import play_us.shared.domain.GetSongSearchResults;
@SuppressWarnings("serial")
public class GroovesharkImpl extends RemoteServiceServlet implements Grooveshark{
	
	private GroovesharkResource gr = new GroovesharkResource();
	
	public GetSongSearchResults getSongSearchResults(String query, Integer limit, Integer offset, GetCountry country){
		return gr.getSongSearchResults(query, limit, offset, country);
	}
	
	public GetCountry getCountry(String ip){
		return gr.getCountry(ip);
	}
	
	public GetCountry getCountry(){
		return gr.getCountry();
	}
	
	public String getIDSesion(){
		return gr.getStartSession().getResult().getSessionID();
	}
	
	public String getURLStreaming(String songID, GetCountry country, String sesionID){
		return gr.getGetStreamKeyStreamServer(songID, country, sesionID).getResult().getUrl();		
	}

}
