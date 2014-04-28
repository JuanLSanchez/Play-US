
package play_us.shared.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown=true)
public class ResultGetStreamKeyStreamServer  implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = -7509363498867338798L;
	private String streamKey;
    private String url;
    private Integer streamServerID;
    private Integer uSecs;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getStreamKey() {
        return streamKey;
    }

    public void setStreamKey(String streamKey) {
        this.streamKey = streamKey;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getStreamServerID() {
        return streamServerID;
    }

    public void setStreamServerID(Integer streamServerID) {
        this.streamServerID = streamServerID;
    }

    public Integer getUSecs() {
        return uSecs;
    }

    public void setUSecs(Integer uSecs) {
        this.uSecs = uSecs;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
