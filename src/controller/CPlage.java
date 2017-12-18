package controller;

import java.time.LocalDate;
import java.time.LocalTime;

import dao.DAOPlage;
import dao.DAOPlageTarif;
import model.Compteur;
import model.Plage;
import model.PlageTarif;
import model.Tarif;

/**
 * 
 * @author Olivier & Dorian
 *
 */
public class CPlage {
	
	/**
	 * Constructeur par défaut
	 */
	public CPlage(){
		
	}
	
	/**
	 * Créé une nouvelle plage
	 * @param id
	 * @param date
	 * @param heureDebut
	 * @param heureFin
	 * @param compteur
	 * @param KHwConsomme
	 * @return une plage
	 */
	public Plage creerPlage(int id, LocalDate date, LocalTime heureDebut, LocalTime heureFin, Compteur compteur, int KHwConsomme){
		return DAOPlage.creerPlage(id, date, heureDebut, heureFin, compteur, KHwConsomme);
	}
	
	/**
	 * Créé une nouvelle relation entre plage et tarif
	 * @param id
	 * @param KWh
	 * @param plage
	 * @param tarif
	 * @return un PlageTarif
	 */
	public PlageTarif creerPlageTarif(int id, int KWh, Plage plage, Tarif tarif){
		return DAOPlageTarif.creerPlageTarif(id, KWh, plage, tarif);
	}
}
