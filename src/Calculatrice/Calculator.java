package Calculatrice;

import java.util.HashMap;
import java.util.Map;

public class Calculator {

    private Map<String, Operation> operations;
    private float a;
    private float b;
    private String op;

    Calculator() {
        this.a = 0;
        this.b = 0;
        this.op = "+";
        this.operations = new HashMap<String, Operation>();
    }

    public void addOperation(String sym, Operation op) {
        this.operations.put(sym, op); //On rajoute opération dans map
    }

    public void init(float a, float b, String op) {
        this.a = a;
        this.b = b;
        this.op = op;
    }

    public float calc() {
        float r = 0;

        Operation o = this.operations.get(this.op); //Récupère opération dans mon map via sa version string

        if (o == null) {
            System.out.println("Opération inconnue");
        }

        return o.execute(a, b); // Retourne résultat

    }

    public long calculateUnary(long number1, String operator) {

        return (long) Math.pow(number1, 2);
    }

}
