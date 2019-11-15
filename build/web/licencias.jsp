<%-- 
    Document   : licencias
    Created on : Nov 14, 2019, 12:23:53 AM
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
        <link rel="stylesheet" href="css/licencias.css"/>
    </head>
    <body>
        <main class="body">
            <section class="banner">

            </section>
            <section class="panel-body">
                <form class="form">  
                    <div class="header-formulario">
                        <p>•Datos Licencia</p>
                        <div class="grupos_sm">
                            <input type="text" class="form-control" placeholder="   Ingrese DNI">
                            <input type="submit" class="boton btn_buscar" value="Buscar">
                        </div>
                    </div>
                    <div class="body-formulario">

                        <div class="grupo  ">
                            <label>Nombres y Apellidos completos</label>
                            <input type="text" class="form-control">
                        </div>
                        <div class="grupos_sm">
                            <div class="grupo sm">
                                <label>Fecha Inicio</label>
                                <input type="date" class="form-control">
                            </div>
                            <div class="grupo sm">
                                <label>Fecha Fin</label>
                                <input type="date" class="form-control">
                            </div>
                        </div>

                        <div class="grupos_sm">
                            <div class="grupo sm">
                                <label>Tipo de licencia</label>
                                <select name="tipoLic">
                                    <option>--Tipo de licencia--</option>
                                    <option></option>
                                </select>
                            </div>
                            <div class="grupo sm">
                                <label>Documento</label>
                                <input type="text" class="form-control">
                            </div>
                        </div>
                        <div class="grupo ">
                            <label>Observación</label>
                            <textarea name="observacion" class="form-control" rows="4" cols="20">
                            </textarea>
                        </div>




                        <input type="submit" class="boton guardar" value="Guardar">
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
