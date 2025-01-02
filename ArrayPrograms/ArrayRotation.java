package ArrayPrograms;

import java.util.Scanner;

public class ArrayRotation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of positions to rotate: ");
        int n = scanner.nextInt();

        rotateArray(array, n);

        System.out.println("Array after rotation:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        scanner.close();
    }


    public static void rotateArray(int[] array, int n) {
        int size = array.length;
        n = n % size;

        reverse(array, 0, size - 1);
        reverse(array, 0, n - 1);
        reverse(array, n, size - 1);
    }


    public static void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}

