<%-- 
    Document   : profesiones
    Created on : Nov 2, 2019, 7:50:03 PM
    Author     : jeff
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profesiones</title>
        <link rel="stylesheet" href="css/input.css"/>
        <link rel="stylesheet" href="css/profesiones.css"/>
        <link rel="stylesheet" href="css/table.css"/>
    </head>
    <body>
        <section class="container" >
            <form class="formulario" action="">
                <div class="form-header">
                    <p>PROFESIONES</p>
                </div>
                <div class="foor-group">
                    <label>Nombre de profesion</label>
                    <input type="text" class="form-control" name="profParam"><br>
                    
                </div>
                <div class="foor-group">
                    <input type="submit" class="boton boton_guardar"  id="guardar" value="Guardar">
                </div>
            </form>
            <table class="table">
                <tr class="table_header">
                    <td>Código</td>
                    <td>Profesion</td>
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
        </section>
        
        <script src="../js/validacionProfesion.js"></script>
    </body>
</html>
