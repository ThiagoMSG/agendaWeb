package br.ucsal.agenda.gui;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.agenda.dao.AgendaDAO;
import br.ucsal.agenda.model.Contato;

@WebServlet(urlPatterns = "/agendasearch")
public class AgendaSearchController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		AgendaDAO dao = new AgendaDAO();
		String nome = req.getParameter("busca");	
		if(nome!=null) {
			Contato buscado = dao.pesquisar(nome);
			resp.getWriter().append("Nome: "+buscado.getNome()+"<br>");
			resp.getWriter().append("Telefone: "+buscado.getTelefone());
		}else {
			resp.sendRedirect("./index.jsp");
			
		}
		
	}
	
}
