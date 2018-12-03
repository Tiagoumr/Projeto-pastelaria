package br.com.lm.modelo;

import java.util.ArrayList;
import java.util.List;

public class Produto {

    private int codigoProduto;
    private String nome;
    private double preco;    
    private int quantidade;
    
    private List<Item> itens = new ArrayList();

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    @Override
    public String toString() {
        return "Produto{" + "codigoProduto=" + codigoProduto + ", nome=" + nome + ", preco=" + preco + ", qtd=" + quantidade + ", itens=" + itens + '}';
    }
    
    
}