package fileHandle;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriting {

	public static void main(String[] args) throws IOException {
		File f= new File("/home/bala/Desktop/new.txt");
		
		FileWriter fw=new FileWriter(f);
		Scanner sc=new Scanner(System.in);
		char [] c=sc.next().toCharArray();
		
		for(int i=0;i<c.length;i++) {
	
			fw.append(c[i]);
			
			
		}
		fw.flush();
		fw.close();
		

	}

}
