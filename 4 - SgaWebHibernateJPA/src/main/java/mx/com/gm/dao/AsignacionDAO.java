
package mx.com.gm.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;
import mx.com.gm.domain.Asignacion;


public class AsignacionDAO extends GenericDAO  {

    public List<Asignacion> listar() {
        EntityManager em = getEntityManager();
        List<Asignacion> resultados = null;
        try {
            String consulta = "SELECT c FROM Asignacion c";
            Query query = em.createQuery(consulta);
            resultados = query.getResultList();
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return resultados;
    }

    // Método para insertar un nuevo asignacion
    public void insertar(Asignacion asignacion) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(asignacion);
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

    // Método para actualizar un asignacion existente
    public void actualizar(Asignacion asignacion) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(asignacion);
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

    // Método para eliminar un asignacion
    public void eliminar(Asignacion asignacion) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.remove(em.merge(asignacion)); // Merges primero para asegurar que la entidad esté en el contexto de persistencia
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

    // Método para buscar un asignacion por su ID
    public Asignacion buscarPorId(Long idAsignacion) {
        EntityManager em = getEntityManager();
        Asignacion asignacion = null;
        try {
            asignacion = em.find(Asignacion.class, idAsignacion);
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return asignacion;
    }
}

