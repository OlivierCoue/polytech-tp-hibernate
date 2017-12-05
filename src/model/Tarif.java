package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public abstract class Tarif {
	
	@Id
	protected String code;
	protected float prixKWh;
	@OneToMany(mappedBy="tarif")
	final protected List<PlageTarif> ListPlageTarif;
	
	public Tarif(String code, float prixKWh) {
		super();
		this.code = code;
		this.prixKWh = prixKWh;
		this.ListPlageTarif = new ArrayList<>();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public float getPrixKWh() {
		return prixKWh;
	}

	public void setPrixKWh(float prixKWh) {
		this.prixKWh = prixKWh;
	}

	public List<PlageTarif> getListPlageTarif() {
		return ListPlageTarif;
	}
	
}
