package Exo1; /**
 * Exo 1
 * Analyse code
 */
import java.util.Scanner;

/**
 * Code devrait être plus commenter
 * Devrait comporter constructeur
 * Devrait comporter méthode toString pour affichage
 */

public class Employe {

    /**
     * Variables devrait etre privé et plus explicite
     */
    String n, p;

    /**
     * Méthode de classe qui devrait appartenir à une classe abstraite Personne
     */
    public void addnom(String s) {
        n = s;
    }

    public String getnom() {
        return n;
    }

    public void setnom(String s) {
        n = s;
    }

    public String getprenom() {
        return p;
    }


    /**
     * Variables non explicite, qui devrait appartenir à une classe Employee qui hérite de Personne
     */
    float sal;
    float[] pr;

    //Méthode qui devrait appartenir à la classe Employee
    public float[] getPrimes() {
        return pr;
    }

    public void setPrimes(float[] primes) {
        pr = primes;
    }

    ;

    public void setSalaire(float s) {
        this.sal = s;
    }

    public float getSalaire() {
        return this.sal;
    }

    public float getSalaireFinal() {
        float s = sal; //variable pas clair
        int i = 0;

        for (; ; ) {
            if (pr.length == i) break;
            s += pr[i++];
        }
        return s;
    }


    /**
     * Classe avec même nom que classe qui l'encapsule
     * Contenu devrait être situé dans classe PPEmploye et non Employe
     *
     * Gestion des exceptions non géré
     *
     */
    public Employe() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nom ?");
        n = sc.next();
        System.out.println("Prénom ?");
        p = sc.next();
        sal = (float) 1430.22; //smic en 1/1/2013
    }

    /**
     * Méthode qui devrait etre dans le PPEmploye
     *
     * Gestion des exceptions inexistante
     *
     */
    public int compareTo(Object o) {
        if (o != null) {
            return this.n.compareTo(((Employe) o).n);
        } else return 0;
    }
}
