package Programs;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Principal:- ");
		float P=scan.nextFloat();
		
		System.out.println("Enter Rate:- ");
		float R=scan.nextFloat();
		
		System.out.println("Enter Time:- ");
		float T=scan.nextFloat();
		
		float SI=(P*R*T)/100;
		
		System.out.println("The Simple Interest Is:- "+SI);
		
	}

}
