package Exo5;


import java.util.Scanner;

public class Professeur implements Objet {

    private int idProfesseur;
    private String cursus;
    private String nomProfesseur;
    private static int nbProfesseur = 0;

    Professeur() {
        this.idProfesseur = 0;
        nbProfesseur++;
    }


    @Override
    public Objet execute(int indice) {
        Professeur e = new Professeur();
        e.init();

        return e;
    }

    @Override
    public String toString() {
        return "[" + this.idProfesseur + " " + this.nomProfesseur + " " + this.cursus + "]";
    }

    public void init() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrer nom professeur");
        this.nomProfesseur = sc.nextLine();

        System.out.println("Entrer cursus professeur");
        this.cursus = sc.nextLine();
    }

    // Getteur et Setteur
    public int getIdProfesseur() {
        return idProfesseur;
    }

    public void setIdProfesseur(int idProfesseur) {
        this.idProfesseur = idProfesseur;
    }

    public String getCursus() {
        return cursus;
    }

    public void setCursus(String cursus) {
        this.cursus = cursus;
    }

    public String getNomProfesseur() {
        return nomProfesseur;
    }

    public void setNomProfesseur(String nomProfesseur) {
        this.nomProfesseur = nomProfesseur;
    }

    public static int getNbProfesseur() {
        return nbProfesseur;
    }

    public static void setNbProfesseur(int nbProfesseur) {
        Professeur.nbProfesseur = nbProfesseur;
    }

}
