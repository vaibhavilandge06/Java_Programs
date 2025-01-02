package ArrayPrograms;

import java.util.HashSet;
import java.util.Scanner;

public class DuplicateRemover {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        removeDuplicates(array);

        scanner.close();
    }
    
    public static void removeDuplicates(int[] array) {
        HashSet<Integer> uniqueElements = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            uniqueElements.add(array[i]);
        }

        System.out.println("Unique elements in the array:");
        for (int element : uniqueElements) {
            System.out.print(element + " ");
        }
    }
}
