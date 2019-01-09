package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardPatternTest {

    String a="WW|BB|WW|BB|WW|BB|WW|BB|\n"+
            "BB|WW|BB|WW|BB|WW|BB|WW|\n"+
            "WW|BB|WW|BB|WW|BB|WW|BB|\n"+
            "BB|WW|BB|WW|BB|WW|BB|WW|\n"+
            "WW|BB|WW|BB|WW|BB|WW|BB|\n"+
            "BB|WW|BB|WW|BB|WW|BB|WW|\n"+
            "WW|BB|WW|BB|WW|BB|WW|BB|\n"+
            "BB|WW|BB|WW|BB|WW|BB|WW|\n";

    ChessBoardPattern obj;

    @Before
    public void setUp() throws Exception {
        obj=new ChessBoardPattern();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkChessBoardPattern() {
        assertEquals(a,obj.chessBoardPattern());
    }
}