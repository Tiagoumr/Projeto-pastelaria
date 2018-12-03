package br.com.lm.controlador;

import br.com.lm.dao.PedidoDao;
import br.com.lm.dao.PedidoDaoImplement;
import br.com.lm.dao.ProdutoDao;
import br.com.lm.dao.ProdutoDaoImplement;
import br.com.lm.modelo.Pedido;
import br.com.lm.modelo.Produto;
import java.io.InputStream;

public class Controlador {

    private PedidoDao pedidoDao = new PedidoDaoImplement();
    private ProdutoDao produtoDao = new ProdutoDaoImplement();

    public void ConsumirItem() {

    }
    
    public void adicionarProduto (Produto p) {
        this.produtoDao.getProdutos().add(p);
    }

    public Pedido criarPedido() {
        return null;
    }

    public Pedido novoProdutoPedido() {
        return null;
    }

    public Produto BuscarProduto(String nome) {
        return null;
    }
    
    //public void adicionarItens (Produto p, )

    public ProdutoDao getProdutoDao() {
        return produtoDao;
    }

}
