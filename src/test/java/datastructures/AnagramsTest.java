package datastructures;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramsTest {
    @Test
    public void sample() throws Exception {
       assertEquals(4, Anagrams.numberNeeded("cde", "abc"));
    }

}