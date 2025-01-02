package Programs;


import java.util.Scanner;

public class TempConversions {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter degree:- ");
		int C=scan.nextInt();
		int result=cToFConvertor(C);
		System.out.println("Fahrenheit is:- "+result);
		
		System.out.println("Enter Temperature in  Fahrenheit:- ");
		int F=scan.nextInt();
		int result1=fToCConvertor(F);
		System.out.println("Celcius is:- "+result1);
		
	}
	
	public static int cToFConvertor(int C) {
		int F= (int)(C * 1.8)+32;
		return F;
		
	}
	
	public static int fToCConvertor(int F) {
		int C=(int)((F-32)*(5.0/9.0));
		return C;
		
	}

}
