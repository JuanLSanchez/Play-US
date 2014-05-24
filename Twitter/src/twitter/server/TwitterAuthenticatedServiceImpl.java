package twitter.server;

import java.util.ArrayList;

import java.util.List;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import twitter.client.services.TwitterAuthenticatedService;
import twitter.server.resources.TwitterResource;
import twitter4j.Status;


public class TwitterAuthenticatedServiceImpl extends RemoteServiceServlet
		implements TwitterAuthenticatedService {

	private static final long serialVersionUID = 1262498418355584663L;
	private static TwitterResource rs;	

	private void logueado(String url) {
		String[] tokens = url.split("&");
		String token = tokens[0]; // Subido al servidor es 0, en local es 1
		String verifier = tokens[1]; // Subido al server es 1, en local es 2
		String[] a = token.split("=");
		String[] b = verifier.split("=");
		rs.login(b[1]);

	}

	@Override
	public String inicioSesion() {
		rs = new TwitterResource();
		String res = rs.inicioSesion();
		return res;

	}

	@Override
	public String escribirTweet(String url, String mensaje) {
		String res = "";
		if(rs.inicioSesion!=true){
			logueado(url);
		}
		//logueado(url);		
		res = "se ha escrito";		
		rs.escribirTweetR(mensaje);			
		return res;
	}

	@Override
	public List<String> getTimeLineS(String url, Integer numTweets) {
		List<String> res = new ArrayList<String>();
		try{
			if(rs.inicioSesion!=true){
				logueado(url);
			}
			for (Status stat : rs.getTimeLine(numTweets)) {
				res.add(stat.getText());
			}
		}catch(Exception e){
			
		}
		return res;
	}

	
}
