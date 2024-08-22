package mx.com.gm.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public abstract class GenericDAO {

    private static EntityManagerFactory emf;
    private static final String PU = "HibernateJpaPU";

    public GenericDAO() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory(PU);
        }
    }

    protected EntityManager getEntityManager() {
        return emf.createEntityManager();  // Devuelve una nueva instancia de EntityManager
    }
}
