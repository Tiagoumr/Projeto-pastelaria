package br.com.lm.dao;

import br.com.lm.modelo.Item;
import br.com.lm.modelo.Produto;
import java.util.List;

public interface ProdutoDao {

    public List<Produto> getProdutos();

    public void inicializarProduto();

    public Produto criarProduto(String nome, double preco);

    public void adicionarProduto(Produto p);

    public Produto buscarProduto(String nome);

//	public Produto alterarProduto();
//	public Produto excluirProduto();
}
