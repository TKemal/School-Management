<%@page import="java.util.List"%>
<%@page import="entiteti.Ucenik"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" type= "text/css" href="style.css">
        <title>Stranica za azuriranje ucenika</title>
    </head>
    <body>
        <h1>Stranica za azuriranje ucenika</h1>
        <select>
        <%!List<Ucenik> ucenici;%>
        <%ucenici = (List<Ucenik>)session.getAttribute("svi");%>
        <%for(Ucenik u: ucenici){%>
        <option><%=u.getId()%>&nbsp;<%=u.getIme()%>&nbsp;<%=u.getPrezime()%>
            &nbsp;<%=u.getDob()%>&nbsp;<%=u.getRazred_id()%></option>
        <%}%>
        </select>
        <form action="AzurirajServletUcenik" method="POST">
        <table>
            <tr><td>Unesi ime ucenika</td>
            <td><input type="text" name="ime"></td></tr>
            <tr><td>Unesi prezime ucenika</td>
            <td><input type="text" name="prezime"></td></tr>
            <tr><td>Unesi godinu rođenja ucenika</td>
            <td><input type="text" name="dob"></td></tr>
            <tr><td>Unesi razred ucenika</td><td><input type="text" 
                name="razred_id"></tr>
            <tr><td colspan="2">
                    <input type="submit" value="Promjeni"></td></tr>
        </table>
        </form>
    </body>
</html>
