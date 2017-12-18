package dao;

import javax.persistence.EntityManager;

import org.hibernate.Transaction;

import model.Personne;

public class DAOPersonne {
	
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
	
}
