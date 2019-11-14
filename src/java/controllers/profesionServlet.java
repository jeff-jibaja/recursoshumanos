/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import BEANS.profesionBean;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logic.profesionImp;

/**
 *
 * @author jeff
 */
public class profesionServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        
        profesionImp prof = new profesionImp();
        profesionBean bprof = new profesionBean();

        String mensaje;

        if (request.getParameter("profParam").trim().equals("")) {
            mensaje = "DEBE LLENAR EL NOMBRE DE LA PROFESION PARA GUARDAR";
            request.getSession().setAttribute("mensaje", mensaje);
            request.getRequestDispatcher("../vistas/profesiones.jsp").forward(request, response);

        } else {
            String profesion = request.getParameter("profParam").trim().toUpperCase();
            
            Object param[] = new Object[1];
            param[0] = profesion;
            
            if (prof.insert(param)) {
                mensaje = "PROFESIÓN AGREGADA EXITOSAMENTE";
                request.getSession().setAttribute("mensaje", mensaje);
                request.getRequestDispatcher("profesiones.jsp").forward(request, response);

            } else {
                mensaje = "ERROR AL AGREGAR PROFESIÓN";
                request.getSession().setAttribute("mensaje", mensaje);
                request.getRequestDispatcher("profesiones.jsp").forward(request, response);

            }

        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
