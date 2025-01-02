package Programs;

import java.util.Scanner;

public class TriangleArea {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter base:- ");
		double base=scan.nextDouble();
		
		System.out.println("Enter Height:- ");
		double height=scan.nextDouble();
		
		double area=0.5 * base * height;
		
		System.out.println("Area of Triangle is :- " + area);
		
	}
}
