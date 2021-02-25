package lesson10.labs.prob2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

public class NewFileIO {
	private static final Logger LOG = Logger.getLogger(NewFileIO.class.getName());
	public final static String FILE_LOCATION = "C:\\Users\\Gedeon.rw\\Eclipse 12R\\MppLearn\\src\\lesson10\\labs\\prob2\\TextFile.txt";
	public final static String TO_PRINT = "This is the string to print to file using NewFileIO";
	
	void writeText(String filename, String text) {
		
		try(FileWriter fw = new FileWriter(new File(filename))){
			fw.write(text);
		} catch(IOException e) {
			LOG.warning("IOException attempting to write a file: " + e.getMessage());
		} 
	}
	
	public static void main(String[] args) {
		NewFileIO newF = new NewFileIO();
	    newF.writeText(FILE_LOCATION, TO_PRINT);
		
	}

}

