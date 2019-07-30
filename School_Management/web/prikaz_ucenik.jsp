<%@page import="entiteti.Ucenik"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome page</title>
    </head>
    <body>
        <h1>Welcome, </h1>
        <%!Ucenik ucenik;%>
        <%ucenik = (Ucenik) session.getAttribute("ime");%>
        <h2>mr. <%=ucenik.getIme()%></h2>
        <%!String prezime;%>
        <%prezime = (String) session.getAttribute("prezime");%>
        <h2>Korisnik je: <%=prezime%></h2>
        <%if (ucenik.getIme().equals("Selma")) {%>
        <a href="BrisiServletUcenik">Obrisi ucenika</a><br>
        <a href="AzurirajServletUcenik">Azuriraj ucenike</a><br>
        <%}%>
        <form action="AzurirajServletUcenik" method="POST">
            <table>
                <tr><td>Unesi staru lozinku</td>
                    <td><input type="text" name="lozstara"></td></tr>
                <tr><td>Unesi novu lozinku</td><td><input type="text" 
                                                          name="loznova"></td></tr> 
                <tr><td colspan="2">
                        <input type="submit" value="Promjeni"></td></tr>
            </table>
        </form>
        <a href="login_ucenik.jsp">Vrati se na stranicu za prijavu</a>
    </body>
</html>
