package kontroleri;

import entiteti.Predmeti;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.UslugeUcenik;
import entiteti.Ocjene;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;

@WebServlet(name = "PrikazOcjenaServlet", urlPatterns = {"/PrikazOcjenaServlet"})
public class PrikazOcjenaServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        ArrayList<Ocjene> ocjene;
        try (PrintWriter out = response.getWriter()) {

            ocjene = UslugeUcenik.prikazOcjena();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<body>");
            ocjene.forEach((u) -> {
                out.println("<style>table, th, td {border: 1px solid black;border-collapse: collapse;}"
                        + "</style><table style='width:5%'><th> ID učenika:</th><td>" + u.getUceniciId()
                        + "</td><th>Predmet ID: </th><td> " + u.getPredmetiId()
                        + "</td><th> Ocjena: </th><td>" + u.getOcjeneId() + "</td></table>"); 
            }
            );
            out.println("<head>");
            out.println("<link rel=\"stylesheet\" type= \"text/css\" href=\"style.css\">");
            out.println("</head>");
            out.println("<div class=\"loginbox2\">");
            out.println(" <form action= nastavnik.html method=POST\">\n"
                    + "                   <input type=\"submit\" name=\"\" value=\"Nazad na početnu stranicu\">\n"
                    + "               </form>");
            out.println("</div>");
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(PrikazOcjenaServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(PrikazOcjenaServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
