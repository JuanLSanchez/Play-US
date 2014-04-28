package play_us.server.rpc;

import play_us.client.rpc.GoogleDrive;
import play_us.server.resources.GoogleDriveResource;
import play_us.shared.domain.googledrive.FileItem;
import play_us.shared.domain.googledrive.Files;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

@SuppressWarnings("serial")
public class GoogleDriveImpl extends RemoteServiceServlet implements GoogleDrive{
	private GoogleDriveResource gdr = new GoogleDriveResource();
	
	public Files getFiles(String token) {
		return gdr.getFiles(token); 
	}
	
	public Files getMusica(String q, String token){
		return gdr.getFiles("mimeType='audio/mpeg' and title contains '"+q+"'", token);
	}

	public FileItem getFile(String id, String token) {
		return gdr.getFile(id, token);
	}

	public String insertFile(FileItem file, String content, String token) {
		return gdr.insertFile(file, content, token);
	}

	public boolean updateFile(FileItem file, String token) {
		return gdr.updateFile(file, token);
	}

	public boolean deleteFile(String id, String token) {
		return gdr.deleteFile(id, token);
	}

}
