/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Exo3.Test;

import Exo3.Division;
import Exo3.Exception.DivisionException;
import Exo3.Exception.OpException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DivisionTest {

    Division div = new Division();
    float a = 8;
    float b = 2;

    @Before
    public void setUp() throws Exception {
        System.out.println("Defining test data");
        a = 8;
        b = 2;
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Closing test");
        a = 0;
        b = 0;
    }

    @Test
    public void testExecute() throws OpException, DivisionException {
        System.out.println("Test execute");
        float expResult = 4;
        float result = div.execute(a, b);
        assertEquals(expResult, result, 0);
    }
}