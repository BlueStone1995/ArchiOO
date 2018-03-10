package Calculatrice;

public class Puissance implements Operation {

    public float execute(float a, float b) {
        return (float) Math.pow(a, b);
    }
}
