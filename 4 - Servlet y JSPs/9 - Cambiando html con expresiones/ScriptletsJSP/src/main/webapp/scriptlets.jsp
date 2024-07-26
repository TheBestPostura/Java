<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con Scriptlets</title>
    </head>
    <body>
        <h1>JSP con Scriptlets</h1>
        <br>
        <%-- Scriptlets para enviar informacion al navegador --%>
        <% 
            out.print("Saludos desde un scriptlest");
        %>
        <%-- Scriptlets para manipular los objetos implicitos --%>
        <% 
            String nombreAplicacion = request.getContextPath();
            out.print("Nombre de la aplicacion: " + nombreAplicacion);
        %>
        <br>
        <%-- Scriptlets con condiciones --%>
        <% 
            if(session != null && session.isNew()){
        %>
        la session es nueva
        <%
            }else if(session != null){
        %>
        la session No es nueva
        <% } %>
        <br>
        <a href="index.html">Regresar al inicio</a>
    </body>
</html>
