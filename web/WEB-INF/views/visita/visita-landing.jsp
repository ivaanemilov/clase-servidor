<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Los simsons </title>

        <!-- References -->
        <meta name="author" content="Julian David Ramos Gomez - ivaaan.bulgaria@gmail.com" />
        <meta name="description" content=" Cinema Life - Visita Landing " />

        <!-- Configuration -->
        <meta name="keywords" content="HTML CSS JS" />
        <meta name="robots" content="noindex, nofollow" />

        <!-- Viewport Setup for mobile devices -->
        <meta
            name="viewport"
            content="width=device-width, initial-scale=1.0, shrink-to-fit=no"
            />

        <!-- Favicon -->
        <link rel="icon" href="img/favicon.ico" type="image/x-icon" />

        <!-- Style Sheet Links -->
        <link rel="stylesheet" href="public/css/partial/header.css"/>
        <link rel="stylesheet" href="public/css/visita/visita-landing.css"/>
        <link rel="stylesheet" href="public/css/partial/footer.css"/>
    </head>
    <body>

        <div id="container">

            <%@include file="../partial/header.jspf" %>
            <main>
                <h1> Estas en la Pagina de Inicio </h1>
                <img src="public/img/simsons.png" alt="los simsons"/>
                <!--<img src="public/img/astronauta.jpg" alt="astronauta"/>-->
                <h2> <a href="?cmd=usuario-login">Acceder </h2>
            </main>
            <%@include file="../partial/footer.jspf" %>

        </div>
        <script src="public/js/visita/visita-landing.js"></script>
    </body>
</html>
