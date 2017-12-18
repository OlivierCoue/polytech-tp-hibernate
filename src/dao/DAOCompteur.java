package dao;

import java.time.LocalDate;

import javax.persistence.EntityManager;

import org.hibernate.Transaction;

import model.Compteur;
import model.Personne;

public class DAOCompteur {
	
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
	
}
