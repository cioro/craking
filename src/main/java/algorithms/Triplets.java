package algorithms;

import java.util.Arrays;

import static algorithms.Bubble.swap;

public class Triplets {


    public int solution(int[] A) {
        // Handle with the special cases
        if(null == A || A.length < 3) return 0;

        // Sort the input, and then try to find the triangular
        Arrays.sort(A);
        for(int i = 0; i < A.length-2; i++) {
            // Beware of overflow
            if (A[i] >= 0 && A[i] > A[i+2] - A[i+1]) {
                return 1;
            }
            /*
             * We already know A[i+1] <= A[i+2]. If A[i] < 0,
             * A[i] + A[i+1] < A[i+2]
             */
        }
        return 0;
    }
}


