package ArrayPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be greater than 0.");
            return;
        }

        Integer[] array = new Integer[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);
        System.out.println("Array in ascending order: " + Arrays.toString(array));

        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Array in descending order: " + Arrays.toString(array));

        scanner.close();
    }
}
