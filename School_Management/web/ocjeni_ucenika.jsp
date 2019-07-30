

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Stranica za ocjenjivanje</title>
        <link rel="stylesheet" type= "text/css" href="style.css">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
   
    <body>

        <form name="forma" action="OcjeniServletUcenik" method="POST">

            <div class="loginbox">
                <img src="images/login.png" class="avatar">
                <h1>Ocjeni ucenika</h1>
                <form>
                    <p>I.D. ucenika</p>
                    <input type="text" name="id" placeholder="Unesite I.D. ucenika">
                    <p>I.D. predmeta</p>
                    <input type="text" name="predmet" placeholder="Unesite I.D. predmeta">
                    <p>Ocjena</p>
                    <input type="text" name="ocjena" placeholder="Unesite ocjenu (1-5)">
                    <input type="submit" name="" value="Ocijeni">
                  </form>
                 <form name="forma" action="index.html" method="POST">
                     <input type="submit" name="nazad" value="Nazad na pocetnu stranicu">
                      </form>
            </div>


        </form>
    </body>
</html>
