package com.stackroute.pe4;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SortingCharacterTest {
    SortingCharacter sortingcharacter;

    @Before
    public void setUp() throws Exception {
        this.sortingcharacter = new SortingCharacter();
    }

    @After
    public void tearDown() throws Exception {
        this.sortingcharacter=null;
    }

    @Test
    public void givenInputStringAndShuouldReturnSortedCharacter() {
//        String expected="apple bat cat dog elephant";
        ArrayList<String> list=new ArrayList<>();
        list.add("apple");
        list.add("bat");
        list.add("cat");
        list.add("dog");
        list.add("elephant");

        String actual="dog elephant bat cat apple";
        assertEquals(list,sortingcharacter.sort(actual));

    }
}