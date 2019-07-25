package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeStringTest {
    TransposeString transposestring;

    @Before
    public void setUp() throws Exception {
        this.transposestring=new TransposeString();
    }

    @After
    public void tearDown() throws Exception {
        transposestring=null;
    }

    @Test
    public void transpose() {

        //act

        String expected="a kciuq nworb xof spmuj revo eht yzal god";
        String actual="a quick brown fox jumps over the lazy dog";
        assertEquals(expected,transposestring.transposeString(actual));
    }
}