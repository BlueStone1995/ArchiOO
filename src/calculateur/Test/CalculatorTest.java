/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package calculateur.Test;

import calculateur.Addition;
import calculateur.Calculator;
import calculateur.Exception.DivisionException;
import calculateur.Exception.OpException;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    // Données
    float a = -1;
    float b = 3;
    String op = "+";
    Addition add = new Addition();


    @org.junit.Before
    public void setUp() throws Exception { // setup des données avant chaque test
        System.out.println("Defining test data");
        float a = -1;
        float b = 3;
        op = "+";
        Addition add = new Addition();
    }

    @org.junit.After
    public void tearDown() throws Exception { // Cleanup apres chaque
        System.out.println("Closing test");
        float a = 0;
        float b = 0;
        Addition add = new Addition();
    }

    @org.junit.Test
    public void testAddOperation() throws OpException {
        System.out.println("Test addOperation execute");
        calculator.addOperation(op, add);
    }


    @org.junit.Test
    public void testCalculer() throws OpException, DivisionException {
        System.out.println("Test calc execute");

        calculator.addOperation(op, add);

        float expResult = 2;
        float result = calculator.calculer(a, b, op);
        assertEquals(expResult, result, 0);
    }
}