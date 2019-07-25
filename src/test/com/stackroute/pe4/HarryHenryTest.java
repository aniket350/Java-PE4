package com.stackroute.pe4;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HarryHenryTest {

    HarryHenry harryhenry;
    @Before
    public void setUp() throws Exception {
        this.harryhenry = new HarryHenry();
    }

    @After
    public void tearDown() throws Exception {
        harryhenry=null;
    }

    @Test
    public void givenInputStringShouldValidateString() {

        boolean expected=true;
        String actual="is harry there";
        boolean expected1=false;
        String actual1="is henry there?";
        assertEquals(expected,harryhenry.findHarry(actual));
        assertEquals(expected1,harryhenry.findHarry(actual1));

    }
}