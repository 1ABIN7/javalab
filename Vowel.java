package javalab;

import java.util.Scanner;

public class Vowel {
	public static void main (String[]args) {
		int count=0,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		int len= str.length();
		for (i=0;i<str.length();i++){
		     char c= str.charAt(i);
		     if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                     count++;
		     }
		}
        	System.out.println("Number of vowels is" +count);
	}
	
	
}