package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveCheckTest {
    ConsecutiveCheck consecutiveCheck;

    @Before
    public void setUp() throws Exception {
        consecutiveCheck=new ConsecutiveCheck();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkConsecutiveSuccess() {
        assertEquals(true,consecutiveCheck.checkConsecutive("96,95,94,93"));
    }

    @Test
    public void checkConsecutiveFailure() {
        assertNotEquals(true,consecutiveCheck.checkConsecutive("98,96,95,94,93"));
    }
}