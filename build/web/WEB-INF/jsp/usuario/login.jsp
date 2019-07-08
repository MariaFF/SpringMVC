<%-- 
    Document   : index
    Created on : 22/06/2019, 11:10:47
    Author     : maria
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>login</h1>
        <form action="usuarioLogin" method="POST">
            login:
            <br>
            <input type="text" name="login">
            <br>
            senha:
            <br>
            <input type="password" name="senha">
            <br>
            <input type="submit">
        </form>
    </body>
</html>
