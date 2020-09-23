package br.ucsal.agenda.gui;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.agenda.dao.AgendaDAO;
import br.ucsal.agenda.model.Contato;

@WebServlet(urlPatterns = "/agendasave")
public class AgendaSaveController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		AgendaDAO dao = new AgendaDAO();
		String nome = req.getParameter("nome");
		String telefone = req.getParameter("telefone");
		if(nome!=null) {
			Contato contato = new Contato(nome,telefone);
			dao.salvar(contato);
		}
		resp.sendRedirect("./index.jsp");
	}
}
