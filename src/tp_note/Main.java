package tp_note;

import java.time.LocalDate;
import java.time.LocalTime;

import controller.CCompteur;
import controller.CPersonne;
import controller.CPlage;
import controller.CTarif;
import dao.DAOCompteur;
import dao.DAOPersonne;	
import dao.DAOPlage;
import dao.DAOPlageTarif;
import dao.DAOTarif;
import model.Compteur;
import model.Personne;
import model.Plage;
import model.Tarif;
import model.TarifCreux;
import view.Demo;

public class Main {

	public static void main(String[] args) {
		
		Demo demo = new Demo();
		demo.lancer();
		
	}

}
