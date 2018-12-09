package br.com.lm.dao;

import br.com.lm.modelo.NotaEntrada;

public interface NotaEntradaDao {

	public NotaEntrada criarNotaEntrada();

	public NotaEntrada buscarNotaEntrada();

	public void alterarNotaEntrada();

	public void excluirNotaEntrada();

}
