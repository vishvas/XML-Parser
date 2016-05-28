import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

// File reading code

public class FileProcessor {
	FileInputStream fstream;
	BufferedReader br;
	public FileProcessor(String fileName) throws IOException{
		// Open the file
				 fstream = new FileInputStream(fileName);
				 br = new BufferedReader(new InputStreamReader(fstream));
	}
	public void fileClose() throws IOException{
		 // file close
	      br.close();
	}
	public String readLineFromFile() {
		try {
			//System.out.println(br.readLine());
			return br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
