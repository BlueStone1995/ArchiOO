/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Calculatrice.Test;

import Calculatrice.Multiplication;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplicationTest {
    // Données pour mes test :
    Multiplication multiplication = new Multiplication();
    float a = -1;
    float b = 3;

    @Before
    public void setUp() throws Exception {
        System.out.println("Defining test data");
        a = -1;
        b = 3;
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Closing test");
        a = 0;
        b = 0;
    }

    @Test
    public void testExecute() {
        System.out.println("Test execute");
        float expResult = -3;
        float result = multiplication.execute(a, b);
        assertEquals(expResult, result, 0);
    }
}