package fileHandle;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreate {

	public static void main(String[] args) throws IOException {
		File f=new File("/home/bala/bala.txt");
		if(!f.exists()) {
			f.createNewFile();
		}
		
		FileWriter w = new FileWriter(f);
		
		w.write("hi welcome, I am bala");
		w.flush();
		w.close();

	}

}
