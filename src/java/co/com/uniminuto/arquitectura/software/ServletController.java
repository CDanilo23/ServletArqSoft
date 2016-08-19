/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.uniminuto.arquitectura.software;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cristian.ordonez
 */
public class ServletController extends HttpServlet {

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
            out.println("<title>Servlet ServletController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletController at " + request.getContextPath() + "</h1>");
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
        
//        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//  String nombre=request.getParameter("nombre");
//  String apellido=request.getParameter("apellido");
//  String edad=request.getParameter("edad");
//  String correo=request.getParameter("correo");
//  String usuario=request.getParameter("usuario");
//  String clave=request.getParameter("clave");
//  if(!nombre.equalsIgnoreCase("") && !apellido.equalsIgnoreCase("") && !edad.equalsIgnoreCase("") && !correo.equalsIgnoreCase("") && !usuario.equalsIgnoreCase("") && !clave.equalsIgnoreCase("")){
//   BeanUsuario busuario=new BeanUsuario(nombre, apellido, edad, correo, usuario, clave);
//   boolean sw=Usuario.agregarUsuario(busuario);
//   if(sw){
//    request.getRequestDispatcher("Mensaje.jsp").forward(request, response);
//   }else{
//    PrintWriter out=response.getWriter();
//    out.println("Si estas viendo este mensaje es por que algo salio mal, no se pudo completar tu solicitud.");
//   }
//  }
        
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
