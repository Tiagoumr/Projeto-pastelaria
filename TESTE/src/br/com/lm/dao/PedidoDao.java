package br.com.lm.dao;

import br.com.lm.modelo.Pedido;
import br.com.lm.modelo.Produto;
import java.util.List;

public interface PedidoDao {
         
    public List<Produto> getProdutos();
//    public List<Pedido> getPedidos();
    
//    public Pedido criarPedido(int data, String metodoPgto, String tipoPedido, List<Produto> list);
   
    public Pedido criarPedido();
    
    public Pedido incluirProduto(Pedido pd, Produto p);   
}
