package ArrayPrograms;

import java.util.Scanner;

public class SecondLargestElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("Array must have at least 2 elements.");
            return;
        }

        int[] array = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int secondLargest = findSecondLargest(array);

        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("The second largest element is: " + secondLargest);
        } else {
            System.out.println("There is no distinct second largest element.");
        }

        scanner.close();
    }

    public static int findSecondLargest(int[] array) {
        int largest = Integer.MIN_VALUE;
        System.out.println("Largest:- "+largest);
        int secondLargest = Integer.MIN_VALUE;
        System.out.println("Second Largest:- "+secondLargest);
        for (int num : array) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }
}
