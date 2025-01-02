package Programs;

import java.util.Scanner;

public class Remainder {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first No:-");
		double int1=scan.nextDouble();

		System.out.println("Enter second No:-");
		double int2=scan.nextDouble();

		if(int2 != 0) {
			double result=int1 % int2;
			System.out.println("Remainder is:- "+result);
		}
		else {
			System.out.println("Division by zero is not allowed");
		}
	}

}
