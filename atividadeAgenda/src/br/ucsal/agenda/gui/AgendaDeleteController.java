package br.ucsal.agenda.gui;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.agenda.dao.AgendaDAO;

@WebServlet(urlPatterns = "/agendadelete")
public class AgendaDeleteController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		AgendaDAO dao = new AgendaDAO();
		String nome = req.getParameter("excluir");
		if (nome != null) {
			dao.excluir(nome);
		}
		resp.sendRedirect("./index.jsp");
	}
}
