/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Exo5;

import java.util.Scanner;

public class GestionnaireTableauObjets {

    private TableauObjets tabObj;

    GestionnaireTableauObjets() {
        tabObj = new TableauObjets();
        tabObj.addObjet("etudiant", new Etudiant());
        tabObj.addObjet("professeur", new Professeur());
    }

    public void remplirTabObj(int taille, String obj, int indice) {
        tabObj.init(taille, obj, indice);
        tabObj.remplirTab();
    }

    public void afficherTab() {
        this.tabObj.afficher();
    }


    public void lancerAppli() {
        Scanner sc = new Scanner(System.in);

        //Entrer commande utilisateur
        int taille = -1;
        do {
            System.out.println("Entrer taille du tableau > 0 : ");
            taille = sc.nextInt();
        } while (taille <= 0);

        sc.nextLine();

        System.out.println("Objet disponible : etudiant, professeur");
        System.out.println("Entrer objet du tableau : ");
        String obj = sc.nextLine();

        int indice = 0;
        do {
            System.out.println("Entrer indice du tableau à remplir entre 0 et " + (taille - 1) + " : ");
            indice = sc.nextInt();
        } while (indice < 0 || indice > (taille - 1));

        this.remplirTabObj(taille, obj, indice);
        this.afficherTab();
    }
}
