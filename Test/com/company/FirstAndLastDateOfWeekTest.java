package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstAndLastDateOfWeekTest {

    FirstAndLastDateOfWeek firstAndLastDateOfWeek;
    @Before
    public void setUp() throws Exception {
        firstAndLastDateOfWeek=new FirstAndLastDateOfWeek();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkfirstDateofWeek() {
        assertEquals("Mon 07/01/2019",firstAndLastDateOfWeek.firstDateofWeek());
    }

    @Test
    public void checkLastDateofWeek() {
        assertEquals("Sun 13/01/2019",firstAndLastDateOfWeek.lastDateofWeek());
    }
}