package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TotalCountTest {
    TotalCount totalcount;

    @Before
    public void setUp() throws Exception {
        this.totalcount=new TotalCount();
    }

    @After
    public void tearDown() throws Exception {
        this.totalcount = null;
    }

    @Test
    public void givenInputValueShouldReturnCountedNumber() {
        int expected=10;
        String inputValue="java is java again java again";
        char a='a';
        assertEquals(expected,totalcount.countFunction(inputValue,a));
    }
}