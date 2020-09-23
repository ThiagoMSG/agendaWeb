<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Novo</title>
</head>
<body>
<h1>Novo Contato</h1> <br>
<form action="./agendasave" method="post" >
	Nome: <input type="text" name="nome" id="nome"> <br>
	Telefone: <input type="text" name="telefone" id="telefone"> <br>
<button type="submit">Salvar</button>  
</form>
</body>
</html>