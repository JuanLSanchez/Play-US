package twitter.server.resources;



import java.util.List;
import twitter4j.Paging;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import twitter4j.auth.RequestToken;

public class TwitterResource {

	private static Twitter session;
	private static RequestToken reqToken;
	private Paging paging;
	private static final String CONSUMER_KEY = "ehVE8HZkUoSON4yZcGEo9RqmA";
	private static final String CONSUMER_SECRET = "gFEFwTjZCarzNaeyCHa8agpeFiZsVtTT4ytq8aHIZO3GV7BMT1";
	public boolean inicioSesion = false;

	public TwitterResource() {
		session = new TwitterFactory().getInstance();
		session.setOAuthConsumer(CONSUMER_KEY, CONSUMER_SECRET);
		this.paging = new Paging();
	}

	public String inicioSesion() {
		String res = "";
		try {
			reqToken = session.getOAuthRequestToken();			
			res = reqToken.getAuthorizationURL();
		} catch (TwitterException e) {
			res = e.getMessage();
		}
		return res;
	}

	public List<Status> getTimeLine(Integer numTweets) {
		List<Status> res = null;
		try {
			paging.setCount(numTweets);			
			res = session.getUserTimeline(paging); //tweets escritos por el usuario
			
		} catch (TwitterException e) {
			System.out.println("Error al obtener el Timeline: "
					+ e.getMessage());
		}

		return res;
	}
	
	public List<Status> getTimeLine() {
		List<Status> res = null;
		
		try {			
			res = session.getUserTimeline();//timeline usuario devuelve 20
			
		} catch (TwitterException e) {
			System.out.println("Error al obtener el Timeline: "
					+ e.getMessage());
		}

		return res;
	}

	public void login(String verifier) {
		try {
			inicioSesion=true;
			AccessToken access = session
					.getOAuthAccessToken(reqToken, verifier);
			session.setOAuthAccessToken(access);
		} catch (TwitterException e) {
			System.out.println(e.getMessage());
		}

	}
	
	public Status escribirTweetR(String mensaje){
		Status status = null;					
		try {				
			status = session.updateStatus(mensaje);			
		}catch(TwitterException e) {			
			System.out.print("Error al postear en resource " + e.getMessage());
		}	
		return status;
	}
	
	
}
