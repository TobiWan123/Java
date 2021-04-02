import java.io.File;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String link = "https://www.physi.uni-heidelberg.de/Einrichtungen/FP/seminar/Vortrag.pdf";
		
		File out = new File("C:\\Users\\walte\\Downloads\\File.pdf"); 
		
		new Thread(new Download(link, out)).start();
	}

}
