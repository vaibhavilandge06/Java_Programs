package StringPrograms;

import java.util.Scanner;

public class WordReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String input = scanner.nextLine();

        String reversed = reverseWords(input);

        System.out.println("Reversed sentence: " + reversed);

        scanner.close();
    }

    public static String reverseWords(String sentence) {

    	String[] words = sentence.split(" ");


        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            
            if (i != 0) {
                reversed.append(" ");
            }
        }
        
        return reversed.toString();
    }
}
