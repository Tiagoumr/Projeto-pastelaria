package br.com.lm.dao;

import br.com.lm.modelo.Item;
import br.com.lm.modelo.Produto;
import java.util.List;

public interface ProdutoDao {

    public List<Produto> getProdutos();
    public List<Item> getItens();
        
    public List<Item> adicionarItem(Item p);  
    
    public Produto inicializarProduto();
        
    public Produto criarProduto(String nome, double preco);

	public Produto buscarProduto(String nome);

//	public Produto alterarProduto();

//	public Produto excluirProduto();
    


}
