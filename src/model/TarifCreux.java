package model;

import javax.persistence.Entity;

@Entity
public class TarifCreux extends Tarif {
	
	private int pourcentageReduction;

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

}
