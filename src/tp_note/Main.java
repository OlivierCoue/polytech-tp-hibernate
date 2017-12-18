package tp_note;

import java.time.LocalDate;

import dao.DAOCompteur;
import dao.DAOPersonne;
import dao.DAOTarif;
import model.Personne;

public class Main {

	public static void main(String[] args) {
		DAOTarif.creerTarifCreux("tarif_creux_1", 100, 10);
		DAOTarif.creerTarifCreux("tarif_creux_2", 200, 10);
		DAOTarif.creerTarifCreux("tarif_creux_3", 300, 10);
		
		DAOTarif.creerTarifPlein("tarif_plein_1", 100);
		DAOTarif.creerTarifPlein("tarif_plein_2", 200);
		DAOTarif.creerTarifPlein("tarif_plein_3", 300);
		
		Personne personne1 = DAOPersonne.creerPersonne("111", "adresse1", "numTelephone1");
		DAOPersonne.creerPersonne("222", "adresse2", "numTelephone2");
		DAOPersonne.creerPersonne("333", "adresse3", "numTelephone3");
		
		DAOCompteur.creerCompteur(1, "adresse1", LocalDate.of(2017, 12, 17), personne1);
		System.out.println(personne1.getListCompteur().size());
	}

}
