package dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Query;
import org.hibernate.Transaction;

import model.Personne;
import model.PlageTarif;

/**
 * 
 * @author Olivier & Dorian
 *
 */
public class DAOPersonne {
	
	/**
	 * 
	 * @param numeroSecu
	 * @param adresse
	 * @param numTelephone
	 * @return
	 */
	static public Personne creerPersonne(String numeroSecu, String adresse, String numTelephone){
		try{
			EntityManager em = DbUtil.getEm();
			Transaction ts = (Transaction) em.getTransaction();
			ts.begin();

			Personne personne = new Personne(numeroSecu, adresse, numTelephone);
		
			em.persist(personne);
			ts.commit();
			return personne;
		}catch (Exception e) {
			System.err.println("Imossible de créer la personne");
			return null;
		}
	}
	
	/**
	 * Récupère toutes les personnes
	 * @return
	 */
	static public List<Personne> recupererToutesPersonnes(){
		
		try{
			
			EntityManager em = DbUtil.getEm();
			Query query = (Query) em.createQuery("FROM Personne");
			List<Personne> listPersonne = (List<Personne>) query.list();
			return listPersonne;
			
		}catch (Exception e) {
			System.err.println("Impossible de récupérer les personnes");
			return null;
		}
		
	}
	
}
