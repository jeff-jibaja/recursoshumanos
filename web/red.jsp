<%-- 
    Document   : red
    Created on : Nov 14, 2019, 2:39:11 AM
    Author     : jeff
--%>

<%@page import="BEANS.redBean"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    String mensaje = (String) request.getSession().getAttribute("mensaje");

%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/input.css"/>
        <link rel="stylesheet" href="css/personal.css"/>
        <link rel="stylesheet" href="css/table.css"/>
    </head>
    <body>
        <main class="body">
            <section class="banner">

            </section>
            <section class="panel-body">
                <form class="form" method="post" action="redController">  
                    <div class="header-formulario">
                        <p>•Datos Básicos</p>
                    </div>
                    <div class="body-formulario">
                        <div class="grupo">
                            <label>RED</label>
                            <input type="text" name="red" class="form-control">
                        </div> 
                        <div class="alerta succes">
                            <p><%=mensaje%></p>
                            
                        </div>

                        <input type="submit" class="boton guardar" name="operacion" value="Guardar">
                    </div>    

                </form>
                <div class="listado">
                    <table class="table">
                        <tr class="table_header">
                            <td>NÚMERO</td>
                            <td>RED</td>

                            <td>OPCIONES</td>
                        </tr>
                    

                        <tr class="table_body">
                            <td> </td>
                            <td>  </td>
                            <td>
                                <input type="submit" class="boton boton_editar" value="+" >
                                <input type="submit" class="boton boton_eliminar" value="+" >
                            </td>
                        </tr>
                       


                    </table>
                </div>
            </section>


        </main>
    </body>
</html>
