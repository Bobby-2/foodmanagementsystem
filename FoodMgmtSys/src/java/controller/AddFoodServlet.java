/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import food.DBAccess;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author USER
 */

public class AddFoodServlet extends HttpServlet {

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
            HttpSession session = request.getSession();
            food.DBAccess dbAccess = new DBAccess(session);

            String Food_name = request.getParameter("name");
            String Food_type = request.getParameter("type");
            String Food_description = request.getParameter("description");
            String Food_qty = request.getParameter("qty");
            String Food_date = request.getParameter("date");
            String Expiry_date = request.getParameter("expiry");
            String Food_location = request.getParameter("location");

            if (dbAccess.addfood(Food_name, Food_type, Food_description, Food_qty, Food_date, Expiry_date, Food_location) > 0) {
                out.println("<b style='color:green'>Food Added Successfully..</b>");
            } else {
                out.println("<b style='color:red'> Food not Added...</b>");
            }
            out.println("<a href='./UserHome.jsp'><input type='button' value='Back'></a>");
        }

    }

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
