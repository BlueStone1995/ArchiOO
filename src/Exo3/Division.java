package Exo3;

public class Division implements Operation  {

    @Override
    public float execute(float a, float b)  {
            if (b == 0) {
                throw new ArithmeticException();
            } else {
                return (a / b);
            }
    }

}
