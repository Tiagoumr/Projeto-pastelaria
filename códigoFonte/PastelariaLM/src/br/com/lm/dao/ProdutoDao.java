package br.com.lm.dao;

import br.com.lm.modelo.Produto;
import java.util.List;

public interface ProdutoDao {

        //public List<Produto> produtos;

        public List<Produto> getProdutos();
        
        public Produto criarProduto(String nomeProduto, double precoProduto, int quantidadeProduto);

	public Produto buscarProduto(String nomeProduto);

	public Produto alterarProduto();

	public Produto excluirProduto();

}
