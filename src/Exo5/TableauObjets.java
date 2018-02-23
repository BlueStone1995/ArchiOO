package Exo5;

import java.util.HashMap;
import java.util.Map;

public class TableauObjets {

    private Map<String, Objet> obj;
    private static int taille; //taille fixe garantie par static
    private Object[] tab;
    private String nomObj;
    private int indice;

    TableauObjets() {
        this.taille = 1;
        this.indice = 0;
        this.nomObj = "etudiant";
        this.tab = new Etudiant[1];
        this.obj = new HashMap<>();

    }

    public void addObjet(String sym, Objet o) {
        this.obj.put(sym, o);

    }

    public void init(int n, String o, int i) {
        this.taille = n;
        this.nomObj = o;
        this.indice = i;
        this.tab = new Object[n];

        //Remplis case vide à null
        for(int j = 0; i < n; i++){
            this.tab[j] = null;
        }
    }

    public void afficher() {
        int tabLength = this.tab.length;
        for (int i = 0; i < tabLength; i++) {
            //Case vide = null
            System.out.println("tab[" + i + "] = " + this.tab[i]);

        }
    }

    public void remplirTab() {
        Objet o = this.obj.get(this.nomObj); // Récupère objet à partir de son nom

        if (o != null) {
            this.tab[this.indice] = o.execute(this.indice);
        } else {
            System.out.println("Objet inconnue...");
        }

    }

    /**
     *
     * Getteur et Setteur
     */

    public Map<String, Objet> getObj() {
        return obj;
    }

    public void setObj(Map<String, Objet> obj) {
        this.obj = obj;
    }

    public static int getTaille() {
        return taille;
    }

    public Object[] getTab() {
        return tab;
    }

    public void setTab(Object[] tab) {
        this.tab = tab;
    }

    public String getNomObj() {
        return nomObj;
    }

    public void setNomObj(String nomObj) {
        this.nomObj = nomObj;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

}
