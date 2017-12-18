package model;

import javax.persistence.Entity;

/**
 * 
 * @author Olivier & Dorian
 *
 */
@Entity
public class TarifCreux extends Tarif {
	
	private int pourcentageReduction;
	
	/**
	 * 
	 * @param code
	 * @param prixKWh
	 * @param pourcentageReduction
	 */
	public TarifCreux(String code, float prixKWh, int pourcentageReduction) {
		super(code, prixKWh);
		this.pourcentageReduction = pourcentageReduction;
	}

	public int getPourcentageReduction() {
		return pourcentageReduction;
	}

	public void setPourcentageReduction(int pourcentageReduction) {
		this.pourcentageReduction = pourcentageReduction;
	}
	
	@Override
	public String toString(){
		return "TarifCreux code : " + this.code + " prixKWh : " + this.prixKWh; 
	}

}
