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

public interface Modele {
    void init(float a, float b, String op);

    void addOperation(String sym, Operation op) throws OpException;

    float calc() throws OpException, DivisionException;

}
