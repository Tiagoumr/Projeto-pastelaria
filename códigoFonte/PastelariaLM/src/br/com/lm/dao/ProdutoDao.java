package br.com.lm.dao;

import br.com.lm.modelo.Produto;

public interface ProdutoDao {

	private List<Produto> produtos;

	public Produto produtoDao();

	public Produto criarProduto();

	public Produto buscarProduto();

	public void alterarProduto();

	public void excluirProduto();

}
