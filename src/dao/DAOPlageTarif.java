package dao;

import javax.persistence.EntityManager;

import org.hibernate.Transaction;

import model.Plage;
import model.PlageTarif;
import model.Tarif;

public class DAOPlageTarif {
	
	static public PlageTarif creerPlageTarif(int id, int KWh, Plage plage, Tarif tarif){
		try{
			EntityManager em = DbUtil.getEm();
			Transaction ts = (Transaction) em.getTransaction();
			ts.begin();

			PlageTarif plageTarif = new PlageTarif(id, KWh, plage, tarif);
			plage.getListPlageTarif().add(plageTarif);
			tarif.getListPlageTarif().add(plageTarif);
		
			em.persist(plageTarif);
			ts.commit();
			return plageTarif;
		}catch (Exception e) {
			System.err.println("Imossible de créer le PlageTarif");
			return null;
		}
	}
	
}
