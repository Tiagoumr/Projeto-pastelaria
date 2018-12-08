package br.com.lm.dao;

import br.com.lm.modelo.Item;
import br.com.lm.modelo.Produto;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDaoImplement implements ProdutoDao {

    private final List<Produto> produtos = new ArrayList<>();
    private final List<Item> itens = new ArrayList<>();
    
    @Override
    public Produto inicializarProduto(){
            Produto p = new Produto("Carne", 3.00);
            p.setNome("Carne");
            p.setPreco(3.00);            
            produtos.add(p);
            
            p = new Produto("Pastel de Queijo", 4.00);
            p.setNome("Pastel de Queijo");
            p.setPreco(4.00);
            produtos.add(p);
            
            p = new Produto("Pastel de presunto e Queijo", 5.00);
            p.setNome("Pastel de presunto e Queijo");
            p.setPreco(5.00);
            produtos.add(p);
            System.out.println(this);
            return null;
        } 

    @Override
    public Produto criarProduto(String nome, double preco) {          
        Produto p = new Produto(nome, preco);
        return p;        
    }
   
    @Override
    public void adicionarProduto(Produto p){
        this.produtos.add(p);
    }
     @Override
    public Produto buscarProduto(String nome) {
        for(int i = 0 ; i < produtos.size(); i++){
            System.out.println(produtos.get(i).toString());            
        }        
         

//        for (Produto p : produtos) {
//            System.out.println(p.toString());
//            if (p.getNome().equals(nome)) {                
//                return p;
//            }                           
//        }
        return null;
    }
    
    @Override
    public List<Produto> getProdutos() {
        return produtos;
    }
    
    @Override
    public List<Item> getItens() {
        return itens;
    }
       
   

//    @Override
//    public Produto alterarProduto() {
//    }
//
//    @Override
//   public Produto excluirProduto() {
//    }
// 
    @Override
    public List<Item> adicionarItem(Item p) {        
        itens.add(p);
        return itens;
    }               
}