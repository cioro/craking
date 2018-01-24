package datastructures;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InversionCounting {

    public static long countInversions(int[] array) {
        return countInversions(array, new int[array.length], 0, array.length - 1);
    }

    public static long countInversions(int[] array, int[] temp, int leftStart, int rightEnd) {
        if (leftStart >= rightEnd) {
            return 0;
        }

        int middle = Math.floorDiv(leftStart + rightEnd, 2);

        long x = countInversions(array, temp, leftStart, middle);
        long y = countInversions(array, temp, middle + 1, rightEnd);
        long z = mergeAndSplitCountInversions(array, temp, leftStart, rightEnd);
        return x + y + z;
    }

    public static long mergeAndSplitCountInversions(int[] array, int[] temp, int leftStart, int rightEnd) {
        long inversions = 0;
        int leftEnd = Math.floorDiv(leftStart + rightEnd, 2);
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;

        int left = leftStart;
        int right = rightStart;

        int index = leftStart;

        while (left <= leftEnd && right <= rightEnd) {
            if (array[left] <= array[right]) {
                temp[index] = array[left];
                left++;
            } else {
                temp[index] = array[right];
                right++;
                inversions += leftEnd - left + 1;
            }
            index++;
        }

        System.arraycopy(array, left, temp, index, leftEnd - left + 1);
        System.arraycopy(array, right, temp, index, rightEnd - right + 1);
        System.arraycopy(temp, leftStart, array, leftStart, size);
        return inversions;
    }

    public static void main(String[] args) {

        try {
            Scanner in = new Scanner(new File("/Users/rmolina16/Code/cracking/src/main/java/datastructures/input.txt"));
            int n = 100000;
            int[] arr = new int[n];
            for (int arr_i = 0; arr_i < n; arr_i++) {
                arr[arr_i] = in.nextInt();
            }
            long result = countInversions(arr);
            System.out.println(result);
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

    }
}
