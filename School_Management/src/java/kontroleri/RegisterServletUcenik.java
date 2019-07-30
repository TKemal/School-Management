package kontroleri;

import entiteti.Ucenik;
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

@WebServlet(name = "RegisterServletUcenik", urlPatterns = {"/RegisterServletUcenik"})
public class RegisterServletUcenik extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
            UslugeUcenik.unesi(new Ucenik(request.getParameter("ime"), request.getParameter("prezime"),
                    request.getParameter("dob"), request.getParameter("razred_id")));
        } catch (SQLException ex) {
            ex.getMessage();
        }
       
        RequestDispatcher rd = request.getRequestDispatcher("IspisServletUcenik");
        rd.forward(request, response);
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
