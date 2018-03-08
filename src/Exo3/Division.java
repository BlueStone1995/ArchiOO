package Exo3;

import Exo3.Exception.DivisionException;

public class Division implements Operation {

    @Override
    public float execute(float a, float b) throws DivisionException {
        if (b == 0) {
            throw new DivisionException();
        } else {
            return (a / b);
        }
    }

}
