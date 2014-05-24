package twitter.client;

import java.util.HashMap;
import java.util.Map;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Twitter implements EntryPoint {
	static HorizontalPanel menu = new HorizontalPanel();

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		go("init", new HashMap<String, Object>());
	}

	public static void go(String token) {
		Twitter.go(token, new HashMap<String, Object>());
	}

	// FLOW MANAGEMENT
	public static void go(String token, Map<String, Object> params) {
		RootPanel p = RootPanel.get();
		if (token.equals("init")) {
			p.clear();
			menu.clear();
			p.add(menu);
			menu.add(new TwitterListView(params));
		}
	}
}
