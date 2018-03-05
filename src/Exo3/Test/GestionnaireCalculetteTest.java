/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Exo3.Test;

import Exo3.Calculator;
import Exo3.GestionnaireCalculette;
import Exo3.Test.CalculatorTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GestionnaireCalculetteTest {

    GestionnaireCalculette gestionnaireCalculette = new GestionnaireCalculette();

    // Données
    Calculator calculator = new Calculator();
    float a = -1;
    float b = 3;
    String op = "+";

    @Before
    public void setUp() throws Exception {
        System.out.println("Defining test data");

        Calculator calculator = new Calculator();
        float a = -1;
        float b = 3;
        String op = "+";
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Closing test");

        Calculator calculator = new Calculator();
        float a = 0;
        float b = 0;
        String op = " ";
    }

    @Test
    public void testCalculer() {
        System.out.println("Test calculer execute");

        float expResult = 2;
        float result = gestionnaireCalculette.calculer(a, b, op);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testLancerCalculette() {
        System.out.println("Test lancer execute");
        gestionnaireCalculette.lancerCalculette();
    }
}