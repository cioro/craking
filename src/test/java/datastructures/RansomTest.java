package datastructures;

import org.junit.Test;

import static org.junit.Assert.*;

public class RansomTest {
    @Test
    public void sampleSuccessCanWeWriteOurRansomNote() throws Exception {
        String[] magazine = "give me one grand today night".split(" ");
        String[] ransom = "give one grand today".split(" ");
        assertEquals("YES", Ransom.canWeWriteOurRansomNote(magazine, ransom));
    }

    @Test
    public void sampleFailureCanWeWriteOurRansomNote() throws Exception {
        String[] magazine = "two times three is not four".split(" ");
        String[] ransom = "two times two is four".split(" ");
        assertEquals("NO", Ransom.canWeWriteOurRansomNote(magazine, ransom));
    }

    @Test
    public void test1() throws Exception {
        String[] magazine = "o l x imjaw bee khmla v o v o imjaw l khmla imjaw x".split(" ");
        String[] ransom = "imjaw l khmla x imjaw o l l o khmla v bee o o imjaw imjaw o".split(" ");
        assertEquals("NO", Ransom.canWeWriteOurRansomNote(magazine, ransom));
    }

}