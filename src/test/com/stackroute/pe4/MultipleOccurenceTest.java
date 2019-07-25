package com.stackroute.pe4;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MultipleOccurenceTest {
    MultipleOccurence multipleoccurence;

    @Before
    public void setUp() throws Exception {
        this.multipleoccurence = new MultipleOccurence();
    }

    @After
    public void tearDown() throws Exception {
        this.multipleoccurence=null;
    }

    @Test
    public void givenInputStringAndShouldReturnMultipleOccurence() {
        ArrayList<String> list=new ArrayList<>();
        list.add("4 6");
        list.add("10 12");
        list.add("27 29");
        String actual="She sells seashells by the seashore";
        assertEquals(list,multipleoccurence.occurance(actual));
    }
}