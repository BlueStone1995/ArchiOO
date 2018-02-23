package Exo1;

import java.util.Scanner;

/**
 * Programme Principal Employé
 */
public class PPEmploye {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nom ?");
        String nom = sc.nextLine();

        sc.nextLine(); //vide scanner

        System.out.println("Prénom ?");
        String prenom = sc.nextLine();

        float salaire = (float) 1430.22; //smic en 1/1/2013

        EmployeCorriger Bob = new EmployeCorriger(nom, prenom, salaire);
        EmployeCorriger Nicolas = new EmployeCorriger("Adam", "Nicolas", 1500);

        Bob.getNom().compareTo(Nicolas.getNom()); //compareTo

    }
}
