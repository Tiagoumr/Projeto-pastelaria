package br.com.lm.dao;

import br.com.lm.modelo.Produto;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDaoImplement implements ProdutoDao {

    private List<Produto> produtosList = new ArrayList<>();
        
    /* public void inicializarProduto(){
            Produto p = new Produto();
            p.setNome("Pastel de Carne");
            p.setPreco(3.00);
            produtosList.add(p);
            
            p = new Produto();
            p.setNome("Pastel de Queijo");
            p.setPreco(4.00);
            produtosList.add(p);
            
            p = new Produto();
            p.setNome("Pastel de presunto e Queijo");
            p.setPreco(5.00);
            produtosList.add(p);
            
        } */

    @Override
    public List<Produto> getProdutos() {
        return produtosList;
    }
    
    
    @Override
    public Produto buscarProduto(String nomeProduto) {
        for (Produto p : produtosList) {
            if (p.getNome().equals(nomeProduto)) {
                return p;
            }    
        }
        return null;
    }

    @Override
    public Produto alterarProduto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Produto excluirProduto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Produto> getProdutosList() {
        return produtosList;
    }

    public void setProdutosList(List<Produto> produtosList) {
        this.produtosList = produtosList;
    }

    @Override
    public Produto criarProduto(String nome, double preco, int quantidade) {
        Produto p = new Produto(nome, preco, quantidade);
        return p;
    }



    
    

}
