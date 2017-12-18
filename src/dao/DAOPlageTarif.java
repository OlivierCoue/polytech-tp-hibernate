package dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Query;
import org.hibernate.Transaction;

import model.Plage;
import model.PlageTarif;
import model.Tarif;

/**
 * 
 * @author Olivier & Dorian
 *
 */
public class DAOPlageTarif {
	
	/**
	 * 
	 * @param id
	 * @param KWh
	 * @param plage
	 * @param tarif
	 * @return
	 */
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
	
	/**
	 * 
	 * @return
	 */
	static public List<PlageTarif> recupererToutPlageTarif(){
		try{
			
			EntityManager em = DbUtil.getEm();
			Query query = (Query) em.createQuery("FROM PlageTarif");
			List<PlageTarif> listPlageTarif = (List<PlageTarif>) query.list();
			return listPlageTarif;
			
		}catch (Exception e) {
			System.err.println("Impossible de récupérer les PlageTarif");
			return null;
		}
		
	}
	
}
