package dao;

import javax.persistence.EntityManager;

import org.hibernate.Transaction;

import model.TarifCreux;
import model.TarifPlein;

public class DAOTarif {
	
	static public TarifPlein creerTarifPlein(String code, float prixKWh){
		try{
			EntityManager em = DbUtil.getEm();
			Transaction ts = (Transaction) em.getTransaction();
			ts.begin();

			TarifPlein tarifPlein = new TarifPlein(code, prixKWh);
		
			em.persist(tarifPlein);
			ts.commit();
			return tarifPlein;
		}catch (Exception e) {
			System.err.println("Imossible de créer le TarifPlein");
			return null;
		}
	}
	
	static public TarifCreux creerTarifCreux(String code, float prixKWh, int pourcentageReduction){
		try{
			EntityManager em = DbUtil.getEm();
			Transaction ts = (Transaction) em.getTransaction();
			ts.begin();
	
			TarifCreux tarifCreux = new TarifCreux(code, prixKWh, pourcentageReduction);
			
			em.persist(tarifCreux);
			ts.commit();
			return tarifCreux;
		}catch (Exception e) {
			System.err.println("Imossible de créer le TarifCreux");
			return null;
		}
	}
	
}
