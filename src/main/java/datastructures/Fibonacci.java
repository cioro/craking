package datastructures;

public class Fibonacci {

    public static int fibonacci_1(int n) {
        int[] fib = new int[2];
        fib[0] = 0; fib[1] = 1;
        for (int i = 2; i <= n; ++i) {
            fib[i % 2] = fib[0] + fib[1];
        }
        return fib[n % 2];
    }

    public static int fib(int n)
    {
        return fib_mem(n, new int[n]);
    }

    public static int fib_mem(int n, int[] memo) {

        if (memo.length < n)
        {
            return memo[n];
        }
        else
        {
            if (n == 0){
                return 0;
            }
            if (n == 1){
                return 1;
            }
            else {
                int f = fib_mem(n-1, memo) + fib_mem(n-2, memo);
                memo[n] = f;
                return f;
            }
        }
    }
}
