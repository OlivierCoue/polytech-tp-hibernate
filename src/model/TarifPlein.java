package model;

import javax.persistence.Entity;

/**
 * 
 * @author Olivier & Dorian
 *
 */
@Entity
public class TarifPlein extends Tarif {
	
	/**
	 * 
	 * @param code
	 * @param prixKWh
	 */
	public TarifPlein(String code, float prixKWh) {
		super(code, prixKWh);
	}
	
	@Override
	public String toString(){
		return "TarifPlein code : " + this.code + " prixKWh : " + this.prixKWh; 
	}

}
