
package mx.com.gm.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Objects;


@Entity
public class Contacto implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contacto")
    private Integer idcontacto;
    
    private String telefono;
 
    private String email;

    public Contacto() {
    }

    public Contacto(Integer idcontacto) {
        this.idcontacto = idcontacto;
    }

    public Integer getIdcontacto() {
        return idcontacto;
    }

    public void setIdcontacto(Integer idcontacto) {
        this.idcontacto = idcontacto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contacto{" + "idcontacto=" + idcontacto + ", telefono=" + telefono + ", email=" + email + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.idcontacto);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contacto other = (Contacto) obj;
        return Objects.equals(this.idcontacto, other.idcontacto);
    }
    
    
}
