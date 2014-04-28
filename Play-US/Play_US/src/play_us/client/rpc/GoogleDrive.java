package play_us.client.rpc;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import play_us.shared.domain.googledrive.FileItem;
import play_us.shared.domain.googledrive.Files;

@RemoteServiceRelativePath("googleDrive")
public interface GoogleDrive extends RemoteService {
	
	public Files getFiles(String token);
	public FileItem getFile(String id, String token);
	public String insertFile(FileItem item, String content, String token);
	public boolean updateFile(FileItem item, String token);
	public boolean deleteFile(String id, String token);
	public Files getMusica(String q, String token);

}
