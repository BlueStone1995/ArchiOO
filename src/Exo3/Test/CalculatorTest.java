/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Exo3.Test;

import Exo3.Calculator;
import Exo3.Operation;

import java.util.Map;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @org.junit.Before
    public void setUp() throws Exception { // setup des données avant chaque test
    }

    @org.junit.After
    public void tearDown() throws Exception { // Cleanup apres chaque
    }

    @org.junit.Test
    public void testAddOperation() { // A faire
        System.out.println("Test addOperztion");
        Map<String, Operation> expResult;
        // float result = calculator.addOperation("+", AdditionTest);
        // assertEquals(expResult, result, 0);
    }

    @org.junit.Test
    public void testInit() {
    }

    @org.junit.Test
    public void testCalc() {
    }
}