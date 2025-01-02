package Programs;

import java.util.Scanner;

public class Circumference {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the radius of Circle:- ");
		double radius=scan.nextDouble();
		
		double circumference=2*3.14*radius;
		System.out.println("Circumference of the circle is:- "+circumference);
		
		double area=3.14 *(radius * radius);
		System.out.println("Area of Circle is:- "+ area);
	}
}
