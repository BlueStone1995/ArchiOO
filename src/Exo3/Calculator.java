package Exo3;

import Exo3.Exception.DivisionException;
import Exo3.Exception.OpException;

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
        if (this.op.equals("+") || this.op.equals("-") || this.op.equals("/") || this.op.equals("*")) {
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

}
