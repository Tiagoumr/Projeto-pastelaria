package br.com.lm.modelo;

import java.util.ArrayList;
import java.util.List;

public class Produto {

    private int codigoProduto;
    private String nome;
    private double preco;    
    private int estoque;
    private int quantidade;
    private int estoqueMin;
    
//    private List<Item> itens = new ArrayList();

    public Produto(String nome, double preco, int estoque, int estoqueMin) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        this.estoqueMin = estoqueMin;
    }

    public Produto(Produto p){
        this.codigoProduto = p.getCodigoProduto();
        this.nome = p.getNome();
        this.preco = p.getPreco();
    }
    
    public Produto() {
        
    }
    
    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getEstoqueMin() {
        return estoqueMin;
    }

    public void setEstoqueMin(int estoqueMin) {
        this.estoqueMin = estoqueMin;
    }    
    
//    public List<Item> getItens() {
//        return itens;
//    }
//
//    public void setItens(List<Item> itens) {
//        this.itens = itens;
//    }

//    @Override
//    public String toString() {
//        return "Produto{" + "codigoProduto=" + codigoProduto + ", nome=" + nome + ", preco=" + preco + ", qtd=" + quantidade + ", itens=" + itens + '}';
//    }

    @Override
    public String toString() {   
        
        return "Produto{" + "codigoProduto=" + codigoProduto + ", nome=" + nome + ", preço= R$" + preco + ", Estoque=" + estoque + '}';
    }
    
    public void imprimirProduto(){
        System.out.printf("|  %2d  |  %-16s |  %2.2f   |    %3.2f     |%n", quantidade, nome, preco, quantidade*preco);
    }
    
    
}