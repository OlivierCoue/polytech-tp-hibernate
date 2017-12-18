package controller;

import dao.DAOCompteur;
import javassist.expr.Instanceof;

import java.time.LocalDate;
import java.util.List;

import model.Compteur;
import model.Personne;
import model.PlageTarif;
import model.TarifCreux;

/**
 *
 * @author Olivier & Dorian
 */
public class CCompteur {
	
	/**
	 * Constructeur par défaut
	 */
    public CCompteur() {
    }
    
    /**
     * Créé un nouveau compteur
     * @param numero
     * @param adresse
     * @param dateActivation
     * @param proprietaire
     * @return un compteur
     */
    public Compteur creerCompteur(int numero, String adresse, LocalDate dateActivation, Personne proprietaire) {
        
        return DAOCompteur.creerCompteur(numero, adresse, dateActivation, proprietaire);
        
    }
    
    /**
     * Calcule la conssomation d'un compteur en fonction d'une date (prise en compte des trif plein ou creux)
     * @param compteur le compteur en question
     * @param date une date
     * @return la consommation
     */
    public float calculerConsommationParDate(Compteur compteur, LocalDate date){
    	float consommation = 0;
    	List<PlageTarif> listPlageTarif = DAOCompteur.recupererInfoPlageParDate(compteur, date);
    	
		for(PlageTarif pt : listPlageTarif){
			
			float tmpConsommation = 0;
			tmpConsommation = pt.getKWh() * pt.getTarif().getPrixKWh();
			
			if(pt.getTarif() instanceof TarifCreux){
				tmpConsommation *= (1-(float)((TarifCreux)pt.getTarif()).getPourcentageReduction()/100);
			}
			
			consommation += tmpConsommation;
		}
		return consommation;
    }
    
}
