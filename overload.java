package javalab;
import java.util.Scanner;
class area {
	public double circle(double radius) {		
		return 3.14*radius*radius;
	}
         public double rectangle (double width,double length) {
        	 return length*width;
         }
       public double triangle(double breadth,double height) {
	   return (breadth*height)/2;
       }
       }
public class overload{
 public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
	 area calculate=new area();
	 System.out.println("Enter the radius of the Circle");
	          double radius =sc.nextDouble();
	          System.out.println("Area of the Circle " +calculate.circle(radius)); 
	 System.out.println("Enter the width of the Rectangle");
	          double width =sc.nextDouble();  
	 System.out.println("Enter the length of the Rectangle");
	          double length =sc.nextDouble();
	          System.out.println("Area of the Rectangle " +calculate.rectangle(width,length)); 
     System.out.println("Enter the breadth of the Triangle");
              double breadth =sc.nextDouble();
     System.out.println("Enter the height of the Triangle");
              double height =sc.nextDouble();
              System.out.println("Area of the Triangle "+calculate.triangle(breadth,height)); 
 }
 
}
