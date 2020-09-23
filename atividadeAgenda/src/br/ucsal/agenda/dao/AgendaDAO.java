package br.ucsal.agenda.dao;

import java.util.ArrayList;
import java.util.List;

import br.ucsal.agenda.model.Contato;

public class AgendaDAO {

	private static List<Contato> contatos = new ArrayList<>();

	public void salvar(Contato contato) {
		contatos.add(contato);
	}

	public List<Contato> listar() {
		return new ArrayList<Contato>(contatos);
	}

	public void excluir(String nome) {
		String n = nome;
		for (int i = 0; i < contatos.size(); i++) {
			if (n.equals(contatos.get(i).getNome())) {
				contatos.remove(i);
			}
		}
	}

	public void editar(String nome, String novoNome, String novoTelefone) {
		String n = nome;
		for (int i = 0; i < contatos.size(); i++) {
			if (n.equals(contatos.get(i).getNome())) {
				contatos.get(i).setNome(novoNome);
				contatos.get(i).setTelefone(novoTelefone);
			}
		}
	}

	public Contato pesquisar(String nome) {
		String n = nome;
		for (int i = 0; i < contatos.size(); i++) {
			if (n.equals(contatos.get(i).getNome())) {
				return contatos.get(i);
			}
		}
		return null;
	}
}
