

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Prikaz ocjena ucenika</title>
    </head>
    <body>
         <form action="PrikazOcjena  Servlet" method="GET">
            <table>
                <tr><td>Unesi ID ucenika</td>
                    <td><input type="text" name="id"></td></tr>
               
                <tr><td colspan="2">
                        <input type="submit" value="Prikazi"></td></tr>
            </table>
        </form>
    </body>
</html>
