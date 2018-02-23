package Exo1;

/**
 * Classe abstraite Personne
 */
abstract class Personne {

    protected String nom;
    protected String prenom;

    /**
     * Constructeur par défaut
     * @param nom
     * @param prenom
     */
    Personne(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }

    /**
     * Geteur et Seteur
     */
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * Méthode de Classe
     */
    public void addNom(String s) {
        this.nom = s;
    }


}
