/**
 * Réponses questions :
 * a) Comment avez-vous fait la gestion des cases vides ?
 * Les cases vides ont été initialisé à "null" dans la classe TableauObjets
 * <p>
 * b) Comment avez-vous géré la suppression d’une case ?
 * Pas de réponse à cette question...
 * <p>
 * c) Garantissez-vous la contrainte d’avoir une taille qui reste fixe pour le tableau ?
 * Oui, la taille du tableau est initialisé puis fixé dans la classe TableauObjets via static.
 * De plus aucune méthode ne permet de modifier la taille du tableau (pas de setTaille).
 * <p>
 * d) Comment avez-vous fait pour assurer que tous les objets appartiennent à la même classe ?
 * On demande l'objet du tableau à la ligne 58.
 */


package Exo5;


public class AppliTableauObjets {

    private GestionnaireTableauObjets i;

    AppliTableauObjets(){
        i = new GestionnaireTableauObjets();
        i.lancerAppli();
    }




    public static void main(String[] args) {

        // Lance application
        AppliTableauObjets appli = new AppliTableauObjets();

    }
}
