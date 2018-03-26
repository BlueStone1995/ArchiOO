/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package CalculatriceMVCV2;

import Exceptions.DivisionException;



import java.util.HashMap;
import java.util.Map;


public class Calculator implements Inmodele {
	private Map<String, Operation> operations;

	public Calculator() {
		this.operations = new HashMap<>();
	}

	public float calculer(float a, float b, String op) throws DivisionException {
		Operation op1 = this.operations.get(op);
		return op1.execute(a, b);
	}


	public void addOperation(String sym, Operation op) {
		this.operations.put(sym, op);
	}


}
