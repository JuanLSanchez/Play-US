
package play_us.shared.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown=true)
public class ResultGetCountry  implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 6556780591544033044L;
	private Integer ID;
    private Integer CC1;
    private Integer CC2;
    private Integer CC3;
    private Integer CC4;
    private Integer DMA;
    private Integer IPR;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getID() {
        return ID;
    }

    public void setID(Integer iD) {
        this.ID = iD;
    }

    public Integer getCC1() {
        return CC1;
    }

    public void setCC1(Integer cC1) {
        this.CC1 = cC1;
    }

    public Integer getCC2() {
        return CC2;
    }

    public void setCC2(Integer cC2) {
        this.CC2 = cC2;
    }

    public Integer getCC3() {
        return CC3;
    }

    public void setCC3(Integer cC3) {
        this.CC3 = cC3;
    }

    public Integer getCC4() {
        return CC4;
    }

    public void setCC4(Integer cC4) {
        this.CC4 = cC4;
    }

    public Integer getDMA() {
        return DMA;
    }

    public void setDMA(Integer dMA) {
        this.DMA = dMA;
    }

    public Integer getIPR() {
        return IPR;
    }

    public void setIPR(Integer iPR) {
        this.IPR = iPR;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
    
    public String toString(){
    	return "{\"ID\":" + getID() + 
				",\"CC1\":" + getCC1()+ ",\"CC2\":" + getCC2() 
				+ ",\"CC3\":" + getCC3() + ",\"CC4\":" + 
				getCC4() + ",\"DMA\":" + getDMA() + 
				",\"IPR\":" + getIPR() + "}";
    }
}
