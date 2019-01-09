package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveCheckTest {
    ConsecutiveCheck obj;

    @Before
    public void setUp() throws Exception {
        obj=new ConsecutiveCheck();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkConsecutiveSuccess() {
        assertEquals(true,obj.checkConsecutive("96,95,94,93"));
    }

    @Test
    public void checkConsecutiveFailure() {
        assertNotEquals(true,obj.checkConsecutive("98,96,95,94,93"));
    }
}