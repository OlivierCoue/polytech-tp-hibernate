package dao;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.EntityManager;

import org.hibernate.Transaction;

import model.Compteur;
import model.Plage;

/**
 * 
 * @author Olivier & Dorian
 *
 */
public class DAOPlage {
	
	/**
	 * 
	 * @param id
	 * @param date
	 * @param heureDebut
	 * @param heureFin
	 * @param compteur
	 * @param KHwConsomme
	 * @return
	 */
	static public Plage creerPlage(int id, LocalDate date, LocalTime heureDebut, LocalTime heureFin, Compteur compteur, int KHwConsomme){
		try{
			EntityManager em = DbUtil.getEm();
			Transaction ts = (Transaction) em.getTransaction();
			ts.begin();

			Plage plage = new Plage(id, date, heureDebut, heureFin, compteur, KHwConsomme);
			compteur.getListPlage().add(plage);
			
			em.persist(plage);
			ts.commit();
			return plage;
		}catch (Exception e) {
			System.err.println("Imossible de créer la plage");
			return null;
		}
	}
	
}
