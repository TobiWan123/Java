import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class Download implements Runnable{
	
	//Create link and OutputFile
	String link;
	File out; 

	public Download(String link, File out) {
		this.link = link; 
		this.out = out;
	}
	
	//Main-Method of Thread activated by calling threadName.start() 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			//Get the Connection with Link
			URL url = new URL(link);
			HttpURLConnection http = (HttpURLConnection)url.openConnection();
			double fileSize = (double)http.getContentLengthLong();
			//Create BufferedInputStream to download file via httpConnection
			BufferedInputStream in = new BufferedInputStream(http.getInputStream()); 
			//Create FileOutputStream to save file at the the desired destination out pretends
			FileOutputStream fos = new FileOutputStream(this.out); 
			//Create BufferedOutputStream to collect the Data in byte from the BufferdInputStream in
			//Able to Create without length but buffer is needed
			BufferedOutputStream bout = new BufferedOutputStream(fos);
			byte[] buffer = new byte[1024]; 
			double downloaded  = 0.00 ; 
			int read = 0; 
			double percentDownloaded = 0.00; 
			
			//Read Data into buffer from 0 to 1024 bytes and transfer with the BufferdInputStream to BufferedOutputStream
			//Will read a length of 1024 Bytes at a time until there is no more Data left ">= 0"
			while((read = in.read(buffer, 0, 1024)) >= 0) {
				//Write the Data to buffer from 0 to read and transfer via the BufferedOutputStream bout to the FileOutputStram fos with max. 1024 Byte Length
				//Will write a length from 0 to read into buffer -> buffer is reachable for FileOutputStream
				bout.write(buffer, 0, read);
				downloaded += read; 
				percentDownloaded = (downloaded*100/fileSize); 
				String percent = String.format("%.4f", percentDownloaded); 
				System.out.println("Downloaded " + percent + "% of File.");
			}
			bout.close();
			in.close();
			System.out.println("Download complete.");
			
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}


}
 