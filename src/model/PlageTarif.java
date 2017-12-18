package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * 
 * @author Olivier & Dorian
 *
 */
@Entity
public class PlageTarif {
	
	@Id
	private int id;
	private int KWh;
	@ManyToOne
	private Plage plage;
	@ManyToOne
	private Tarif tarif;
	
	/**
	 * 
	 * @param id
	 * @param KWh
	 * @param plage
	 * @param tarif
	 */
	public PlageTarif(int id, int KWh, Plage plage, Tarif tarif) {
		super();
		this.id = id;
		this.KWh = KWh;
		this.plage = plage;
		this.tarif = tarif;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getKWh() {
		return KWh;
	}

	public void setKWh(int kWh) {
		KWh = kWh;
	}

	public Plage getPlage() {
		return plage;
	}
	
	public void setPlage(Plage plage) {
		this.plage = plage;
	}
	
	public Tarif getTarif() {
		return tarif;
	}
	
	public void setTarif(Tarif tarif) {
		this.tarif = tarif;
	}
	
	@Override
	public String toString(){
		return " id : " + this.id + " KWh : " + this.KWh; 
	}
	
	
}
