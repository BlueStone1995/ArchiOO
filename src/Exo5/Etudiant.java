package Exo5;


import java.util.Scanner;

public class Etudiant implements Objet {

    private int idEtudiant;
    private String cursus;
    private String nomEtudiant;
    private static int nbEtudiant = 0;

    Etudiant() {
        this.idEtudiant = 0;
        nbEtudiant++;
    }

    @Override
    public Objet execute(int indice) {
        Etudiant e = new Etudiant();
        e.init();
        return e;
    }

    @Override
    public String toString() {
        return "[ id : " + this.idEtudiant + ", nom : " + this.nomEtudiant + ", cursus : " + this.cursus + "]";
    }

    public void init() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrer nom étudiant");
        this.nomEtudiant = sc.nextLine();

        System.out.println("Entrer cursus étudiant");
        this.cursus = sc.nextLine();
    }


    /**
     * Getteurs and Setteurs
     */
    public void setNumEtudiant(int numEtudiant) {
        this.idEtudiant = numEtudiant;
    }

    public void setCursus(String cursus) {
        this.cursus = cursus;
    }


    public static void setNbEtudiant(int nbEtudiant) {
        Etudiant.nbEtudiant = nbEtudiant;
    }


    public int getNumEtudiant() {
        return idEtudiant;
    }

    public String getCursus() {
        return cursus;
    }

    public static int getNbEtudiant() {
        return nbEtudiant;
    }


}
