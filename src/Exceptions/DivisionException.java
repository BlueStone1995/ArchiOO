package Exceptions;

public class DivisionException extends MainException {
    public DivisionException() {
        System.out.println("Erreur : division par zéro impossible");
    }
}
