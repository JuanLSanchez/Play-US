package play_us.client;

import com.google.api.gwt.oauth2.client.Auth;
import com.google.api.gwt.oauth2.client.AuthRequest;
import com.google.gwt.core.client.Callback;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class Configuracion {
	private VerticalPanel configuracion = new VerticalPanel();
	
	
	//Facebook
	private HorizontalPanel facebookPanel = new HorizontalPanel();{
		facebookPanel.setHeight("4em");
	}
	private final String FACEBOOKAUTH_URL = "https://www.facebook.com/dialog/oauth";
	private final String FACEBOOKCLIENT_ID = "283942228434048";
	private AuthRequest re = new AuthRequest(FACEBOOKAUTH_URL,FACEBOOKCLIENT_ID).withScopes("publish_actions","publish_stream").withScopeDelimiter(",");
	private Label facebookName = new Label("Facebook: ");
	private Button facebookButton;
	private String tokenFacebook=null;
	
	//Google Drive
	private HorizontalPanel drivePanel = new HorizontalPanel();{
		drivePanel.setHeight("4em");
	}
	private final String GOOGLEAUTH_URL = "https://accounts.google.com/o/oauth2/auth";
	private final String GOOGLECLIENT_ID = "87712784666-cnnfv7pdkh4lbe82181iisobg877csvd.apps.googleusercontent.com";
	private final String GOOGLEDRIVE_SCOPE = "https://www.googleapis.com/auth/drive";
	private Label driveName = new Label("Google Drive: ");
	private Button driveButton;
	private String tokenGoogleDrive= null;
	
	private static final Auth AUTH 	= Auth.get();
	
	
	public Configuracion(){
		cargaFacebook();
		cargaGoogleDrive();
		
		//Acciones
		facebookButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				loginFacebook();
			}
		});
		
		driveButton.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				loginGoogleDrive();
			}
		});
		
	}
	
	public VerticalPanel getConfiguracionPanel(){
		return configuracion;
	}
	
	public void loginGoogleDrive(){
		final AuthRequest req = new AuthRequest(GOOGLEAUTH_URL, GOOGLECLIENT_ID).withScopes(GOOGLEDRIVE_SCOPE);
  	  AUTH.login(req, new Callback<String, Throwable>() {
			public void onFailure(Throwable reason) {
			}
			public void onSuccess(String result) {
				tokenGoogleDrive = result;
				driveButton.setText("Logout");
			}
		});
	}
	
	public void loginFacebook(){
		AUTH.login(re, new Callback<String, Throwable>() {
			public void onFailure(Throwable reason) {	
			}
			public void onSuccess(String result) {
				tokenFacebook = result;
				facebookButton.setText("Logout");				
			}
		});
	}
	
	public void logoutFacebook(){
		tokenFacebook = null;
		facebookButton.setText("Login");
	}
	
	public void logoutGoogleDrive(){
		tokenGoogleDrive = null;
		driveButton.setText("Login");
	}
	
	public String getTokenFacebook(){ return tokenFacebook;}
	public String getTokenGoogleDrive(){return tokenGoogleDrive;}
	
	public void cargaFacebook(){
		if(tokenFacebook==null){
			facebookButton = new Button("Login");			
		}else{
			facebookButton = new Button("Logout");
		}
		facebookPanel.add(facebookName);
		facebookPanel.add(facebookButton);
		configuracion.add(facebookPanel);
	}
	public void cargaGoogleDrive(){
		if(tokenGoogleDrive==null){
			driveButton = new Button("Login");
		}else{
			driveButton = new Button("Logout");
		}
		drivePanel.add(driveName);
		drivePanel.add(driveButton);
		configuracion.add(drivePanel);
	}
}
