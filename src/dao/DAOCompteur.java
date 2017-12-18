package dao;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Query;
import org.hibernate.Transaction;

import model.Compteur;
import model.Personne;
import model.PlageTarif;

/**
 * 
 * @author Olivier & Dorian
 *
 */
public class DAOCompteur {
	
	/**
	 * 
	 * @param numero
	 * @param adresse
	 * @param dateActivation
	 * @param proprietaire
	 * @return
	 */
	static public Compteur creerCompteur(int numero, String adresse, LocalDate dateActivation, Personne proprietaire){
		try{
			EntityManager em = DbUtil.getEm();
			Transaction ts = (Transaction) em.getTransaction();
			ts.begin();

			Compteur compteur = new Compteur(numero, adresse, dateActivation, proprietaire);
			proprietaire.getListCompteur().add(compteur);
			
			em.persist(compteur);
			ts.commit();
			return compteur;
		}catch (Exception e) {
			System.err.println("Imossible de créer le compteur");
			return null;
		}
	}
	
	/**
	 * 
	 * @param compteur
	 * @param date
	 * @return
	 */
	static public List<PlageTarif> recupererInfoPlageParDate(Compteur compteur, LocalDate date){
		try{
			
			EntityManager em = DbUtil.getEm();
			Query query = (Query) em.createQuery("SELECT plageTarif FROM Compteur as compteur INNER JOIN compteur.listPlage as plage INNER JOIN plage.listPlageTarif as plageTarif INNER JOIN plageTarif.tarif as tarif WHERE compteur.numero = :numeroCompteur AND plage.date = :plageDate");
			query.setInteger("numeroCompteur", compteur.getNumero());
			query.setDate("plageDate", Date.valueOf(date));
			
			List<PlageTarif> listPlageTarif = (List<PlageTarif>) query.list();

			return listPlageTarif;
			
		}catch (Exception e) {
			e.printStackTrace();
			System.err.println("Impossible de récupérer les PlageTarif");
			return null;
		}
	}
	
}
