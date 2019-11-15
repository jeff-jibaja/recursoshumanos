<%-- 
    Document   : registroPersonal
    Created on : Nov 14, 2019, 12:24:14 AM
    Author     : jeff
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%
    String mensaje = (String)request.getSession().getAttribute("mensaje");

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
                <form class="form" method="post" action="personalController">  
                    <div class="header-formulario">
                        <p>•Datos Básicos</p>
                    </div>
                    <div class="body-formulario">
                        <div class="grupo">
                            <label>Nombres</label>
                            <input type="text" class="form-control" name = "nombres">
                        </div>
                        <div class="grupos_sm">
                               <div class="grupo sm">
                            <label>Apellido Paterno</label>
                            <input type="text" class="form-control" name="app">
                        </div>
                        <div class="grupo sm">
                            <label>Apellido Materno</label>
                            <input type="text" class="form-control" name="apm">
                        </div>
                        </div>
                        <div class="grupos_sm">
                            <div class="grupo sm">
                                <label>dni</label>
                                <input type="text" class="form-control" name="dni">
                            </div>
                            <div class="grupo sm">
                                <label>Telefono</label>
                                <input type="text" class="form-control" name="telefono">
                            </div>
                        </div>

                        <div class="grupos_sm">
                            <div class="grupo sm">
                                <label>Fecha Nacimiento</label>
                                <input type="date" class="form-control" name="fechaNac">
                            </div>
                            <div class="grupo sm">
                                 <label>Sexo</label>
                                <select name="sexo" name="sexo">
                                    <option>FEMENINO</option>
                                    <option>MASCULINO</option>
                                </select>
                            </div>
                        </div>


                        <%=mensaje%>
                        <input type="submit" class="boton guardar" name="action"value="Guardar">
                    </div>    

                </form>
                <div class="listado">
                    <table class="table">
                        <tr class="table_header">
                            <td>Nombres</td>
                            <td>Profesion</td>
                            <td>Opciones</td>
                            <td>Opciones</td>
                            <td>Opciones</td>
                            <td>Opciones</td>
                            <td>Opciones</td>
                            <td>Opciones</td>
                        </tr>
                        <tr class="table_body">
                            <td>das</td>
                            <td>dasd</td>
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
