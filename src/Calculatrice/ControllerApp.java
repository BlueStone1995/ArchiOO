/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Calculatrice;

import Calculatrice.Exception.DivisionException;
import Calculatrice.Exception.OpException;

import java.util.HashMap;
import java.util.Map;

public class ControllerApp {

    private float a;
    private float b;
    private String operation;
    private Map<String, Modele> modele;

    ControllerApp() {
        this.a = 0;
        this.b = 0;
        this.operation = "+";
        this.modele = new HashMap<String, Modele>();
    }

    public void initController() {

    }
}
