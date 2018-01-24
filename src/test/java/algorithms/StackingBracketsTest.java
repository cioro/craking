package algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackingBracketsTest {
    @Test
    public void returnTrueForAnEvenString() throws Exception {
        assertTrue(StackingBrackets.isBalanced("{[()]}"));
    }

    @Test
    public void returnFalseForAnOddString() throws Exception {
        assertFalse(StackingBrackets.isBalanced("{[(]}"));
    }
}