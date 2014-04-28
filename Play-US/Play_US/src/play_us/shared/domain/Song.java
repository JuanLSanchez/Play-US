
package play_us.shared.domain;

import java.io.Serializable;
import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Song implements Serializable{
	private static final long serialVersionUID = 289772839985793415L;
	private Integer SongID;
    private String SongName;
    private Integer ArtistID;
    private String ArtistName;
    private Integer AlbumID;
    private String AlbumName;
    private String CoverArtFilename;
    private Integer Popularity;
    private Boolean IsLowBitrateAvailable;
    private Boolean IsVerified;
    private Integer Flags;

    public Integer getSongID() {
        return SongID;
    }

    public void setSongID(Integer songID) {
        this.SongID = songID;
    }

    public String getSongName() {
        return SongName;
    }

    public void setSongName(String songName) {
        this.SongName = songName;
    }

    public Integer getArtistID() {
        return ArtistID;
    }

    public void setArtistID(Integer artistID) {
        this.ArtistID = artistID;
    }

    public String getArtistName() {
        return ArtistName;
    }

    public void setArtistName(String artistName) {
        this.ArtistName = artistName;
    }

    public Integer getAlbumID() {
        return AlbumID;
    }

    public void setAlbumID(Integer albumID) {
        this.AlbumID = albumID;
    }

    public String getAlbumName() {
        return AlbumName;
    }

    public void setAlbumName(String albumName) {
        this.AlbumName = albumName;
    }

    public String getCoverArtFilename() {
        return CoverArtFilename;
    }

    public void setCoverArtFilename(String coverArtFilename) {
        this.CoverArtFilename = coverArtFilename;
    }

    public Integer getPopularity() {
        return Popularity;
    }

    public void setPopularity(Integer popularity) {
        this.Popularity = popularity;
    }

    public Boolean getIsLowBitrateAvailable() {
        return IsLowBitrateAvailable;
    }

    public void setIsLowBitrateAvailable(Boolean isLowBitrateAvailable) {
        this.IsLowBitrateAvailable = isLowBitrateAvailable;
    }

    public Boolean getIsVerified() {
        return IsVerified;
    }

    public void setIsVerified(Boolean isVerified) {
        this.IsVerified = isVerified;
    }

    public Integer getFlags() {
        return Flags;
    }

    public void setFlags(Integer flags) {
        this.Flags = flags;
    }

}
