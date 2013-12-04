/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exo.jeu.de.dé;

/**
 *
 * @author Christophe
 */
public class De {
    
    private final int MAXIMUM_FACES_DE;
    private int valeurFace ;
    
    public De(){
        MAXIMUM_FACES_DE = 6;
        valeurFace = 1;
    }
    
    public int lireValeur() {
        return valeurFace ;
    }
    
    public void lancer() {
        valeurFace = (int) (Math.random() * MAXIMUM_FACES_DE)+1;
     }
    
}

