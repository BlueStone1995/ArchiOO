package Exo2;

public class Etudiant extends Personne {

    //Variables
    private int[] note = new int[4];
    private static int noteLength = 4;
    private String resultat;

    //Constructeur
    Etudiant(String nom, String prenom, String telephone, String adresse) {
        super(nom, prenom, telephone, adresse);
    }

    public int[] getNote() {
        return note;
    }

    public void setNote(int[] note) {
        this.note = note;
    }

    //Calcul moyenne
    public float moyenne() {

        float moy = 0;

        for (int i = 0; i < noteLength; i++) {
            moy += moy + this.note[i];
        }
        return moy/noteLength;
    }

    //Admis ou non admis
    public void adm(){
        float moy = this.moyenne();
       if(moy >= 10){
           this.resultat = "admis";
       }else{
           this.resultat = "non admis";
       }
        System.out.println(super.toString() + " " + moy + " " + resultat);
    }

    @Override
    public String toString() {
        return super.toString() + " " + note[1] + " " + note[2] + " " + note[3] + " " + note[4];
    }
}
