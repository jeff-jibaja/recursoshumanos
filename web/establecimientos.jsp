<%-- 
    Document   : establecimientos
    Created on : Nov 14, 2019, 12:23:35 AM
    Author     : jeff
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="input.css"/>
        <link rel="stylesheet" href="css/personal.css"/>
        <link rel="stylesheet" href="css/table.css"/>
    </head>
    <body>
           <main class="body">
            <section class="banner">

            </section>
            <section class="panel-body">
                <form class="form">  
                    <div class="header-formulario">
                        <p>•Datos Básicos</p>
                    </div>
                    <div class="body-formulario">
                        <div class="grupo">
                            <label>ESTABLECIMIENTO</label>
                            <input type="text" class="form-control">
                        </div>
                       
                        <div class="grupos_sm">
                            <div class="grupo sm">
                                <label>RED</label>
                                <select name="sexo">
                                    <option>FEMENINO</option>
                                    <option>MASCULINO</option>
                                </select>
                            </div>
                            <div class="grupo sm">
                                <label>MICRORED</label>
                                <select name="sexo">
                                    <option>FEMENINO</option>
                                    <option>MASCULINO</option>
                                </select>
                            </div>
                        </div>
                        <input type="submit" class="boton guardar" value="Guardar">
                    </div>    

                </form>
                <div class="listado">
                    <table class="table">
                        <tr class="table_header">
                            <td>RED</td>
                            <td>MICRORED</td>
                            <td>ESTABLECIMIENTO</td>
                            <td>OPCIONES</td>
                        </tr>
                        <tr class="table_body">
                            <td>CHICLAYO</td>
                            <td>MICRORED</td>
                             <td>TUPAC AMARU</td>
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
