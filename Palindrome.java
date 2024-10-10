package javalab;

import java.util.Scanner;

public class Palindrome {
public static void main (String[]args){
	int i,flag=0,len=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string to check it is palindrome:");
	String str=sc.nextLine();
	len=str.length();
	for(i=0;i<len/2;i++){
		if(str.charAt(i)!=str.charAt(len-i-1)){
			flag=1;
			break;}} 
	if(flag==0){ 
		System.out.println("Given string is Palindrome");}
	else {
		System.out.println("Given string is not a palindrome");}
}
}

