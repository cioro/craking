package datastructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DavisStaircases {

    public static int c_n(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 4;

        return c_n(n - 1) + c_n(n - 2) + c_n(n - 3);
    }

    public static int c_n_loop(int n)
    {
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 4;
        for (int i = 3; i<=n; ++i)
        {
            array[i % 3] = array[0] + array[1] + array[2];
        }

        return array[(n % 3) + 1];
    }

    public static int c_n_mem(int n)
    {
        return c_n_mem(n, new int[n +1]);
    }

    public static int c_n_mem(int n, int[] memo)
    {
        if (n == 0)
        {
            return 0;
        }

        if (memo.length < n)
        {
            return memo[n];
        }
        else
        {
            if (n == 1)
            {
                return 1;
            }
            else if (n == 2)
            {
                return 2;
            }
            else if (n == 3)
            {
                return 4;
            }
            else
            {
                int c_n = c_n_mem(n-1, memo) + c_n_mem(n-2, memo) + c_n_mem(n-3, memo);
                memo[n] = c_n;
                return c_n;
            }
        }
    }

    private static Map<Integer, Integer> map = new HashMap<>();

    private static int climb(int n) {
        if(n < 0)
            return 0;

        if(n == 0)
            return 1;

        if(!map.containsKey(n)) {
            int count = climb(n-1) + climb(n-2) + climb(n-3);
            map.put(n, count);
        }
        return map.get(n);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        for (int a0 = 0; a0 < s; a0++) {
            int n = in.nextInt();
            System.out.println(c_n(n));
        }
    }

}
