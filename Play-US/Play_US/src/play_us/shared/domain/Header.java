
package play_us.shared.domain;

import java.io.Serializable;
import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Header implements Serializable{
	private static final long serialVersionUID = 4352245061085808042L;
	private String hostname;

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

}
