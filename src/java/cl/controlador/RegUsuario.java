/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.controlador;

import cl.modelo.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author JPOZO-LAPTOP
 */
@WebServlet(name = "RegUsuario", urlPatterns = {"/registroUsuario.do"})
public class RegUsuario extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegUsuario</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegUsuario at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        //Recuperar desde el ámbito de la aplicación o "nube"
        //la lista de usuario.
        ArrayList<Usuario> lstUsuarios = 
        (ArrayList) getServletContext().getAttribute("lstUsuarios");
        //Se recuperan los parámetros desde la petición.
        String nombre = request.getParameter("txtNombre");
        String apellido = request.getParameter("txtApellido");
        String usuario = request.getParameter("txtUser");
        String password = request.getParameter("txtPass");
        //Se realiza una validación básica.
        String errores="", msg="";
        if (nombre.isEmpty()){
            errores = "Debes ingresar el nombre. <br />";
        }
        if (apellido.isEmpty()){
            errores += "Debes ingresar el apellido. <br />";
        }
        if (usuario.isEmpty()){
            errores += "Debes ingresar el usuario. <br />";
        }
        if (password.isEmpty()){
            errores += "Debes ingresar la password. <br />";
        }
        if (errores.isEmpty()){//No hubo errores
            // se intancia un objeto de la clase usuario
               Usuario usu= new Usuario(nombre, apellido, usuario, password);
            //Agregar el usuario a la lista. 
                lstUsuarios.add(usu);
            //Se actualiza la lista.
                getServletContext().setAttribute("lstUsuarios", lstUsuarios);
            // entregamos mensaje
                msg = "usuario se a registrado correctamente";
                request.setAttribute("msg", msg);
            
        } else {
            request.setAttribute("msg", errores);
        }
        request.getRequestDispatcher("inscribirUsuario.jsp")
                .forward(request, response);
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
