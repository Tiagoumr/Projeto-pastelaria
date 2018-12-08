package br.com.lm.dao;

import br.com.lm.modelo.Pedido;
import br.com.lm.modelo.Produto;
import java.util.ArrayList;
import java.util.List;

public class PedidoDaoImplement implements PedidoDao {
    
    int codigoPedido = 0;
    
    public List<Pedido> pedidos = new ArrayList<>();
    public List<Produto> produtos = new ArrayList<>();

    
    @Override
    public List<Pedido> getPedidos() {
        return pedidos;
    }

    @Override
    public List<Produto> getProdutos() {
        return produtos;
    }
    
//	@Override
//    public Pedido criarPedido(int data, String metodoPgto, String tipoPedido, List<Produto> list) {        
//        Pedido pedido = new Pedido(data, metodoPgto, tipoPedido, list);       
//		return pedido;
//	}
    
    @Override
    public Pedido criarPedido(String tipoPedido){
        codigoPedido++;
        Pedido pedido = new Pedido(tipoPedido);
        return pedido;
    }
    
    
    
//        @Override
//    public List<Produto> pesquisarPorNome(String nome) {
//        //Produto produto = controlador.BuscarProduto(nome);
//        return null;
//        }

    @Override
    public Pedido incluirProduto(Pedido pd, Produto p) {
        pd.getProdutos().add(p);
        return pd;
    }
    

    

}