package br.com.lm.dao;

import br.com.lm.modelo.Item;
import br.com.lm.modelo.Produto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class ProdutoDaoImplement implements ProdutoDao {

    private List<Produto> produtosLista = new ArrayList<>();
    
    @Override
    public List<Produto> getProdutos() {
        return produtosLista;
        }
        
    @Override
    public void inicializarProduto(){
            Produto p = new Produto();
            p.setNome("CARNE");
            p.setPreco(3.00);            
            produtosLista.add(p);
            
            p = new Produto();
            p.setNome("QUEIJO");
            p.setPreco(4.00);
            produtosLista.add(p);
            
            p = new Produto();
            p.setNome("PRESUNTO");
            p.setPreco(5.00);
            produtosLista.add(p);
        } 

    @Override
    public Produto criarProduto(String nome, double preco) {          
        Produto p = new Produto();
        p.setNome(nome);
        p.setPreco(preco);
        return p;        
    }
   
    @Override
    public void adicionarProduto(Produto p){
        this.produtosLista.add(p);
    }

    @Override
    public Produto buscarProduto(String nome) {
        for(Produto p : produtosLista){
            if (p.getNome().equals(nome)) {                
                return p;  
            }
        return null;
    }
