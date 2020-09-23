<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>edicao</title>
</head>
<body>
<h1>Editar Contato</h1>
<br>
<form action="./agendaedit" method="post" >

Digite o nome atual: <input type="text" name="velhoNome" id="velhoNome"> 
Digite o novo nome: <input type="text" name="novoNome" id="novoNome"> 
Digite o novo telefone: <input type="text" name="novoTelefone" id="novoTelefone"> 
<button type="submit">editar</button>  
</form>
</body>
</html>