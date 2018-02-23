package Exo1;

/**
 * Classe Employé
 */
public class EmployeCorriger extends Personne {

    private float salaire;
    private float[] prime;

    /**
     * Constructeur employé
     */

    EmployeCorriger(String nom, String prenom, float salaire) {
        super(nom, prenom);
        this.salaire = salaire;
    }

    /**
     * Geteur et Seteur
     */
    public float getSalaire() {
        return salaire;
    }

    public float[] getPrime() {
        return prime;
    }

    public void setSalaire(float salaire) {
        this.salaire = salaire;
    }

    public void setPrime(float[] prime) {
        this.prime = prime;
    }

    /**
     * Méthode de classe
     */
    public float getSalaireFinal() {
        int primeLen = prime.length;
        float salaireF = salaire;

        for (int i = 0; i < primeLen; i++) {
            salaireF += prime[i];
        }
        return salaireF;
    }
}
