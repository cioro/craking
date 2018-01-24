package datastructures;

import org.junit.Test;

import static org.junit.Assert.*;

public class DavisStaircasesTest {
    @Test
    public void c_n() throws Exception {
    }

    @Test
    public void c_n_loop() throws Exception {
        assertEquals(1, DavisStaircases.c_n_loop(1));
        assertEquals(3, DavisStaircases.c_n_loop(4));
        assertEquals(7, DavisStaircases.c_n_loop(44));
    }

    @Test
    public void c_n_mem() throws Exception {
        assertEquals(1, DavisStaircases.c_n_mem(1));
        assertEquals(4, DavisStaircases.c_n_mem(3));
        assertEquals(44, DavisStaircases.c_n_mem(7));
    }
}