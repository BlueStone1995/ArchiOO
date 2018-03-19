/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package calculateur;

import calculateur.Exception.DivisionException;
import calculateur.Exception.OpException;

public interface InterfaceModel {
    void init(float a, float b, String op);

    float calc() throws OpException, DivisionException;

    void addOperation(String sym, Operation op) throws OpException;

}
