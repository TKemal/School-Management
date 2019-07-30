

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
      <head>
        <title>Stranica za prijavu</title>
        <link rel="stylesheet" type= "text/css" href="style.css">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <%Integer counter = (Integer) session.getAttribute("counter");
        if (counter == null) {
            counter = new Integer(1);
        } else {
            counter = new Integer(counter.intValue() + 1);
        }
        session.setAttribute("counter", counter);
    %>
    <body>

        <form name="forma" action="LoginServletUcenik" method="POST">

            <div class="loginbox">
                <img src="images/login.png" class="avatar">
                <h1>Prijava ucenika</h1>
                <form>
                    <p>Korisnicko ime</p>
                    <input type="text" name="username" placeholder="Unesite korisnicko ime">
                    <p>Lozinka</p>
                    <input type="password" name="password" placeholder="Unesite lozinku">
                    <input type="submit" name="" value="Prijava">
                 </form>
                <form action="index.html">
                <input type="submit" name="nazad" value="Nazad na pocetnu stranicu">
                                 </form>


                    Prijavljujete se <%=counter%> put.

            </div>


        </form>
    </body>
</html>
