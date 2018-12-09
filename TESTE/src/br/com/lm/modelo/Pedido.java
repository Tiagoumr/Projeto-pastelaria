package br.com.lm.modelo;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private int codigoPedido;
    private int data;
    private double valorTotal;
    private String metodoPgto;
    private String tipoPedido;
    private Cliente cliente;
    private List<Produto> produtos = new ArrayList<>();
     
    public List<Produto> getProdutos() {
        return produtos;
    }
    
    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
//    public Pedido(int data, String metodoPgto, String tipoPedido, List<Produto> produtos) {
//        this.data = data;
//        this.metodoPgto = metodoPgto;
//        this.tipoPedido = tipoPedido;
    

//        this.produtos = produtos;
//    }
//    public void addProduto(Produto p, int quantidade) {
//        p.setQuantidade(quantidade);
//        produtos.add(p);
//digite o produto:
//scanner.cod
//buscarProduto(cod)        
//return Produto
    //Calcular valor total do pedido
//    }
//     public void calcularTotal(){
//        for (Produto p: produtos){
//            valorTotal = valorTotal + p.getPreco();
//        }
//    }
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

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getMetodoPgto() {
        return metodoPgto;
    }

    public void setMetodoPgto(String metodoPgto) {
        this.metodoPgto = metodoPgto;
    }

    public String getTipoPedido() {
        return tipoPedido;
    }

    public void setTipoPedido(String tipoPedido) {
        this.tipoPedido = tipoPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Pedido{" + "codigoPedido=" + codigoPedido + ", data=" + data + ", valorTotal=" + valorTotal + ", metodoPgto=" + metodoPgto + ", tipoPedido=" + tipoPedido + ", cliente=" + cliente + ", produtos=" + produtos + '}';
    }
    
    public void imprimir(){
        System.out.println("+----------- PASTELARIA LM  PEDIDO Nº " + codigoPedido + " -----------+");
        if (cliente == null) {
            System.out.println("| Cliente: Consumidor Não Identificado             |");
        } else {
            System.out.print(cliente.toString());
        }
            
        System.out.println("| Produtos:                                        |");
        System.out.println("| QTDE |      NOME         | VR UNIT |   VR TOTAL  |");
        for (Produto p : produtos) {
            p.imprimirProduto();
        }
        System.out.println("|                                                  |");
        System.out.println("|            Agradecemos a preferência!            |");
        System.out.println("+--------------------------------------------------+");
    }
}
