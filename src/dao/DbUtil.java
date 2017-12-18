package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * 
 * @author Olivier & Dorian
 *
 */
public class DbUtil {
	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("my-pu");
	private static EntityManager em = entityManagerFactory.createEntityManager();
	
	/**
	 * 
	 * @return
	 */
	public static EntityManager getEm(){
		return em;
	}
}

