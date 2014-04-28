package play_us.server.resources;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import com.google.gson.Gson;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;

import play_us.client.rpc.FacebookService;
import play_us.client.rpc.FacebookServiceAsync;
import play_us.shared.domain.GetCountry;
import play_us.shared.domain.GetSongSearchResults;
import play_us.shared.domain.GetStreamKeyStreamServer;
import play_us.shared.domain.StartSession;
import play_us.shared.domain.facebook.User;

public class PruebasResoruce {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ResourceException 
	 */
	
	
	
	public static void main(String[] args) throws ResourceException, IOException {
//		String post = "{\"method\":\"getSongSearchResults\",\"header\":{\"wsKey\":\"mashup_juansp\"},\"parameters\":{\"query\":\"cent\",\"country\":\"\",\"limit\":\"5\",\"offset\":\"0\"}}";
//		String sig ="";
//		String url = "http://api.grooveshark.com/ws/3.0/?sig=aa887a01c592148adb119b425c22f2ed";
//		String ep = "http://api.grooveshark.com/ws/3.0/?sig=";
//		String key = "31a0fe43550bd1758fbccc9699bbf331";
//		sig = hmacDigest(post, key, "HmacMD5");
//		System.out.println(url+"\n"+ep+sig);
//		
//		ClientResource cr = new ClientResource(url);
//
//		Gson gson = new Gson();
//		GetSongSearchResults res = gson.fromJson(cr.post(post).getText(), 
//														GetSongSearchResults.class);
//		System.out.println(res.getResult().getSongs().get(3).getSongName());
		
//		GroovesharkResource gr = new GroovesharkResource();
//		String ip = "85.56.8.79";
//		String session = "cafbe3aaf6667fa24941235211be9494";
//		GetCountry country = gr.getCountry(ip);
//		String idSong = "" + gr.getSongSearchResults("cent", 10, 0, country).getResult().getSongs().get(1).getSongID();
//		//GetSongSearchResults search = gr.getSongSearchResults("cent", 10, 0, country);
//		//System.out.println(search.getResult().getSongs().get(0).getSongID());
//		System.out.println(country.getResult());
//		System.out.println(session);
//		GetStreamKeyStreamServer stream = gr.getGetStreamKeyStreamServer(idSong, country, session);
//		System.out.println(stream.getResult().getUrl());
//
		
		String token = "CAAECPnOpnIABABJCNYGILZAauOx97Nz4nyA9InZANHMUNfD5MnEQ38ypvTKxMTm3ZAfuZB0o4McVueQ1jq69P1D2n5VMMKnB13bIdLi4eqdFiVlOAA4va9iyqNsxTcd9zftbrrBT4yX23XhdbNLVNJhk162xlpNZC4hBxc19LP3mepvlkkQykT38c3NeGveJpB2usyF7RSQZDZD";
		FacebookResource fr = new FacebookResource();
		
		String id = fr.getUsuario(token).getId();
		System.out.println(id);
		fr.publicarEstado("prueba5", token);
		
		
		
		
	}
	
}
