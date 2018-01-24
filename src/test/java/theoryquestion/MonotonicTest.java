package theoryquestion;

import org.junit.Test;

import static org.junit.Assert.*;

public class MonotonicTest {
    @Test
    public void modeTest() throws Exception {
        int[] array = {1, 4, 8, 9, 7, 6, 2};
        assertEquals(9, Monotonic.mode(array));
    }

}