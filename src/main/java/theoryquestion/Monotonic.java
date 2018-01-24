package theoryquestion;

import com.sun.istack.internal.NotNull;

import java.util.Arrays;

public class Monotonic {

    /**   You are a given a unimodal array of n distinct elements, meaning that its entries are in increasing order
     *    up until its maximum element, after which its elements are in decreasing order.
     *        Give an algorithm to compute the maximum element that runs in O(log n) time
     */
    public static int mode(@NotNull int[] a)
    {
        if(a.length == 1)
        {
            return a[0];
        }

        int midPoint = a.length/2;
        if(a[midPoint + 1] > a[midPoint])
        {
            mode(Arrays.copyOfRange(a, midPoint , a.length-1 ));
        }
        else
        {
            mode(Arrays.copyOfRange(a, 0, midPoint));
        }
        return a[midPoint];
    }
}
