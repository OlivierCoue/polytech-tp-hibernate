package controller;

import dao.DAOPersonne;
import model.Personne;

/**
 *
 * @author Administrateur
 */
public class CPersonne {

    public CPersonne() {
    }
    
    public Personne creerPersonne(String numeroSecu, String adresse, String numTelephone) {
        
        return DAOPersonne.creerPersonne(numeroSecu, adresse, numTelephone);
        
    }
    
}
