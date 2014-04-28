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
import com.google.gson.JsonSyntaxException;

import play_us.shared.domain.GetCountry;
import play_us.shared.domain.GetSongSearchResults;
import play_us.shared.domain.GetStreamKeyStreamServer;
import play_us.shared.domain.StartSession;

public class GroovesharkResource{
	
	private static final String KEY = "mashup_juansp";
	private static final String SECRET = "31a0fe43550bd1758fbccc9699bbf331";
	private static final String uri = "https://api.grooveshark.com/ws/3.0/?sig=";
	private static final Gson gson = new Gson();
	
	public String getSignatures(String message){
		return hmacDigest(message, SECRET, "HmacMD5");
	}
	
	public GetSongSearchResults getSongSearchResults(String query, Integer limit, Integer offset, GetCountry country){
		
		GetSongSearchResults res = null;
		ClientResource cr = null;
		String post = "{\"method\":\"getSongSearchResults\",\"header\":{\"wsKey\":\"" + 
						KEY + "\"},\"parameters\":{\"query\":\"" + query + 
						"\",\"country\":" + country.getResult() + ",\"limit\":\"" + limit + 
						"\",\"offset\":\"" + offset + "\"}}";
//		String post = "{\"method\":\"getSongSearchResults\",\"header\":{\"wsKey\":\""+ KEY
//						+ "\"},\"parameters\":{\"query\":\""+query
//						+"\",\"country\":\"\",\"limit\":\""+limit
//						+"\",\"offset\":\""+offset+"\"}}";
		String sig = getSignatures(post);

		cr = new ClientResource(uri+sig);
		try {
			
			res = gson.fromJson(cr.post(post).getText(), 
					GetSongSearchResults.class);
		} catch (JsonSyntaxException e) {
			e.printStackTrace();
		} catch (ResourceException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
		return res;
	}
	
	public StartSession getStartSession(){
		StartSession res = null;
		String post = "{\"method\":\"startSession\",\"header\":{\"wsKey\":\"" + 
						KEY + "\"},\"parameters\":[]}";
		String sig = getSignatures(post);
		ClientResource cr = new ClientResource(uri + sig);
		try {
			res = gson.fromJson(cr.post(post).getText(),
					StartSession.class);
		} catch (JsonSyntaxException e) {
			e.printStackTrace();
		} catch (ResourceException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return res;
	}
	
	public GetCountry getCountry(String ip){
		GetCountry res = null;
		String post = "{\"method\":\"getCountry\",\"header\":{\"wsKey\":\"" + 
							KEY + "\"},\"parameters\":{\"ip\":\"" +
							ip + "\"}}";
		ClientResource cr = new ClientResource(uri + getSignatures(post));
		try {
			res = gson.fromJson(cr.post(post).getText(), 
								GetCountry.class);
		} catch (JsonSyntaxException e) {
			e.printStackTrace();
		} catch (ResourceException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return res;
	}
	
	public GetCountry getCountry(){
		GetCountry res = null;
		String post = "{\"method\":\"getCountry\",\"header\":{\"wsKey\":\"" + 
							KEY + "\"},\"parameters\":[]}";
		ClientResource cr = new ClientResource(uri + getSignatures(post));
		try {
			res = gson.fromJson(cr.post(post).getText(), 
								GetCountry.class);
		} catch (JsonSyntaxException e) {
			e.printStackTrace();
		} catch (ResourceException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return res;
	}
	
	public GetStreamKeyStreamServer getGetStreamKeyStreamServer(String songID, GetCountry country, String sesionID ){
		GetStreamKeyStreamServer res = null;
		String post = "{\"method\":\"getStreamKeyStreamServer\",\"header\":{\"wsKey\":\"" + KEY 
						+ "\",\"sessionID\":\"" + sesionID + "\"},\"parameters\":{\"songID\":\"" + songID + 
						"\",\"country\":"+country.getResult()+",\"lowBitrate\":\"\"}}";
		ClientResource cr = new ClientResource( uri + getSignatures(post));
		try {
			res = gson.fromJson(cr.post(post).getText(), 
								GetStreamKeyStreamServer.class);
		} catch (JsonSyntaxException e) {
			e.printStackTrace();
		} catch (ResourceException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
		return res;
	}
	
	//From: http://www.supermind.org/blog/1102/generating-hmac-md5-sha1-sha256-etc-in-java
	private String hmacDigest(String msg, String keyString, String cifrado) {
	    String digest = null;
	    try {
	      SecretKeySpec key = new SecretKeySpec((keyString).getBytes("UTF-8"), cifrado);
	      Mac mac = Mac.getInstance(cifrado);
	      mac.init(key);

	      byte[] bytes = mac.doFinal(msg.getBytes("ASCII"));

	      StringBuffer hash = new StringBuffer();
	      for (int i = 0; i < bytes.length; i++) {
	        String hex = Integer.toHexString(0xFF & bytes[i]);
	        if (hex.length() == 1) {
	          hash.append('0');
	        }
	        hash.append(hex);
	      }
	      digest = hash.toString();
	    } catch (UnsupportedEncodingException e) {
	    } catch (InvalidKeyException e) {
	    } catch (NoSuchAlgorithmException e) {
	    }
	    return digest;
	  }
	
}
