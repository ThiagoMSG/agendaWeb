<%@page import="br.ucsal.agenda.model.Contato"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="dao" class="br.ucsal.agenda.dao.AgendaDAO"/>
<table border="1">
	<thead>
		<tr>
			<th>Nome</th>
			<th>Telefone</th>
		</tr>
	
	</thead>
	<tbody>
	<%for (Contato contato: dao.listar()){ %>
		<tr>
			<td><%=contato.getNome()%></td>
			<td><%=contato.getTelefone()%></td>
		</tr>
		<%}%>
	</tbody>
</table>
<br><a href="index.jsp">voltar</a>
</body>
</html>