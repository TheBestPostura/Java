
package mx.com.gm.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;
import mx.com.gm.domain.Curso;



public class CursoDAO extends GenericDAO  {

    public List<Curso> listar() {
        EntityManager em = getEntityManager();
        List<Curso> resultados = null;
        try {
            String consulta = "SELECT c FROM Curso c";
            Query query = em.createQuery(consulta);
            resultados = query.getResultList();
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return resultados;
    }

    // Método para insertar un nuevo curso
    public void insertar(Curso curso) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(curso);
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

    // Método para actualizar un curso existente
    public void actualizar(Curso curso) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(curso);
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

    // Método para eliminar un curso
    public void eliminar(Curso curso) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.remove(em.merge(curso)); // Merges primero para asegurar que la entidad esté en el contexto de persistencia
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

    // Método para buscar un curso por su ID
    public Curso buscarPorId(Long idCurso) {
        EntityManager em = getEntityManager();
        Curso curso = null;
        try {
            curso = em.find(Curso.class, idCurso);
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return curso;
    }
}

    

