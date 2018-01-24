package algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortingTest {
    @Test
    public void selectionSort() throws Exception {
        int[] input = {5,2,8,14,1,16};
        int[] sorted = {1,2,5,8,14,16};
        int[] actual = Sorting.selectionSort(input);
        for (int i = 0; i < input.length; ++i)
        {
            assertEquals(sorted[i], actual[i]);
        }

    }

    @Test
    public void countSort() throws Exception {
        int[] input = {5,2,8,14,1,16};
        int[] sorted = {1,2,5,8,14,16};
        int[] actual = Sorting.countingSort(input, 16);
        for (int i = 0; i < input.length; ++i)
        {
            assertEquals(sorted[i], actual[i]);
        }

    }
}