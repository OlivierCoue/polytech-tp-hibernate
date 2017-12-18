package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * 
 * @author Olivier & Dorian
 *
 */
@Entity
public class Plage {
	
	@Id
	private int id;
	private LocalDate date;
	private LocalTime heureDebut;
	private LocalTime heureFin;
	private int KHwConsomme;
	@ManyToOne
	private Compteur compteur;
	@OneToMany(
		mappedBy="plage",
		cascade=CascadeType.ALL
	)
	final private List<PlageTarif> listPlageTarif;

	/**
	 * 
	 * @param id
	 * @param date
	 * @param heureDebut
	 * @param heureFin
	 * @param compteur
	 * @param KHwConsomme
	 */
	public Plage(int id, LocalDate date, LocalTime heureDebut, LocalTime heureFin, Compteur compteur, int KHwConsomme) {
		this.id = id;
		this.date = date;
		this.heureDebut = heureDebut;
		this.heureFin = heureFin;
		this.compteur = compteur;
		this.KHwConsomme = KHwConsomme;
		this.listPlageTarif = new ArrayList<>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getHeureDebut() {
		return heureDebut;
	}

	public void setHeureDebut(LocalTime heureDebut) {
		this.heureDebut = heureDebut;
	}

	public LocalTime getHeureFin() {
		return heureFin;
	}

	public void setHeureFin(LocalTime heureFin) {
		this.heureFin = heureFin;
	}
	
	public Compteur getCompteur() {
		return compteur;
	}

	public void setCompteur(Compteur compteur) {
		this.compteur = compteur;
	}

	public int getKHwConsomme() {
		return KHwConsomme;
	}

	public void setKHwConsomme(int KHwConsomme) {
		this.KHwConsomme = KHwConsomme;
	}

	public List<PlageTarif> getListPlageTarif() {
		return listPlageTarif;
	}
	
	@Override
	public String toString(){
		return " id : " + this.id + " date : " + this.date + " heureDebut : " + this.heureDebut + " heureFin : " + this.heureFin + " KHwConsomme : " + this.KHwConsomme; 
	}

}
