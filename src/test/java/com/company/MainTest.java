package com.company;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class MainTest extends junit.framework.TestCase {

    StringCalculator sc = new StringCalculator();
    @Test
    public void add_emptyString_returns0(){

        //StringCalculator sc = new StringCalculator();
        int result = sc.add("");
        assertEquals(result, 0);
    }

    @Test
    public void add_singleNumber_returnsThatNumber() {
       // StringCalculator sc = new StringCalculator();
        int result = sc.add("3");
        assertEquals(result, 3);

    }

    @Test
    public void add_twoNumbers_returnsSum() {
        int result = sc.add("1,5");
        assertEquals(result, 6);
    }

    @Test
    public void add_MoreNumbers_returnsSum() {
        int result = sc.add("1,5,7");
        assertEquals(result, 13);
    }

    @Test
    public void add_newline_returnsSum() {
        int result = sc.add("1\n5,7");
        assertEquals(result, 13);
    }


}

