package Exo3;

import Exo3.Exception.DivisionException;
import Exo3.Exception.OpException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GestionnaireCalculette {

    private Calculator c;

    public GestionnaireCalculette() throws OpException {
        c = new Calculator();
        try {
            c.addOperation("+", new Addition()); //via méthode de type set : addOperation
            c.addOperation("-", new Soustraction());
            c.addOperation("*", new Multiplication());
            c.addOperation("/", new Division());
        } catch (OpException o) {
            System.out.println("Opération inconnue !");
        }
    }

    public float calculer(float a, float b, String op) throws OpException, DivisionException {
        c.init(a, b, op);
        return c.calc();
    }


    public void lancerCalculette() throws OpException, DivisionException {
        Scanner sc = new Scanner(System.in);
        String cont = "y";

        while (cont.equals("y")) {
            try {
                //Entrer commande utilisateur
                System.out.println("Entrer chiffre a : ");

                float a = sc.nextFloat();

                System.out.println("Entrer chiffre b : ");
                float b = sc.nextFloat();
                sc.nextLine();

                System.out.println("Entrer opération op : ");
                String op = sc.nextLine();

                //Calcul
                try {
                    float r = this.calculer(a, b, op);
                    System.out.println("Resultat : " + a + " " + op + " " + b + " = " + r + "\n");
                } catch (DivisionException e) {
                    System.out.println("Division par 0 interdite !\n");
                } catch (OpException o) {
                    //System.out.println("Opération inconnue !");
                }
            } catch (InputMismatchException e) {
                System.out.println("Exception : entrer un nombre\n");
            }
            System.out.println("Nouveau calcul ? (y/n)");
            sc.nextLine();
            cont = sc.nextLine();
        }
    }
}
