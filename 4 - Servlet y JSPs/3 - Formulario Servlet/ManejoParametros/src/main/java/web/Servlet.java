
package web;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Moises
 */

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //Leer los parametros del form
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        
        System.out.print("Usuario = " + usuario);
        System.out.println("Password = " + password);
        
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<body>");
        out.print("El parametro usuario es: " + usuario);
        out.print("<br/>");
        out.print("El parametro de contraseña es: " + password);
        out.print("</body>");
        out.print("</html>");
        out.close();
    }
    
}
