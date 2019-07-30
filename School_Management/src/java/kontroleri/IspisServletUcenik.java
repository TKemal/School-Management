package kontroleri;

import entiteti.Ucenik;
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

@WebServlet(name = "IspisServletUcenik", urlPatterns = {"/IspisServletUcenik"})
public class IspisServletUcenik extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        ArrayList<Ucenik> ucenikLista;
        try (PrintWriter out = response.getWriter()) {
            try {
                ucenikLista = UslugeUcenik.listajSve();
                out.println("<!DOCTYPE html>");
                out.println("<html>");

                out.println("<body>");

                ucenikLista.forEach((u) -> {
                    out.println("<style>table, th, td {border: 0px solid black;border-collapse: collapse;}th, td {padding: 5px;}"
                            + "th, td {text-align: left;}"
                            + "                        </style><table style='width:100%'><th> ID učenika :</th><td>" + u.getId()
                            + "</td><th>Ime učenika : </th><td> " + u.getIme()
                            + "</td><th>Prezime učenika : </th><td> " + u.getPrezime()
                            + "</td><th>Godina rođenja : </th><td> " + u.getDob()
                            + "</td><th>Razred : </th><td> " + u.getRazred_id() + "</td></table>");
                });
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
            } catch (SQLException ex) {
            }
        }
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
