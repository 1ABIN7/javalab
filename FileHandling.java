package javalab;
import java.io.*;
import java.util.*;
public class FileHandling {

	public static void main(String[] args) {
     try
     {
    	 Scanner sc = new Scanner(System.in);
    	 File fold1 = new File("filename.txt");
    	 fold1.createNewFile();
    	 System.out.println("filename.txt created\n");
    	 
    	 FileWriter fout = new FileWriter("filename.txt");
    	 System.out.println("Enter rank: ");
    	 int n = sc.nextInt();
    	 fout.write(n+"\n");
    	 fout.close();
    	 System.out.println("rank addded");
    	 
    	 FileReader fin = new FileReader("filename.txt");
    	 BufferedReader br = new BufferedReader(fin);
    	 String Line;
    	 System.out.println("\n content of filename.txt is:");
    	 while((Line = br.readLine()) !=null){
    		 System.out.println(Line);
    	 }
           br.close();
    	 }
    	 catch (IOException e) {
    		 System.out.println("error"+e.getMessage());
    		 
     }

	}

}
