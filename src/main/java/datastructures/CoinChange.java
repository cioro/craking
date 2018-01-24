package datastructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CoinChange {

    public static long makeChange(int[] coins, int money)
    {
        return makeChange(coins, money, 0, new HashMap<>());
    }

    private static long makeChange(int[] coins, int money, int index, HashMap<String, Long> memo) {

        if (money == 0) {
            return 1;
        }
        if (index >= coins.length) {
            return 0;
        }

        String key = money + "-" + index; // "29" + "1" || "2" + "91"
        if (memo.containsKey(key))
        {
            return memo.get(key);
        }
        int amountWithCoin = 0;
        long ways = 0;
        while (amountWithCoin <= money) {
            int remaining = money - amountWithCoin;
            amountWithCoin += coins[index];
            ways += makeChange(coins, remaining, index + 1, memo);
        }
        memo.put(key, ways);
        return ways;
    }

    public static void main(String[] args) {

    }

    //Memoization - how do we know we have seen the problem before;
    //Tackle this iteratively -> tip: what is the very last thing tht gets fill into the memo table
}
