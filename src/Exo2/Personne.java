package Exo2;

public abstract class Personne {

    protected String nom;
    protected String prenom;
    protected String telephone;
    protected String adresse;
    protected static int nbPersonne = 0;

    Personne(String nom, String prenom, String telephone, String adresse){
        this.nom = nom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.adresse = adresse;
        nbPersonne++;
    }

    static void nbPersonnes(){
        System.out.println("Nombre de personne : " + nbPersonne);
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return nom + " " + prenom + " " + adresse + " " + telephone;
    }
}
