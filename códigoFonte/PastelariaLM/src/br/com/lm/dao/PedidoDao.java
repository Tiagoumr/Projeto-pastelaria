package br.com.lm.dao;

import br.com.lm.modelo.Pedido;

public interface PedidoDao {

	private List<Produto> produto;

	public abstract Pedido criarPedido();

}
