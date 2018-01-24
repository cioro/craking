package algorithms;

import static algorithms.Bubble.swap;

public class Sorting {

    public static int[] selectionSort(int[] A) {
        int n = A.length;
        for (int k = 0; k < n; k++) {
            int minimal = k;
            for (int j = k; j < n; j++) {
                if (A[j] < A[minimal]) {
                    minimal = j;
                }
            }
            swap(A, k, minimal);
        }
        return A;
    }

    public static int[] countingSort(int[] A, int k) {
        int n = A.length;
        int[] count = new int[k + 1];
        for (int i = 0; i < n; ++i) {
            count[A[i]] += 1;
        }
        int p = 0;
        for (int i = 0; i < k + 1; ++i) {
            for (int j = 0; j < count[i]; ++j)
            {
                A[p] = i;
                p +=1;
            }
        }
        return A;
    }
}
