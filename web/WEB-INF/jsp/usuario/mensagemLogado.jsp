<%-- 
    Document   : mensagemLogado
    Created on : 22/06/2019, 11:35:07
    Author     : maria
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bem vindo ${pessoa.nome} </h1>
        
        <table>
            <tr>
                <th>Id</th>
                <th>Correntista</th>
                <th>Agencia</th>
                <th>Conta</th>
                <th>Saldo</th>
                <th>Tipo</th>
            </tr>
            <tr>
                <td>${conta.id}</td>
                <td>${conta.pessoa.nome}</td>
                <td>${conta.agencia}</td>
                <td>${conta.conta}</td>
                <td>${conta.saldo}</td>
                <td>${conta.tipo}</td>
            </tr>
        </table>
        <br>
        <form>
        
        <form action="fazerlogoff" method="GET">
            <input type="submit" value="sair">
        </form> 
            
    </body>
</html>
