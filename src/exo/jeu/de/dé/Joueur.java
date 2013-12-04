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
public class Joueur {

    public int score;
    String nomJoueur;
    private static int numJoueur = 1;                                               // la variable appartient à la classe et pas aux instances joueur

    public Joueur() {

        nomJoueur();
    }

    public final String nomJoueur() {

        Scanner nom = new Scanner(System.in);                                       // Relève les noms des joueurs
        System.out.println("Quel est le nom du joueur n°" + numJoueur + " ?");
        nomJoueur = nom.nextLine();
        numJoueur += 1;
        return nomJoueur;
    }

    public void lancerLesDés(ArrayList<De> dés) {
        for (De d : dés) {
            d.lancer();
        }
    }

    public void doubleSix(ArrayList<De> dés) {

        if ((dés.get(0).lireValeur() == 6) && (dés.get(1).lireValeur() == 6)) {
            score = score + 1;
        }
        //System.out.println("Valeur dé 1 ="+dés.get(0).lireValeur()+" Valeur dé 2 ="+dés.get(1).lireValeur());
    }

    public String getNomJoueur() {
        return nomJoueur;
    }

    public int getscore() {
        return score;
    }

    public boolean asTuGagne() {
        return (score == 5);
    }
}
