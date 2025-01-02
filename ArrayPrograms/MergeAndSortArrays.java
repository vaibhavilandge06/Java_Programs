package ArrayPrograms;

import java.util.Arrays;

public class MergeAndSortArrays {
    public static void main(String[] args) {
        int[] array1 = {5, 2, 9, 1};
        int[] array2 = {3, 7, 8, 4};

        int[] mergedArray = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

        Arrays.sort(mergedArray);

        System.out.println("Merged and sorted array: " + Arrays.toString(mergedArray));
    }
}
