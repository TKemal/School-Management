package kontroleri;

import entiteti.Korisnici;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.UslugeUcenik;
@WebServlet(name = "LoginServletUcenik", urlPatterns = {"/LoginServletUcenik"})
public class LoginServletUcenik extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //try (PrintWriter out = response.getWriter()) {
        RequestDispatcher rd;
        Korisnici korisnik = new Korisnici(username, password);
        HttpSession sesija = request.getSession();
        try {
            boolean login = UslugeUcenik.login(new Korisnici(username, password));
            if(!UslugeUcenik.login(korisnik))
            {  
                rd = request.getRequestDispatcher("pogresan_pass.jsp");
                rd.forward(request, response);
            } 
            else{
            sesija.setAttribute("username",username);
            sesija.setAttribute("password", password);
            rd = request.getRequestDispatcher("NewServlet");
            rd.forward(request, response);
        }} catch (SQLException ex) {}
        //}
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


}
