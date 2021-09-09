package com.company;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(JUnit4.class)
public class MainTest extends junit.framework.TestCase {
    @Test
    public void Add_EmptyString_Return0(){

        StringCalculator sc = new StringCalculator();
        int result = sc.add("");
        Assert.assertEquals(result, 0);
    }
}

class StringCalculator{
    public int add(String numbers){
        return 0;
    }
}