package com.company;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class MainTest extends junit.framework.TestCase {

    StringCalculator sc = new StringCalculator();
    @Test
    public void add_emptyString_returns0(){

        int result = sc.add("");
        assertEquals(result, 0);
    }

    @Test
    public void add_singleNumber_returnsThatNumber() {

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

    @Test
    public void add_delimiters_returnsSum() {
        int result = sc.add("//;\n1;5;7");
        assertEquals(result, 13);
    }

    @Test
    public void add_negatives_returnsSum() {
        try{
            int result = sc.add("-5,7,-2");
        }catch (IllegalArgumentException e){
            assertEquals(e.getMessage(), "Negatives are not allowed: -5,-2");
        }

    }

    @Test
    public void add_ignoreBiggerThan1000_returnsSum() {
        int result = sc.add("2,1002,5");
        assertEquals(result, 7);
    }
}

