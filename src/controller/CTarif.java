package controller;

import java.util.List;

import dao.DAOPlageTarif;
import dao.DAOTarif;
import model.PlageTarif;
import model.TarifCreux;
import model.TarifPlein;

/**
 *
 * @author Olivier & Dorian
 */
public class CTarif {

	/**
	 * Constructeur par défaut
	 */
    public CTarif() {
    }
    
    /**
     * Créé un tarif plein
     * @param code
     * @param prixKWh
     * @return un tarif plein
     */
    public TarifPlein creerTarifPlein(String code, float prixKWh) {
        return DAOTarif.creerTarifPlein(code, prixKWh);
    }
    
    /**
     * Créé un tarif creux
     * @param code
     * @param prixKWh
     * @param pourcentageReduction
     * @return un tarif creux
     */
    public TarifCreux creerTarifCreux(String code, float prixKWh, int pourcentageReduction) {
        return DAOTarif.creerTarifCreux(code, prixKWh, pourcentageReduction);
    }
    
    /**
     * Compte le nombre d'utilisation d'un tarif creux
     * @param tarifCreux
     * @return le nombre d'utilisation
     */
    public int nombreUtilisation(TarifCreux tarifCreux){
    	int result = 0;
    	List<PlageTarif> listPlageTarif =  DAOPlageTarif.recupererToutPlageTarif();
    	
    	for(PlageTarif pt : listPlageTarif){
    		if(pt.getTarif().getCode().equals(tarifCreux.getCode()))
    				result++;
    	}
    	
    	return result;
    }
}
