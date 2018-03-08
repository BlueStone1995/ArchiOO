package Exo3;

import Exo3.Exception.DivisionException;
import Exo3.Exception.OpException;

public class AppliCalculette {

    private GestionnaireCalculette i;

    public AppliCalculette() throws OpException, DivisionException {
        i = new GestionnaireCalculette();
        i.lancerCalculette();
    }


    public static void main(String[] args) throws OpException, DivisionException {

        // Crée objet AppliCalculette
        AppliCalculette m = new AppliCalculette();

    }
}
