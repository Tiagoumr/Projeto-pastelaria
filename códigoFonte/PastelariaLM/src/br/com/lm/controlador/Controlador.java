package br.com.lm.controlador;

import br.com.lm.dao.ProdutoDao;
import br.com.lm.modelo.Pedido;
import br.com.lm.modelo.Produto;

public class Controlador {
    
    private PedidoDao PedidoDao = new ProdutoDaoImplement();

    
    public void ConsumirItem() {

    }
	public void adicionarProduto(Produto r){
		this.responsavelDao.getResponsaveis().add(r);
	}
	public ResponsavelDao getResponsavelDao() {
		return responsavelDao;
	}
	public void setResponsavelDao(ResponsavelDao responsavelDao) {
		this.responsavelDao = responsavelDao;
    
    
	private ProdutoDao produtoDao;

	public Pedido criarPedido() {
		return null;
	}

	public Pedido novoProdutoPedido() {
		return null;
	}

	public Produto BuscarProduto() {
		return null;
	}

}
