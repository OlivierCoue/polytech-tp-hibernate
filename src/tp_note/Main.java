package tp_note;

import dao.DAOTarif;

public class Main {

	public static void main(String[] args) {
		DAOTarif.creerTarifCreux("tarif_creux_1", 100, 10);
		DAOTarif.creerTarifCreux("tarif_creux_2", 200, 10);
		DAOTarif.creerTarifCreux("tarif_creux_3", 300, 10);
		
		DAOTarif.creerTarifPlein("tarif_plein_1", 100);
		DAOTarif.creerTarifPlein("tarif_plein_2", 200);
		DAOTarif.creerTarifPlein("tarif_plein_3", 300);
	}

}
