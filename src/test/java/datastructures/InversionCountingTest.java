package datastructures;

import org.junit.Test;

import static datastructures.InversionCounting.countInversions;
import static org.junit.Assert.*;

public class InversionCountingTest {
    @Test
    public void test1() throws Exception {
        int[] input = {2, 1, 3, 1, 2};
        assertEquals(4, countInversions(input));
    }

}