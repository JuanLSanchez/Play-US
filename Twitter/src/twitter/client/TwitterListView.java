package twitter.client;

import java.util.List;
import java.util.Map;
import twitter.client.services.TwitterAuthenticatedService;
import twitter.client.services.TwitterAuthenticatedServiceAsync;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class TwitterListView extends Composite {
	private VerticalPanel mainPanel;
	private final FlexTable filesTable;
	

	private final TwitterAuthenticatedServiceAsync twitterService = GWT
			.create(TwitterAuthenticatedService.class);

	public TwitterListView(Map<String, Object> params) {

		mainPanel = new VerticalPanel();
		initWidget(mainPanel);

		Button buttonT = new Button("Iniciar sesión en Twitter");	
		Button time = new Button("Timeline");
		final TextBox texto = new TextBox();
		texto.setMaxLength(140);
		Button buttonWrite = new Button("Escribir un tweet de prueba");		
		
		final Label labelGD = new Label("");

		filesTable = new FlexTable();
		// TABLE AND HEADER
		filesTable.setStylePrimaryName("filesTable");
		filesTable.getRowFormatter().setStylePrimaryName(0, "firstRow");
		filesTable.setWidget(0, 0, new Label("Tweets"));		
		

		buttonT.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				twitterService.inicioSesion(new AsyncCallback<String>() {

					@Override
					public void onSuccess(String result) {
						Window.Location.replace(result);
						
					}

					@Override
					public void onFailure(Throwable caught) {
						Window.alert("Error: " + caught.getMessage());

					}
				});
			}
		});

		time.addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				mostrarTimeLine();				
			}			
		});		
		
		buttonWrite.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				twitterService.escribirTweet(getURL(), texto.getText(), new AsyncCallback<String>() {

					public void onFailure(Throwable caught) {
						Window.alert("No se ha podido enviar el tweet vuelva a iniciar sesión");						
					}
					public void onSuccess(String result) {
						mostrarTimeLine();
						
					}
				});
				
			}
		});
		

		mainPanel.add(buttonT);
		mainPanel.add(time);
		mainPanel.add(labelGD);		
		mainPanel.add(filesTable);
		mainPanel.add(texto);
		mainPanel.add(buttonWrite);
		
		
	}
	
	void mostrarTimeLine(){
		twitterService.getTimeLineS(getURL(),4 ,new AsyncCallback<List<String>>() {
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				
			}
			public void onSuccess(List<String> result) {
				// TODO Auto-generated method stub
				mostrarTweet(result);			
			}
			
		});
	}
	
	void mostrarTweet(List<String> result) {
		int i = 0;
		for(String s: result){
			if(result!=null){
				filesTable.setWidget(i + 1, 0, new Label(s));
				i++;
			}
		}		
	}	
	
	public static native String getURL() /*-{
		return $wnd.location.href;
	}-*/;
}
