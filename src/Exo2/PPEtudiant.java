package Exo2;

import java.util.Scanner;

public class PPEtudiant {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez nom : ");
        String nom = sc.nextLine();
        sc.nextLine();

        System.out.println("Entrez prenom : ");
        String prenom = sc.nextLine();
        sc.nextLine();

        System.out.println("Entrez adresse : ");
        String adresse = sc.nextLine();
        sc.nextLine();

        System.out.println("Entrez telephone : ");
        String tel = sc.nextLine();
        sc.nextLine();

        Etudiant e1 = new Etudiant(nom, prenom, tel, adresse);

        int[] note = new int[4];
        for (int i = 0; i < note.length; i++) {
            System.out.println("Entrer note " + i);
            note[i] = sc.nextInt();
        }
        e1.setNote(note);
        e1.moyenne();
        e1.adm();
    }
}
