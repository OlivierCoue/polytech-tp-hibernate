package view;

import java.time.LocalDate;
import java.time.LocalTime;

import controller.CCompteur;
import controller.CPersonne;
import controller.CPlage;
import controller.CTarif;
import model.Compteur;
import model.Personne;
import model.Plage;
import model.Tarif;
import model.TarifCreux;

public class Demo {
	
	public void lancer(){
		
		CTarif cTarif = new CTarif();
		CCompteur cCompteur = new CCompteur();
		CPersonne cPersonne = new CPersonne();
		CPlage cPlage = new CPlage();
		
		System.out.println("Création des personnes :");
		Personne personne1 = cPersonne.creerPersonne("111", "adresse1", "numTelephone1");
		System.out.println(personne1);
		Personne personne2 = cPersonne.creerPersonne("222", "adresse2", "numTelephone2");
		System.out.println(personne2);
		
		System.out.println("Création des tarifs :");
		Tarif tarifCreux1 = cTarif.creerTarifCreux("tarif_creux_1", 100, 10);
		System.out.println(tarifCreux1);
		Tarif tarifCreux2 = cTarif.creerTarifCreux("tarif_creux_2", 200, 10);
		System.out.println(tarifCreux2);
		Tarif tarifCreux3 = cTarif.creerTarifCreux("tarif_creux_3", 300, 10);
		System.out.println(tarifCreux3);
		
		Tarif tarifPlein1= cTarif.creerTarifPlein("tarif_plein_1", 100);
		System.out.println(tarifPlein1);
		Tarif tarifPlein2= cTarif.creerTarifPlein("tarif_plein_2", 200);
		System.out.println(tarifPlein2);
		Tarif tarifPlein3= cTarif.creerTarifPlein("tarif_plein_3", 300);
		System.out.println(tarifPlein3);
		
		System.out.println("Création des compteurs :");
		Compteur compteur1 = cCompteur.creerCompteur(1, "adresse1", LocalDate.of(2017, 12, 15), personne1);
		System.out.println(compteur1);
		Compteur compteur2 = cCompteur.creerCompteur(2, "adresse2", LocalDate.of(2017, 12, 16), personne2);
		System.out.println(compteur2);
		
		System.out.println("Création des plages :");
		Plage plage1 = cPlage.creerPlage(1,  LocalDate.of(2017, 12, 18),  LocalTime.of(8, 0), LocalTime.of(12, 0), compteur1, 12);
		System.out.println(plage1);
		Plage plage2 = cPlage.creerPlage(2,  LocalDate.of(2017, 12, 19),  LocalTime.of(13, 0), LocalTime.of(19, 0), compteur1, 14);
		System.out.println(plage2);
		
		System.out.println("Création des relation entre les plages et les tarifs :");
		cPlage.creerPlageTarif(1, 5, plage1, tarifCreux1);
		cPlage.creerPlageTarif(2, 6, plage1, tarifCreux2);
		cPlage.creerPlageTarif(3, 7, plage1, tarifCreux2);
		cPlage.creerPlageTarif(4, 8, plage1, tarifPlein1);
		cPlage.creerPlageTarif(5, 9, plage2, tarifPlein2);
		
		System.out.println("Nombre d'utilisation de tarifCreux1");
		System.out.println(cTarif.nombreUtilisation((TarifCreux)tarifCreux1));
		
		System.out.println("Nombre d'utilisation de tarifCreux2");
		System.out.println(cTarif.nombreUtilisation((TarifCreux)tarifCreux2));
		
		System.out.println("Nombre d'utilisation de tarifCreux3");
		System.out.println(cTarif.nombreUtilisation((TarifCreux)tarifCreux3));
		
		System.out.println("Consommation du compteur1 le 18/12/2017");
		System.out.println(cCompteur.calculerConsommationParDate(compteur1, LocalDate.of(2017, 12, 18)));
		
		System.out.println("Consommation du compteur1 le 19/12/2017");
		System.out.println(cCompteur.calculerConsommationParDate(compteur1, LocalDate.of(2017, 12, 19)));
		
	}
	
}
