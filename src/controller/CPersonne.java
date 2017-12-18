package controller;

import dao.DAOPersonne;
import model.Personne;

/**
 *
 * @author Olivier & Dorian
 */
public class CPersonne {
	
	/**
	 * Constructeur par défaut
	 */
    public CPersonne() {
    }
    
    /**
     * Créé une nouvelle personne
     * @param numeroSecu
     * @param adresse
     * @param numTelephone
     * @return une personne
     */
    public Personne creerPersonne(String numeroSecu, String adresse, String numTelephone) {
        
        return DAOPersonne.creerPersonne(numeroSecu, adresse, numTelephone);
        
    }
    
}
