package Exo3;

import java.util.Scanner;

public class GestionnaireCalculette {

    private Calculator c;

    public GestionnaireCalculette() {
        c = new Calculator();
        c.addOperation("+", new Addition()); //via méthode de type set : addOperation
        c.addOperation("-", new Soustraction());
        c.addOperation("*", new Multiplication());
        c.addOperation("/", new Division());
    }

    public float calculer(float a, float b, String op) {
        c.init(a, b, op);
        return c.calc();
    }


    public void lancerCalculette() {
        Scanner sc = new Scanner(System.in);
        String cont = "y";

        while (cont.equals("y")) {
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
                System.out.println("Resultat : " + a + " " + op + " " + b + " = " + r);
            } catch (ArithmeticException e) {
                System.out.println("Division par 0 interdite !");
            }

            System.out.println("Nouveau calcul ? (y/n)");
            cont = sc.nextLine();
        }
    }
}
