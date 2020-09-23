package br.ucsal.agenda.gui;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.agenda.dao.AgendaDAO;

@WebServlet(urlPatterns = "/agendaedit")
public class AgendaEditController extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		AgendaDAO dao = new AgendaDAO();
		String nome = req.getParameter("velhoNome");
		System.out.println(nome);
		String novoNome = req.getParameter("novoNome");
		System.out.println(novoNome);
		String novoTelefone = req.getParameter("novoTelefone");
		System.out.println(novoTelefone);
		if (nome != null) {
			dao.editar(nome,novoNome,novoTelefone);
		}
		resp.sendRedirect("./index.jsp");
	}
}
