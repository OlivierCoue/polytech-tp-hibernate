package model;

import javax.persistence.Entity;

@Entity
public class TarifPlein extends Tarif {

	public TarifPlein(String code, float prixKWh) {
		super(code, prixKWh);
	}

}
