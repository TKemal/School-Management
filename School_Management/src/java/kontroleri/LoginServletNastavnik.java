/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontroleri;

import entiteti.Nastavnici;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.UslugeUcenik;


@WebServlet(name = "LoginServletNastavnik", urlPatterns = {"/LoginServletNastavnik"})
public class LoginServletNastavnik extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String username = request.getParameter("usernameNastavnik");
        String password = request.getParameter("passwordNastavnik");
        //try (PrintWriter out = response.getWriter()) {
        RequestDispatcher rd;
        Nastavnici nastavnik = new Nastavnici(username, password);
        HttpSession sesija = request.getSession();
        try {
            boolean login = UslugeUcenik.loginNastavnici(new Nastavnici(username, password));
            if(!UslugeUcenik.loginNastavnici(nastavnik))
            {  
                rd = request.getRequestDispatcher("pogresan_pass.jsp");
                rd.forward(request, response);
            } 
            else{
            sesija.setAttribute("username",username);
            sesija.setAttribute("password", password);
            rd = request.getRequestDispatcher("nastavnik.html");
            rd.forward(request, response);
        }} catch (SQLException ex) {}
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
