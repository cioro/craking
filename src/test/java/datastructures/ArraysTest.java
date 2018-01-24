package datastructures;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArraysTest {

    @Test
    public void sampleLeftRotation() throws Exception {
        int [] input = {1, 2, 3, 4, 5};
        int rotations = 4;
        int [] output = {5, 1, 2, 3, 4};
        assertArrayEquals(output, Arrays.leftRotation(input, rotations));
    }

    @Test
    public void sampleRightRotation() throws Exception {
        int [] input = {1, 2, 3, 4, 5};
        int rotations = 4;
        int [] output = {2, 3, 4, 5, 1};
        assertArrayEquals(output, Arrays.rightRotation(input, rotations));
    }

    @Test
    public void smallArray() throws Exception {
        int [] input = {1};
        int rotations = 0;
        int [] output = {1};
        assertArrayEquals(output, Arrays.leftRotation(input, rotations));
    }
}