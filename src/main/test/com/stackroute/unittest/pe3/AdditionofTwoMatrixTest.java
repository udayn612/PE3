package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionofTwoMatrixTest {

    int a[][]={{10,10},{10,10},{10,10}};

    int d[][]={{11,10},{10,10},{10,10}};

    int b[][]={{1,2},{3,4},{5,6}};
    int c[][]={{9,8},{7,6},{5,4}};

    AdditionofTwoMatrix additionofTwoMatrix;


    @Before
    public void setUp() throws Exception {
        additionofTwoMatrix=new AdditionofTwoMatrix();
    }

    @After
    public void tearDown() throws Exception {
    }



    @Test
    public void compareMatrixSuccess()
    {

        assertArrayEquals(a,additionofTwoMatrix.addTwoMatrix(b,c,3,2));
    }
    @Test
    public void compareMatrixFailure()
    {

        assertNotEquals(d,additionofTwoMatrix.addTwoMatrix(b,c,3,2));
    }

}