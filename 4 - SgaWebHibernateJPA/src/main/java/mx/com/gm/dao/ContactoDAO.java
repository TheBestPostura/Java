package mx.com.gm.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;
import mx.com.gm.domain.Contacto;

public class ContactoDAO extends GenericDAO  {

    public List<Contacto> listar() {
        EntityManager em = getEntityManager();
        List<Contacto> resultados = null;
        try {
            String consulta = "SELECT c FROM Contacto c";
            Query query = em.createQuery(consulta);
            resultados = query.getResultList();
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return resultados;
    }

    // Método para insertar un nuevo contacto
    public void insertar(Contacto contacto) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(contacto);
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

    // Método para actualizar un contacto existente
    public void actualizar(Contacto contacto) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(contacto);
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

    // Método para eliminar un contacto
    public void eliminar(Contacto contacto) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.remove(em.merge(contacto)); // Merges primero para asegurar que la entidad esté en el contexto de persistencia
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

    // Método para buscar un contacto por su ID
    public Contacto buscarPorId(Long idContacto) {
        EntityManager em = getEntityManager();
        Contacto contacto = null;
        try {
            contacto = em.find(Contacto.class, idContacto);
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return contacto;
    }
}
