/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo.jeu.de.dé;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Christophe
 */
public class JeuDeDe {

    private int nbreJoueur, nbreDés;
    ArrayList<Joueur> joueurs = new ArrayList();                            // Liste des joueurs
    ArrayList<De> dés = new ArrayList();                                    // Liste des dés
    boolean partieEncours = true;

    public JeuDeDe() {
        nbreDés = 2;
    }

    public void inscriptionJoueur() {                                       // Méthode pour la saisie des noms des joueurs
        Scanner nombre = new Scanner(System.in);
        System.out.println("Combien de joueurs ? ");
        nbreJoueur = Integer.parseInt(nombre.nextLine());

        for (int i = 1; i <= nbreJoueur; i++) {
            joueurs.add(new Joueur());                                      // Chaque nouveau joueur est enregistré dans la liste joueurs
        }
        creationDés();
    }

    private void creationDés() {                                            // Méthode pour la création des dés

        for (int i = 1; i <= nbreDés; i++) {
            dés.add(new De());                                              // Chaque nouveau dé est enregistré dans la liste dés
        }
        jouerUnePartie();

    }

    public void jouerUnePartie() {

        while (partieEncours) {
            for (Joueur j : joueurs) {                                      // Boucle for each qui fait jouer chaque joueur à tour de rôle
                j.lancerLesDés(dés);
                j.doubleSix(dés);                                           // test s'il y a un double six

                //System.out.println("Le score du joueur " + j.getNomJoueur() + " = " + j.getscore());
                if (j.asTuGagne()) {
                    System.out.println("Le joueur " + j.getNomJoueur() + " a fait 5 fois le double six");
                    partieEncours = false;
                }
            }
        }
    }
}
