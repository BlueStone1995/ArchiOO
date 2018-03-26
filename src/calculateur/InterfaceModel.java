package calculateur;

import calculateur.Exception.DivisionException;
import calculateur.Exception.OpException;

public interface InterfaceModel {
    float calculer(float a, float b, String op) throws OpException, DivisionException;
}
