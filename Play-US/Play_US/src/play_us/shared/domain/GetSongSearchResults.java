
package play_us.shared.domain;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class GetSongSearchResults implements Serializable{
	private static final long serialVersionUID = 939328489579581507L;
	private Header header;
    private ResultGetSongSearchResults result;

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public ResultGetSongSearchResults getResult() {
        return result;
    }

    public void setResult(ResultGetSongSearchResults result) {
        this.result = result;
    }

}
