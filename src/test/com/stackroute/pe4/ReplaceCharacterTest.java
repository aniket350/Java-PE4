package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
//a program to replace the alphabets and again print the string.

public class ReplaceCharacterTest {
    ReplaceCharacter replacecharacter;

    @Before
    public void setUp() throws Exception {
        this.replacecharacter=new ReplaceCharacter();
    }

    @After
    public void tearDown() throws Exception {
        this.replacecharacter=null;
    }

    @Test
    public void givenInputStringAndShouldReturnReplacedString() {
        String expected="faity fry";
        String actual="daily fry";
        assertEquals(expected,replacecharacter.replaceCharacter(actual));
    }
}