package Programs;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Are you a citizen of the country? (yes/no): ");
        String citizenship = scanner.nextLine().trim().toLowerCase();

         if (isEligibleToVote(age, citizenship)) {
            System.out.print("You are eligible to vote.");
        } else {
            System.out.print("You are not eligible to vote.");
        }

        scanner.close();
    }

    public static boolean isEligibleToVote(int age, String citizenship) {
        return age >= 18 && citizenship.equals("yes");
    }
}
