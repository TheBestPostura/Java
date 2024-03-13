
package domain;

/**
 *
 * @author moises
 */
public class Persona {
    private int idPersona;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    
    public Persona(){
        
    }
    
    public Persona(int idPersona){
        this.idPersona = idPersona;
    }
    
    public Persona(String nombre, String apellido, String email, String telefono){
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }
    
    public Persona(int idPersona, String nombre, String apellido, String email, String telefono){
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }
    
    public int getidPersona(){
        return idPersona;
    }
    
    public void set(int idPersona){
        this.idPersona = idPersona;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getApellido(){
            return apellido;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public String getMail(){
        return email;
    }
    
    public void setMail(String mail){
        this.email = email;
    }
    
    public String getTelefono(){
        return telefono;
    }
    
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", apellido=" + apellido + ", mail=" + email + ", telefono=" + telefono + '}';
    }
    
    
}
