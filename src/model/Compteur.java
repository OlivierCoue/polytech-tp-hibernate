package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Compteur {
	@Id
	private int numero;
	private String adresse;
	private LocalDate dateActivation;
	@ManyToOne
	private Personne proprietaire;
	@OneToMany(mappedBy="compteur")
	final private List<Plage> listPlage;
	
	public Compteur(int numero, String adresse, LocalDate dateActivation, Personne proprietaire) {
		super();
		this.numero = numero;
		this.adresse = adresse;
		this.dateActivation = dateActivation;
		this.proprietaire = proprietaire;
		this.listPlage = new ArrayList<>();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public LocalDate getDateActivation() {
		return dateActivation;
	}

	public void setDateActivation(LocalDate dateActivation) {
		this.dateActivation = dateActivation;
	}

	public Personne getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(Personne proprietaire) {
		this.proprietaire = proprietaire;
	}
	
}
