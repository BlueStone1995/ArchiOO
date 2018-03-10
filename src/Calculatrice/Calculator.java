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

public class Calculator {

    private Map<String, Operation> operations;
    private float a;
    private float b;
    private String op;

    public Calculator() {
        this.a = 0;
        this.b = 0;
        this.op = "+";
        this.operations = new HashMap<String, Operation>();
    }

    public void addOperation(String sym, Operation op) throws OpException {
        if (this.op.equals("+") || this.op.equals("-") || this.op.equals("/") || this.op.equals("*") || this.op.equals("^")) {
            this.operations.put(sym, op); //On rajoute opération dans map
        } else {
            new OpException();
        }
    }

    public void init(float a, float b, String op) {
        this.a = a;
        this.b = b;
        this.op = op;
    }

    public float calc() throws OpException, DivisionException {
        Operation o = this.operations.get(this.op); //Récupère opération dans mon map via sa version string

        if (o == null) {
            throw new OpException();
            //System.out.println("Opération inconnue");
        }

        return o.execute(a, b); // Retourne résultat
    }

    public long calculateUnary(long number1, String operator) {

        return (long) Math.pow(number1, 2);
    }

}
