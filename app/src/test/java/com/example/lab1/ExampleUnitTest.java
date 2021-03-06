package com.example.lab1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_myMAX() {
        MainActivity m = new MainActivity();
        assertEquals(m.myMAX(4,5,9), 9);
    }

    @Test
    public void addition_myMAX_ravno() {
        MainActivity m = new MainActivity();

        assertEquals(m.myMAX(1,1,1), 1);
    }

    @Test
    public void addition_myMAX_minus() {
        MainActivity m = new MainActivity();
        assertEquals(m.myMAX(-3,-7,-2), -2);
    }

    @Test
    public void addition_myMAX_vse() {
        MainActivity m = new MainActivity();

        assertEquals(m.myMAX(4,-10,0), 4);
    }

    @Test
    public void addition_myMIN() {
        MainActivity m = new MainActivity();
        assertEquals(m.myMIN(4,5,9), 4);
    }

    @Test
    public void addition_myMIN_ravno() {
        MainActivity m = new MainActivity();

        assertEquals(m.myMIN(1,1,1), 1);

    }

    @Test
    public void addition_myMIN_nol() {
        MainActivity m = new MainActivity();

        assertEquals(m.myMIN(0,0,1), 0);
    }

    @Test
    public void addition_myMIN_minus() {
        MainActivity m = new MainActivity();

        assertEquals(m.myMIN(-10,-8,0), -10);
    }

}