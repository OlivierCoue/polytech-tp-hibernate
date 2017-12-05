package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DbUtil {
	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("my-pu");
	private static EntityManager em = entityManagerFactory.createEntityManager();
	
	public static EntityManager getEm(){
		return em;
	}
}

