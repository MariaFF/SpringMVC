<%-- 
    Document   : cadastro
    Created on : 08/06/2019, 14:57:25
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
        <input type="text" placeholder="digite o valor" name="valor" id="valor">
        <a href="sacar">
            <input type="button" value="sacar">
        </a>
        <a href="depositar">
            <input type="button" value="depositar">
        </a>
        <input type="text" value="${conta.saldo}" id="saldo">
    </body>
</html>
