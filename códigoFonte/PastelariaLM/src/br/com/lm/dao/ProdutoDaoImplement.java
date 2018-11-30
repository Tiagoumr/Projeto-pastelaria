package br.com.lm.dao;

import br.com.lm.modelo.Produto;
import java.util.List;

public class ProdutoDaoImplement implements ProdutoDao {

        List<Produto> produtos;
        
        public void inicializarProduto(){
            Produto p = new Produto();
            p.setNome("Pastel de Carne");
            p.setPreco(3.00);
            produtos.add(p);
            
            p = new Produto();
            p.setNome("Pastel de Queijo");
            p.setPreco(4.00);
            produtos.add(p);
            
            p = new Produto();
            p.setNome("Pastel de presunto e Queijo");
            p.setPreco(5.00);
            produtos.add(p);
            
        }
        
	public Produto produtoDao() {
		return null;
	}
	public Produto criarProduto() {
		return null;
	}

        public Produto {
            
        }
}
	public Produto buscarProduto() {
		return null;
	}

	public void alterarProduto() {

	}

	public void excluirProduto() {

	}

}
