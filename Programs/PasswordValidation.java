package Programs;

import java.util.Scanner;

public class PasswordValidation {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter Password:- ");
		String password=scan.nextLine();
		
		if(isValid(password)) {
			System.out.println(password+" Is a Valid");
		}
		else {
			System.out.println(password +" Is a Invalid");
		}
		
		

	}
	
	public static boolean isValid(String password) {
        if (password.length() < 8) {
            return false; 
        }

        boolean hasLetter = false;
        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (Character.isLetter(ch)) {
                hasLetter = true;
            }

            if (hasLetter && hasDigit) {
                return true;
            }
        }

        return false;
	}
}
