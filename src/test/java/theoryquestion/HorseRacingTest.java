package theoryquestion;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import static org.junit.Assert.*;

public class HorseRacingTest {
    @Test
    public void naiveSecond_test1() throws Exception {
        int[] input = {2,3,4,7,89, 100, 90, 8};
        assertEquals(89, HorseRacing.naiveSecond(input));
    }

    @Test
    public void naiveSecond_benchMark() throws Exception {
        try {
            Scanner in = new Scanner(new File("/Users/rmolina16/Code/cracking/src/main/java/datastructures/input.txt"));
            int n = 100000;
            int[] arr = new int[n];
            for (int arr_i = 0; arr_i < n; arr_i++) {
                arr[arr_i] = in.nextInt();
            }
            long start = System.nanoTime();
            long result = HorseRacing.naiveSecond(arr);
            System.out.println(System.nanoTime() - start);

            System.out.println(result);
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    @Test
    public void naiveSecondInPlace_benchMark() throws Exception {
        try {
            Scanner in = new Scanner(new File("/Users/rmolina16/Code/cracking/src/main/java/datastructures/input.txt"));
            int n = 100000;
            int[] arr = new int[n];
            for (int arr_i = 0; arr_i < n; arr_i++) {
                arr[arr_i] = in.nextInt();
            }
            long start = System.nanoTime();
            long result = HorseRacing.naiveSecondInPlace(arr);
            System.out.println(System.nanoTime() - start);

            System.out.println(result);
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    @Test
    public void fastTest() throws Exception {
        int[] input = {2, 3, 4, 7, 89, 100, 90, 8};
//        HorseRacing.fastSolution(input);
    }
}