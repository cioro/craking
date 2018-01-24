package datastructures;

import org.junit.Test;

import static org.junit.Assert.*;

public class CoinChangeTest {
    @Test
    public void test() throws Exception {
        int[] coins = {3, 2, 1};
        int n = 4;
        assertEquals(4, CoinChange.makeChange(coins, n));
    }

    @Test
    public void test2() throws Exception {
        int[] coins = {2, 5, 3, 6};
        int n = 10;
        assertEquals(5,  CoinChange.makeChange(coins, n));
    }
}