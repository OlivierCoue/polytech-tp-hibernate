package tp_note;

import java.time.LocalDate;
import java.time.LocalTime;

import dao.DAOCompteur;
import dao.DAOPersonne;	
import dao.DAOPlage;
import dao.DAOPlageTarif;
import dao.DAOTarif;
import model.Compteur;
import model.Personne;
import model.Plage;
import model.Tarif;

public class Main {

	public static void main(String[] args) {
		Tarif tarifCreux1 = DAOTarif.creerTarifCreux("tarif_creux_1", 100, 10);
		Tarif tarifCreux2 = DAOTarif.creerTarifCreux("tarif_creux_2", 200, 10);
		Tarif tarifCreux3 = DAOTarif.creerTarifCreux("tarif_creux_3", 300, 10);
		
		Tarif tarifPlein1= DAOTarif.creerTarifPlein("tarif_plein_1", 100);
		Tarif tarifPlein2= DAOTarif.creerTarifPlein("tarif_plein_2", 200);
		Tarif tarifPlein3= DAOTarif.creerTarifPlein("tarif_plein_3", 300);
		
		Personne personne1 = DAOPersonne.creerPersonne("111", "adresse1", "numTelephone1");
		DAOPersonne.creerPersonne("222", "adresse2", "numTelephone2");
		DAOPersonne.creerPersonne("333", "adresse3", "numTelephone3");
		
		Compteur compteur1 = DAOCompteur.creerCompteur(1, "adresse1", LocalDate.of(2017, 12, 17), personne1);
		System.out.println(personne1.getListCompteur().size());
		
		Plage plage1 = DAOPlage.creerPlage(1,  LocalDate.of(2017, 12, 18),  LocalTime.of(8, 0), LocalTime.of(12, 0), compteur1, 12);
		Plage plage2 = DAOPlage.creerPlage(2,  LocalDate.of(2017, 12, 19),  LocalTime.of(13, 0), LocalTime.of(19, 0), compteur1, 14);
		System.out.println(compteur1.getListPlage().size());
		
		DAOPlageTarif.creerPlageTarif(1, 5, plage1, tarifCreux1);
	}

}
