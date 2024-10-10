package javalab;

import java.util.Scanner;

public class Frequency {
	public static void main (String[]args) {
			int count=0,i,len;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the string");
			String str=sc.nextLine();
			System.out.println("Enter the character");
			String ch=sc.nextLine();
			len= str.length();
			for(i=0;i<len;i++){
				if(str.charAt(i)==ch.charAt(0))
			       count++;	}
			System.out.println("Number of character is " +count);
  }}