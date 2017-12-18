package controller;

import dao.DAOTarif;
import model.TarifCreux;
import model.TarifPlein;

/**
 *
 * @author Administrateur
 */
public class CTarif {

    public CTarif() {
    }
    
    
    public TarifPlein creerTarifPlein(String code, float prixKWh) {
        return DAOTarif.creerTarifPlein(code, prixKWh);
    }
    
    public TarifCreux creerTarifCreux(String code, float prixKWh, int pourcentageReduction) {
        return DAOTarif.creerTarifCreux(code, prixKWh, pourcentageReduction);
    }
}
