<%-- 
    Document   : index
    Created on : 7 jul 2024, 20:54:17
    Author     : moises
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hola mundo JSPs</title>
    </head>
    <body>
        <h1>Hola mundo JSPs</h1>
        <ul>
            <li><% out.print("Hola mund con Scriplets"); %></li>
            <li>${"Hola mundo con Expression Languague (EL)"}</li>
            <li><%= "Hola mundo con Expresiones" %></li>
            <li> <c:out value="Hola mundo con JSTL" /> </li>
            
        </ul>
    </body>
</html>
