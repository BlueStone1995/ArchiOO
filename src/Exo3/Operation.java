package Exo3;

import Exo3.Exception.DivisionException;

public interface Operation {
    public float execute(float a, float b) throws DivisionException;
}
