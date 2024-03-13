package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.*;

/**
 *
 * @author moises
 */
public class TestManejoPersonas {

    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();

        //Insertando un nuevo objeto de tipo persona
        Persona personaNueva = new Persona("Carlos", "Esparza", "cesparza@gmail.com", "639351039");
        personaDao.insertar(personaNueva);

        
        
        
        //Encontrar datos en la BBDD  
        List<Persona> personas = personaDao.seleccionar();
        for (Persona persona : personas) {
            System.out.println("Persona = " + persona);
        }

        personas.forEach(persona -> {
            System.out.println("Persona = " + persona);
        });
    }
}
