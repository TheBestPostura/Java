package test;

import java.sql.*;
/**
 *
 * @author moises
 */
public class TestMySQLJDBC {
    
    public static void main(String[] args) throws SQLException{
        
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        
        try{
            Connection conexion = DriverManager.getConnection(url, "root", "admin");           
            Statement instruccion = conexion.createStatement();
            var sql = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";
            ResultSet resultado = instruccion.executeQuery(sql);
            while(resultado.next()){
                System.out.print("Id Persona: " + resultado.getInt("id_persona"));
                System.out.print(" Nombre: " + resultado.getString("nombre"));
                System.out.print(" Apellido: " + resultado.getString("apellido"));
                System.out.print(" Mail: " + resultado.getString("email"));
                System.out.print(" Telefono: " + resultado.getString("Telefono"));
                System.out.println("");
            }
            resultado.close();
            instruccion.close();
            conexion.close();
        } catch (SQLException ex){
            ex.printStackTrace(System.out);
        }
    }
}
