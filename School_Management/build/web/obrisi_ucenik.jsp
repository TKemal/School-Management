<%@page import="java.util.List"%>
<%@page import="entiteti.Ucenik"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type= "text/css" href="style.css">
        <title>Obrisi učenika</title>
    </head>
    <body>
        <h1>Izaberi ucenika za brisanje:</h1>
        <%!List<Ucenik> ucenikLista;%>
        <%ucenikLista = (List<Ucenik>)session.getAttribute("svi");%>
        <%for(Ucenik u : ucenikLista){%>
        <%=u.getId()%>&nbsp;<%=u.getIme()%>&nbsp;<%=u.getPrezime()%>&nbsp;<%=u.getDob()%>&nbsp;<%=u.getRazred_id()%><br>
        <%}%>
        <form action="BrisiServlet">
        Unesi id korisnika koji ce biti obrisan:
        <input type="text" name="id">
        <input type="submit" value="Obrisi">
        </form>
        <a href="prikaz_ucenik.jsp">Idi na stranicu za prikaz</a>
    </body>
</html>
