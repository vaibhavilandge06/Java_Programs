package ArrayPrograms;

import java.util.Scanner;

public class SearchElementInArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be greater than 0.");
            return;
        }

        int[] array = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();

        int position = searchElement(array, target);

        if (position != -1) {
            System.out.println("Element " + target + " found at position: " + (position + 1));
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

        scanner.close();
    }

  
    public static int searchElement(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Return the position (index)
            }
        }
        return -1; // Element not found
    }
}
