package br.com.lm.dao;

import br.com.lm.modelo.Item;
import br.com.lm.modelo.Produto;
import java.util.List;

public interface ProdutoDao {

    public List<Produto> getProdutos();
   
    public List<Item> getItens();
        
    public List<Item> adicionarItem(Item p);  
    
    public void inicializarProduto();
        
    public Produto criarProduto(String nome, double preco, int estoque);    
    
    public void adicionarProduto(Produto p);
    
    public Produto buscarProduto(String nome);

    public void setEstoque(int pos, int estoque);
    
//	public Produto alterarProduto();

//	public Produto excluirProduto();
    


}
