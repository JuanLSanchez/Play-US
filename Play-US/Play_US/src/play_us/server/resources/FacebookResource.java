package play_us.server.resources;

import org.restlet.resource.ClientResource;

import play_us.shared.domain.facebook.User;

import com.google.api.gwt.oauth2.client.Auth;
import com.google.gwt.user.client.Window;




public class FacebookResource {
	
	private String url = "https://graph.facebook.com/";
//	private static final Auth AUTH 	= Auth.get();
	private final String FACEBOOKAUTH_URL = "https://www.facebook.com/dialog/oauth/";
	private final String FACEBOOKCLIENT_ID = "283942228434048";
	
	public User getUsuario(String token){
		User res = null;
		ClientResource cr = new ClientResource(url+"me?access_token="+token);
		res = cr.get(User.class);
		return res;
		
	}
	
	public boolean publicarEstado(String message, String token){
		boolean res=true;
		ClientResource cr = new ClientResource(url+"me/feed?message="+message+"&access_token="+token);
		cr.post("");		
		res = true;
		return res;
	}

}
