package mx.com.gm.test;

import java.util.List;
import mx.com.gm.dao.AlumnoDAO;  // Asegúrate de que esta importación sea correcta
import mx.com.gm.domain.Alumno;

public class TestDAO {
    
    public static void main(String[] args) {
        AlumnoDAO alumnoDao = new AlumnoDAO();  // Asegúrate de que el nombre de la clase esté correcto
        System.out.println("Alumnos: ");
        imprimir(alumnoDao.listar());
    }
    
    private static void imprimir(List<Alumno> coleccion) {
        for (Alumno alumno : coleccion) {
            System.out.println("Valor = " + alumno);
        }
    }
}