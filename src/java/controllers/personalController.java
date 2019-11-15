/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import BEANS.personaBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logic.personaImp;

/**
 *
 * @author jeff
 */
public class personalController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String name = request.getParameter("nombres").trim();
        String app = request.getParameter("app").trim();
        String apm = request.getParameter("apm").trim();
        String dni = request.getParameter("dni").trim();
        String telefono = request.getParameter("telefono").trim();
        String fechaNac = request.getParameter("fechaNac").trim();
        String sexo = "M";
        String email = "DASDASDASDASD";
        String action = request.getParameter("action");
        String nuevoPers = "registroPersonal.jsp";
        
        
        
        System.out.println(fechaNac);
        String mensaje;
        if (action.equals("Guardar")) {
            if (name.isEmpty() || name.equalsIgnoreCase(null)) {
                mensaje = "DEBE LLENAR EL CAMPO NOMBRE DEL FORMULARIO";
            } else if (app.isEmpty() || app.equalsIgnoreCase(null)) {
                mensaje = "DEBE LLENAR EL CAMPO APELLIDO PATERNO DEL FORMULARIO";
            } else if (apm.isEmpty() || apm.equalsIgnoreCase(null)) {
                mensaje = "DEBE LLENAR EL CAMPO APELLIDO MATERNO DEL FORMULARIO";
            } else if (dni.isEmpty() || dni.equalsIgnoreCase(null)) {
                mensaje = "DEBE LLENAR EL CAMPO DNI DEL FORMULARIO";
            } else if (telefono.isEmpty() || telefono.equalsIgnoreCase(null)) {
                mensaje = "DEBE LLENAR EL CAMPO TELEFONO DEL FORMULARIO";
            } else if (fechaNac.isEmpty() || fechaNac.equalsIgnoreCase(null)) {
                mensaje = "DEBE LLENAR EL CAMPO FECHA DE NACIMIENTO DEL FORMULARIO";
            } else if (sexo.isEmpty() || sexo.equalsIgnoreCase(null)) {
                mensaje = "DEBE SELECCIONAR EL SEXO DE LA PERSONA EN EL FORMULARIO";
            } else if (email.isEmpty() || email.equalsIgnoreCase(null)) {
                mensaje = "DEBE LLENAR EL CAMPO NOMBRE DEL FORMULARIO";
            } else {
                personaImp imp = new personaImp();

                Object[] obj = new Object[8];
                obj[0] = name;
                obj[1] = app;
                obj[2] = apm;
                obj[3] = dni;
                obj[4] = telefono;
                obj[5] = fechaNac;
                obj[6] = sexo;
                obj[7] = email;

                if (imp.insert(obj)) {
                    mensaje = "REGISTRO AGREGADO DE MANERA CORRECTA";
                } else {
                    mensaje = "ERROR AL AGREGAR EL CAMPO";
                }
            }
            request.getSession().setAttribute("mensaje", mensaje);
            response.sendRedirect(nuevoPers);
        } else {

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
