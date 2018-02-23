package Exo3;

public class AppliCalculette {

    private GestionnaireCalculette i;

    AppliCalculette() {
        i = new GestionnaireCalculette();
        i.lancerCalculette();
    }


    public static void main(String[] args) {

        // Crée objet AppliCalculette
        AppliCalculette m = new AppliCalculette();

    }
}
