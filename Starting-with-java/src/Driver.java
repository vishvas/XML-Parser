import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Driver {
	
	public static void main(String[] args) throws IOException{
		
		if(args.length==0 || args==null){
			throw new IllegalArgumentException("NO input file found.You must have to enter only one file.");
			
		}else if(args.length>1){
			throw new IllegalArgumentException("More numbers of files than accepted.You must have to enter only one file name.");
			
		}	
		else{
			try{
				FileInputStream fstream = new FileInputStream(args[0]);
				FileProcessor file = new FileProcessor(args[0].toString());
				StringOperations so = new StringOperations();
				String s=file.readLineFromFile();
				while(s!=null){
					so.readStringOperations(s);// performing string operations on the string
					s=file.readLineFromFile();//reading next line
				}
				so.printFreq();// printing the frequency of word2
				fstream.close();
				file.fileClose();//closing file
				
			} catch (FileNotFoundException e) {
				System.err.println("Entered file "+args[0]+" NOT found.");
				e.printStackTrace();
				System.exit(1);
				
			}catch (IOException e) {
				System.err.println("Unable to create file stream of file"+args[0]);
				e.printStackTrace();
				System.exit(1);
				
			}

			
		}

	}
}
