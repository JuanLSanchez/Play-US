package play_us.server.resources;

import java.net.URLEncoder;
import java.util.Map;

import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;


import play_us.shared.domain.googledrive.FileItem;
import play_us.shared.domain.googledrive.Files;


public class GoogleDriveResource {
	
	private String uri = "https://www.googleapis.com/drive/v2/files";
	private String uri_upload = "https://www.googleapis.com/upload/drive/v2/files";
	
	public Files getFiles(String token) {	
		ClientResource cr = null;
		Files files = null;
		try {
			cr = new ClientResource(uri + "?access_token=" + token);
			files = cr.get(Files.class);
			
		} catch (ResourceException re) {
			System.err.println("Error when retrieving all files: " + cr.getResponse().getStatus());
		}		
		return files;
	}
	
	public Files getFiles(String q, String token) {	
		ClientResource cr = null;
		Files files = null;
		try {
			cr = new ClientResource(uri + "?access_token=" + token+"&q="+URLEncoder.encode(q));
			files = cr.get(Files.class);
			
		} catch (ResourceException re) {
			System.err.println("Error when retrieving all files: " + cr.getResponse().getStatus());
		}		
		return files;
	}
	
	public FileItem getFile(String id, String token) {
		
		ClientResource cr = null;
		FileItem file = null;
		try {
			cr = new ClientResource(uri + "/"+id+"?access_token=" + token);
			file = cr.get(FileItem.class);
			
		} catch (ResourceException re) {
			System.err.println("Error when retrieving file: " + cr.getResponse().getStatus());
		}
		return file;
	}
	
	public String insertFile(FileItem file, String content, String token) {
		
		ClientResource cr = null;
		String newId = null;
		try {
			cr = new ClientResource(uri + "?access_token=" + token);
			FileItem newFile = cr.post(file,FileItem.class);
			newId = newFile.getId();		
			
			cr = new ClientResource(uri_upload + "/"+ newId+"?uploadType=media&access_token=" + token);
			Map<String,Object> headers = cr.getRequestAttributes();
			headers.put("Content-Type", "text/plain");
			cr.put(content);
		} catch (ResourceException re) {
			System.err.println("Error when inserting file: " + cr.getResponse().getStatus());
		}
		return newId;
	}
	
	public boolean updateFile(FileItem file, String token) {
		
		ClientResource cr = null;
		boolean result = true;
		try {			
			cr = new ClientResource(uri + "/"+ file.getId()+"?access_token=" + token);
			cr.put(file);
		} catch (ResourceException re) {
			System.err.println("Error when updating file: " + cr.getResponse().getStatus());
			result = false;
		}
		return result;
	}
	
	public boolean deleteFile(String id, String token) {
		
		ClientResource cr = null;
		boolean result = true;
		try {
			cr = new ClientResource(uri + "/"+ id+"?access_token=" + token);
			cr.delete();
		} catch (ResourceException re) {
			System.err.println("Error when deleting file: " + cr.getResponse().getStatus());
			result = false;
		}
		return result;

	}

}
