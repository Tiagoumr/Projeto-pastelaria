package br.com.lm.dao;

import br.com.lm.modelo.Cliente;

public interface ClienteDao {

	public Cliente criarCliente();

	public Cliente buscarCliente();

	public void alterarCliente();

	public void excluirCliente();

}
