package br.com.lm.modelo;

import java.util.List;

public class Pedido {

    private int codigoPedido;
    private int data;
    private double valorTotal;
    private String metodoPgto;
    private TipoPedido tipoPedido;
    private Cliente cliente;
    private List<Produto> produtos;

    public void addProduto(Produto p, int quantidade) {        
        p.setQuantidade(quantidade);
        produtos.add(p)
        
//digite o produto:
//scanner.cod
//buscarProduto(cod)        
//return Produto
    //Calcular valor total do pedido
     public void calcularTotal(){
        for (Produto p: produtos){
            valorTotal = valorTotal + p.getPreco();
        }
    }
     
     //fecharPedido() chamaria calcularTotal
     
     

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getMetodoPgto() {
        return metodoPgto;
    }

    public void setMetodoPgto(string metodoPgto) {
        this.metodoPgto = metodoPgto;
    }

    public TipoPedido getTipoPedido() {
        return tipoPedido;
    }

    public void setTipoPedido(TipoPedido tipoPedido) {
        this.tipoPedido = tipoPedido;
    }

    public Produto[] getProduto() {
        return produto;
    }

    public void setProduto(Produto[] produto) {
        this.produto = produto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }

}
