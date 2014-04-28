
package play_us.shared.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown=true)
public class ResultGetSongSearchResults implements Serializable{
	private static final long serialVersionUID = -3942706979785202161L;
	private List<Song> songs = new ArrayList<Song>();

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }
}
