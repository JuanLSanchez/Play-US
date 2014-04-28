package play_us.client.rpc;



import play_us.shared.domain.facebook.User;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("FaceBook")
public interface FacebookService extends RemoteService{

	public User getUsuario(String Token);
	public boolean publicarEstado(String message, String token);
	
}
