<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!--HttpSession _sesion = request.getSession(false);
String _avatar = null;
if(_sesion != null) {
    Usuario _usr = (Usuario)_sesion.getAttribute("usuario");
    if(_usuario != null) {
    _avatar = _usuario.getAvatar();
    }
}-->
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Visita</title>
        <link rel="stylesheet" href="public/css/visita/visita-landing.css"/>
    </head>
    <body>
        <div id="container">
        <h1>Estas de visita pana</h1>
        <h2>julioansito</h2>
        <img src="public/img/patata.png" alt="patata"/>
        
        <% // if (_avatar != null) {
//        <img src="<%=_avatar%>" alt="patata"/>
            <!--}-->
        
        <!--<input type="submit" value="Hola" />
        </div>
    </body>
</html>

