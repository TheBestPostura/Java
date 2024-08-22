package mx.com.gm.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;
import mx.com.gm.domain.Domicilio;

public class DomicilioDAO extends GenericDAO {

    // Método para listar todos los domicilios
    public List<Domicilio> listar() {
        EntityManager em = getEntityManager();
        List<Domicilio> resultados = null;
        try {
            String consulta = "SELECT d FROM Domicilio d";
            Query query = em.createQuery(consulta);
            resultados = query.getResultList();
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return resultados;
    }

    // Método para insertar un nuevo domicilio
    public void insertar(Domicilio domicilio) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(domicilio);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback(); // Reversión en caso de error
            ex.printStackTrace(System.out);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    // Método para actualizar un domicilio existente
    public void actualizar(Domicilio domicilio) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(domicilio);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback(); // Reversión en caso de error
            ex.printStackTrace(System.out);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    // Método para eliminar un domicilio
    public void eliminar(Domicilio domicilio) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.remove(em.merge(domicilio)); // Merges primero para asegurar que la entidad esté en el contexto de persistencia
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback(); // Reversión en caso de error
            ex.printStackTrace(System.out);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    // Método para buscar un domicilio por su ID
    public Domicilio buscarPorId(Long idDomicilio) {
        EntityManager em = getEntityManager();
        Domicilio domicilio = null;
        try {
            domicilio = em.find(Domicilio.class, idDomicilio);
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return domicilio;
    }
}
