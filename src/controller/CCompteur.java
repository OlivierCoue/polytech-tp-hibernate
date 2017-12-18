package controller;

import dao.DAOCompteur;
import java.time.LocalDate;
import model.Compteur;
import model.Personne;

/**
 *
 * @author Administrateur
 */
public class CCompteur {

    public CCompteur() {
    }
    
    public Compteur creerCompteur(int numero, String adresse, LocalDate dateActivation, Personne proprietaire) {
        
        return DAOCompteur.creerCompteur(numero, adresse, dateActivation, proprietaire);
        
    }
    
}
