
package play_us.shared.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown=true)
public class GetStreamKeyStreamServer implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -8478544423926204064L;
	private Header header;
    private ResultGetStreamKeyStreamServer result;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public ResultGetStreamKeyStreamServer getResult() {
        return result;
    }

    public void setResult(ResultGetStreamKeyStreamServer result) {
        this.result = result;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
