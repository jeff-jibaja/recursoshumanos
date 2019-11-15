/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import BEANS.redBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logic.redImp;

/**
 *
 * @author jeff
 */
public class redController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String nomRed = request.getParameter("red").trim();
        String operacion = request.getParameter("operacion");
        String mensaje = null;

        String guardar = "red.jsp";

        redImp red = new redImp();
        
        switch (operacion) {
            case "Guardar":
                try {
                    if (nomRed.isEmpty()) {
                        mensaje = "DEBE AGREGAR EL NOMBRE DE LA RED QUE DESEA GUARDAR";
                    } else {
                        Object[] obj = new Object[1];
                        obj[0] = nomRed.toLowerCase();
                        if (red.insert(obj)) {
                            mensaje = "RED AGREGADA DE MANERA EXITOSA";
                        } else {
                            mensaje = "SE PRESENTO UN ERROR AL INTENTAR AGREGAR LA RED";
                        }
                    }
                } catch (NullPointerException ex) {
                    mensaje = "DEBE AGREGAR EL NOMBRE DE LA RED QUE DESEA GUARDAR";
                }
                request.getSession().setAttribute("mensaje", mensaje);
                break;
            case "eliminar":
                
                
                break;
        }
        
        request.getRequestDispatcher(guardar).forward(request, response);
        System.out.println(mensaje);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
