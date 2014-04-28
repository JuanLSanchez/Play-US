package play_us.server.rpc;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import play_us.client.rpc.FacebookService;
import play_us.server.resources.FacebookResource;
import play_us.shared.domain.facebook.User;

@SuppressWarnings("serial")
public class FacebookImpl extends RemoteServiceServlet implements FacebookService{

	private FacebookResource fr = new FacebookResource();
	

	@Override
	public User getUsuario(String Token) {
		return fr.getUsuario(Token);
	}

	@Override
	public boolean publicarEstado(String message, String token) {
		return fr.publicarEstado(message, token);
	}
	
	

}
