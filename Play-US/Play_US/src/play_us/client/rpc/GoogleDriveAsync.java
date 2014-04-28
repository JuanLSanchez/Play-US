package play_us.client.rpc;

import play_us.shared.domain.googledrive.FileItem;
import play_us.shared.domain.googledrive.Files;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface GoogleDriveAsync {

	void deleteFile(String id, String token, AsyncCallback<Boolean> callback);

	void getFile(String id, String token, AsyncCallback<FileItem> callback);

	void getFiles(String token, AsyncCallback<Files> callback);

	void insertFile(FileItem item, String content, String token,
			AsyncCallback<String> callback);

	void updateFile(FileItem item, String token, AsyncCallback<Boolean> callback);

	void getMusica(String q, String token, AsyncCallback<Files> callback);

}
