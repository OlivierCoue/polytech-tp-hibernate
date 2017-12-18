package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * 
 * @author Olivier & Dorian
 *
 */
@Entity
public class Personne {
	
	@Id
	private String numeroSecu;
	private String adresse;
	private String numTelephone;
	@OneToMany(mappedBy="proprietaire")
	final private List<Compteur> listCompteur;
	
	/**
	 * 
	 * @param numeroSecu
	 * @param adresse
	 * @param numTelephone
	 */
	public Personne(String numeroSecu, String adresse, String numTelephone) {
		super();
		this.numeroSecu = numeroSecu;
		this.adresse = adresse;
		this.numTelephone = numTelephone;
		this.listCompteur = new ArrayList<>();
	}

	public String getNumeroSecu() {
		return numeroSecu;
	}

	public void setNumeroSecu(String numeroSecu) {
		this.numeroSecu = numeroSecu;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getNumTelephone() {
		return numTelephone;
	}

	public void setNumTelephone(String numTelephone) {
		this.numTelephone = numTelephone;
	}

	public List<Compteur> getListCompteur() {
		return listCompteur;
	}
	
	@Override
	public String toString(){
		return " numeroSecu : " + this.numeroSecu + " adresse : " + this.adresse + " numTelephone : " + this.numTelephone; 
	}
	
}
