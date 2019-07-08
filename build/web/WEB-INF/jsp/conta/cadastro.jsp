<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <h1>Cadastro de conta</h1>
        <form id="frmConta" method="post" modelAttribute="conta">
            Agencia<br>
            <input name="agencia" type="text"/><br/> 
            
            Conta<br>
            <input name="conta" type="text"/><br/> 
            <br>
            Tipo
            <br>
            <select name="tipo">
                <option>Selecione o tipo de conta</option>
                <option name="corrente" value="corrente">Corrente</option>
                <option name="poupanca" valee="poupanca">Poupança</option>
            </select>
            
            <br>
            <br>
            <input type="submit"/>
        </form>
    </body>
</html>
