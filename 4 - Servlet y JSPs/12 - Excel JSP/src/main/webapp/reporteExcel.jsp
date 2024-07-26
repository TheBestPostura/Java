<%@page import="utiles.Conversiones, java.util.Date" %>
<%@page contentType="application/vnd.ms-excel" %>
<%
    String nombreArchivo = "reporte.xls";
    response.setHeader("Content-Disposition", "attachment;filename=" + nombreArchivo);
%>
<!DOCTYPE html>
<html>
    <head>
        <title>Reporte Excel</title>
    </head>
    <body>
        <h1>Reporte Excel</h1>
        <br>
        <table border="1">
            <tr>
                <th>Curso</th>
                <th>Descripcion</th>
                <th>Fecha</th>
            </tr>
            <tr>
                <th>1. Fundamentos de Java</th>
                <th>Aprenderemos la sintaxis basica de Java</th>
                <th><%= Conversiones.format(new Date()) %></th>
            </tr>
            <tr>
                <th>2. Programacion con Java</th>
                <th>Conceptos de Java</th>
                <th><%= Conversiones.format(new Date()) %></th>
            </tr>
        </table>
    </body>
</html>
