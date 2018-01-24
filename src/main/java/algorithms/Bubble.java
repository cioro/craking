package algorithms;

import java.util.Scanner;

public class Bubble {

    public static int bubblesort(int[] array) {
        boolean isSorted = false;
        int swaps = 0;
        int lastUnsorted = array.length - 1;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < lastUnsorted; i++){
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    swaps++;
                    isSorted = false;
                }
            }
            lastUnsorted --;
        }
        return swaps;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; ++i)
        {
            array[i] = scanner.nextInt();
        }

        int swaps = bubblesort(array);
        System.out.println("Array is sorted in " + swaps + " swaps.");
        System.out.println("First Element: " + array[0]);
        System.out.println("Last Element: " + array[n - 1]);
    }
}
