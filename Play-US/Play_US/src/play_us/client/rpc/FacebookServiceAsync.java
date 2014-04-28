package play_us.client.rpc;


import play_us.shared.domain.facebook.User;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface FacebookServiceAsync {

	void getUsuario(String Token, AsyncCallback<User> callback);

	void publicarEstado(String message, String token,
			AsyncCallback<Boolean> callback);

}
