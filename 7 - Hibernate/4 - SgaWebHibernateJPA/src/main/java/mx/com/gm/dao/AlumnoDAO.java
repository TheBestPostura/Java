package mx.com.gm.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;
import mx.com.gm.domain.Alumno;

public class AlumnoDAO extends GenericDAO {

    public List<Alumno> listar() {
        EntityManager em = getEntityManager();
        List<Alumno> resultados = null;
        try {
            String consulta = "SELECT a FROM Alumno a";
            Query query = em.createQuery(consulta);
            resultados = query.getResultList();
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return resultados;
    }

    public void insertar(Alumno alumno) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(alumno);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
            ex.printStackTrace(System.out);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void actualizar(Alumno alumno) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(alumno);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
            ex.printStackTrace(System.out);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void eliminar(Alumno alumno) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.remove(em.merge(alumno));
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
            ex.printStackTrace(System.out);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public Alumno buscarPorId(Long idAlumno) {
        EntityManager em = getEntityManager();
        Alumno alumno = null;
        try {
            alumno = em.find(Alumno.class, idAlumno);
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return alumno;
    }
}
