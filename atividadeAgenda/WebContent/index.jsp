<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Agenda</title>
</head>
<body>
<h1>Agenda</h1> <br>
<a href="novocontatoform.jsp">Novo Contato</a> <br>
<form action="./agendasearch" method="post" >
Pesquisar Contato: <input type="text" name="busca" id="busca"> <button type="submit">pesquisar</button>  
</form>
<a href="lista.jsp">Listar Contatos</a> <br>
<a href="excluir.jsp">Excluir Contato</a> <br>
<a href="edicao.jsp">Editar Contato</a> <br>
</body>
</html>