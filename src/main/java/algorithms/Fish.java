package algorithms;

import java.util.Stack;

public class Fish {
    public int solution(int[] A, int[] B) {
        int N = A.length;
        int alive = N;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < N; ++i) {
            stack.push(i);
            if (B[i] == 0)
            {

            }
            else if (B[i] == 1)
            {

            }
        }
        return stack.size();
    }
}
