package javalab;
import java.util.Scanner;
public class matrices {
       public static void main(String[]args) {
    	   Scanner sc= new Scanner(System.in);
    	   System.out.println("Enter the number of rows of first matrix ");
    	   int m1=sc.nextInt(); 
    	   System.out.println("Enter the number of columns of first matrix ");
    	   int n1=sc.nextInt();
    	   System.out.println("Enter the number of rows of second matrix ");
    	   int m2=sc.nextInt();
    	   System.out.println("Enter the number of columns of second matrix ");
    	   int n2=sc.nextInt();
    	   if(n1!=m2)   {
    		   System.out.println("Multiplication is not possible");
    	   }
    		   int A[][]=new int [m1][n1];
               int B[][]=new int [m2][n2];
               int C[][]=new int [m1][n1];
               int i,j;
               System.out.println("read the elements in the matrix 1");
               for(i=0;i<m1;i++) {
            	   for(j=0;j<n1;j++) {
            		   System.out.println("A["+i+"]["+j+"]=");
            		   A[i][j]=sc.nextInt();
            	   }
               }
               System.out.println("read the elements in the matrix 2");
               for(i=0;i<m2;i++) {
            	   for(j=0;j<n2;j++) {
            		   System.out.println("B["+i+"]["+j+"]=");
            		   B[i][j]=sc.nextInt();}}
            		   for(i=0;i<m1;i++) {
                    	   for(j=0;j<n2;j++) {
                    		   C[i][j]=0;
                    		   for(int k=0;k<n1;k++) {
                    			   C[i][j]=A[i][k]*B[k][j];
                    		   }}}
                    		   System.out.println("Multiplication of matrices is ");
                    		   for(i=0;i<m1;i++) {
                            	   for(j=0;j<n2;j++) {
                            		   System.out.print(C[i][j]+"\t");}
                            				   System.out.println();}
                            	   }
            	   }
               
            		   
    	   
       

