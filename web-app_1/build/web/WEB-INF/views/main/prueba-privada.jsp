<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>pagina web</title>
    </head>
    <body>
        <h1>Patata Tuberculo</h1>
        <img src="public/<%= session.getId()%>/img/patata.png" alt="patata"/>
    </body>
</html>
