
package play_us.shared.domain;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Track  implements Serializable{
	private static final long serialVersionUID = 3301373113706564633L;
	
   	private String artwork_url;
   	private String attachments_uri;
   	private String bpm;
   	private Number comment_count;
   	private boolean commentable;
   	private String created_at;
   	private String description;
   	private Number download_count;
   	private boolean downloadable;
   	private Number duration;
   	private String embeddable_by;
   	private Number favoritings_count;
   	private String genre;
   	private Number id;
   	private String isrc;
   	private String key_signature;
   	private String kind;
   	private String label_id;
   	private String label_name;
   	private String license;
   	private Number original_content_size;
   	private String original_format;
   	private String permalink;
   	private String permalink_url;
   	private Number playback_count;
   	private String purchase_title;
   	private String purchase_url;
   	private String release;
   	private String release_day;
   	private String release_month;
   	private String release_year;
   	private String sharing;
   	private String state;
   	private String stream_url;
   	private boolean streamable;
   	private String tag_list;
   	private String title;
   	private String track_type;
   	private String uri;
   	private User user;
   	private Number user_id;
   	private String video_url;
   	private String waveform_url;
    private String download_url;
    
    public String getDownload_url(){
    	return download_url;
    }
    
    public void setDownload_url(String download_url){
    	this.download_url = download_url;
    }

 	public String getArtwork_url(){
		return this.artwork_url;
	}
	public void setArtwork_url(String artwork_url){
		this.artwork_url = artwork_url;
	}
 	public String getAttachments_uri(){
		return this.attachments_uri;
	}
	public void setAttachments_uri(String attachments_uri){
		this.attachments_uri = attachments_uri;
	}
 	public String getBpm(){
		return this.bpm;
	}
	public void setBpm(String bpm){
		this.bpm = bpm;
	}
 	public Number getComment_count(){
		return this.comment_count;
	}
	public void setComment_count(Number comment_count){
		this.comment_count = comment_count;
	}
 	public boolean getCommentable(){
		return this.commentable;
	}
	public void setCommentable(boolean commentable){
		this.commentable = commentable;
	}
 	public String getCreated_at(){
		return this.created_at;
	}
	public void setCreated_at(String created_at){
		this.created_at = created_at;
	}
 	public String getDescription(){
		return this.description;
	}
	public void setDescription(String description){
		this.description = description;
	}
 	public Number getDownload_count(){
		return this.download_count;
	}
	public void setDownload_count(Number download_count){
		this.download_count = download_count;
	}
 	public boolean getDownloadable(){
		return this.downloadable;
	}
	public void setDownloadable(boolean downloadable){
		this.downloadable = downloadable;
	}
 	public Number getDuration(){
		return this.duration;
	}
	public void setDuration(Number duration){
		this.duration = duration;
	}
 	public String getEmbeddable_by(){
		return this.embeddable_by;
	}
	public void setEmbeddable_by(String embeddable_by){
		this.embeddable_by = embeddable_by;
	}
 	public Number getFavoritings_count(){
		return this.favoritings_count;
	}
	public void setFavoritings_count(Number favoritings_count){
		this.favoritings_count = favoritings_count;
	}
 	public String getGenre(){
		return this.genre;
	}
	public void setGenre(String genre){
		this.genre = genre;
	}
 	public Number getId(){
		return this.id;
	}
	public void setId(Number id){
		this.id = id;
	}
 	public String getIsrc(){
		return this.isrc;
	}
	public void setIsrc(String isrc){
		this.isrc = isrc;
	}
 	public String getKey_signature(){
		return this.key_signature;
	}
	public void setKey_signature(String key_signature){
		this.key_signature = key_signature;
	}
 	public String getKind(){
		return this.kind;
	}
	public void setKind(String kind){
		this.kind = kind;
	}
 	public String getLabel_id(){
		return this.label_id;
	}
	public void setLabel_id(String label_id){
		this.label_id = label_id;
	}
 	public String getLabel_name(){
		return this.label_name;
	}
	public void setLabel_name(String label_name){
		this.label_name = label_name;
	}
 	public String getLicense(){
		return this.license;
	}
	public void setLicense(String license){
		this.license = license;
	}
 	public Number getOriginal_content_size(){
		return this.original_content_size;
	}
	public void setOriginal_content_size(Number original_content_size){
		this.original_content_size = original_content_size;
	}
 	public String getOriginal_format(){
		return this.original_format;
	}
	public void setOriginal_format(String original_format){
		this.original_format = original_format;
	}
 	public String getPermalink(){
		return this.permalink;
	}
	public void setPermalink(String permalink){
		this.permalink = permalink;
	}
 	public String getPermalink_url(){
		return this.permalink_url;
	}
	public void setPermalink_url(String permalink_url){
		this.permalink_url = permalink_url;
	}
 	public Number getPlayback_count(){
		return this.playback_count;
	}
	public void setPlayback_count(Number playback_count){
		this.playback_count = playback_count;
	}
 	public String getPurchase_title(){
		return this.purchase_title;
	}
	public void setPurchase_title(String purchase_title){
		this.purchase_title = purchase_title;
	}
 	public String getPurchase_url(){
		return this.purchase_url;
	}
	public void setPurchase_url(String purchase_url){
		this.purchase_url = purchase_url;
	}
 	public String getRelease(){
		return this.release;
	}
	public void setRelease(String release){
		this.release = release;
	}
 	public String getRelease_day(){
		return this.release_day;
	}
	public void setRelease_day(String release_day){
		this.release_day = release_day;
	}
 	public String getRelease_month(){
		return this.release_month;
	}
	public void setRelease_month(String release_month){
		this.release_month = release_month;
	}
 	public String getRelease_year(){
		return this.release_year;
	}
	public void setRelease_year(String release_year){
		this.release_year = release_year;
	}
 	public String getSharing(){
		return this.sharing;
	}
	public void setSharing(String sharing){
		this.sharing = sharing;
	}
 	public String getState(){
		return this.state;
	}
	public void setState(String state){
		this.state = state;
	}
 	public String getStream_url(){
		return this.stream_url;
	}
	public void setStream_url(String stream_url){
		this.stream_url = stream_url;
	}
 	public boolean getStreamable(){
		return this.streamable;
	}
	public void setStreamable(boolean streamable){
		this.streamable = streamable;
	}
 	public String getTag_list(){
		return this.tag_list;
	}
	public void setTag_list(String tag_list){
		this.tag_list = tag_list;
	}
 	public String getTitle(){
		return this.title;
	}
	public void setTitle(String title){
		this.title = title;
	}
 	public String getTrack_type(){
		return this.track_type;
	}
	public void setTrack_type(String track_type){
		this.track_type = track_type;
	}
 	public String getUri(){
		return this.uri;
	}
	public void setUri(String uri){
		this.uri = uri;
	}
 	public User getUser(){
		return this.user;
	}
	public void setUser(User user){
		this.user = user;
	}
 	public Number getUser_id(){
		return this.user_id;
	}
	public void setUser_id(Number user_id){
		this.user_id = user_id;
	}
 	public String getVideo_url(){
		return this.video_url;
	}
	public void setVideo_url(String video_url){
		this.video_url = video_url;
	}
 	public String getWaveform_url(){
		return this.waveform_url;
	}
	public void setWaveform_url(String waveform_url){
		this.waveform_url = waveform_url;
	}
}
