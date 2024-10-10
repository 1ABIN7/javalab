package javalab;
import java.io.*;
public class WriteFile

{
	
	public static void main(String args[]) {
		try {
		FileInputStream fin=new FileInputStream("filename.txt");
		FileOutputStream fout=new FileOutputStream("filename2.txt");
		int i;
		while ((i=fin.read())!=-1)
		{
			fout.write(i);
		}
		System.out.println("Sucessfully wrote to specific file.");
	      fin.close();
	      fout.close();
		
	} 
	catch (java.io.FileNotFoundException e) {
		System.out.println("file not found: " + e.getMessage());
	}
	catch (IOException e) {
		System.out.println(e.getMessage());
	}
}
}
