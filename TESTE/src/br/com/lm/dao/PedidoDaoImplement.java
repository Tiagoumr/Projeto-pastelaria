package br.com.lm.dao;

import br.com.lm.modelo.Pedido;
import br.com.lm.modelo.Produto;
import java.util.ArrayList;
import java.util.List;

public class PedidoDaoImplement implements PedidoDao {
    
    private List<Pedido> pedidos = new ArrayList<>();
    private List<Produto> produtos = new ArrayList<>();

	public Pedido criarPedido() {
		return null;
	}

        @Override
    public List<Produto> pesquisarPorNome(String nome) {
        //Produto produto = controlador.BuscarProduto(nome);
        return null;
    }

    @Override
    public List<Pedido> getPedidos() {
        return pedidos;
    }

    @Override
    public List<Produto> getProdutos() {
        return produtos;
    }

}
