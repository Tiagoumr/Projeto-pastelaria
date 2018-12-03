package br.com.lm.controlador;

import br.com.lm.dao.ItemDao;
import br.com.lm.dao.ItemDaoImplement;
import br.com.lm.dao.PedidoDao;
import br.com.lm.dao.PedidoDaoImplement;
import br.com.lm.dao.ProdutoDao;
import br.com.lm.dao.ProdutoDaoImplement;
import br.com.lm.modelo.Cliente;
import br.com.lm.modelo.Item;
import br.com.lm.modelo.NotaEntrada;
import br.com.lm.modelo.Pedido;
import br.com.lm.modelo.Produto;
import java.util.List;

public class Controlador {

    private final  PedidoDao pedidoDao = new PedidoDaoImplement();
    private final ProdutoDao produtoDao = new ProdutoDaoImplement();
    private final  ItemDao itemDao = new ItemDaoImplement();
       
    private Produto produto;
    private Item item;
    private Cliente cliente;
    private NotaEntrada notaEntrada;

   
//INICIALIZAR==================================

    public void inicializarProduto(){
        produtoDao.inicializarProduto();
        System.out.println(produtoDao.getProdutos().toString());
    }    

//=============================================
    
//USUÁRIO======================================

//=============================================    

//PRODUTO======================================
    
    public void cadastrarProduto(String nome, double preco){            
       Produto p = produtoDao.criarProduto(nome, preco);       
       produtoDao.getProdutos().add(p);  
       System.out.println(produtoDao.getProdutos().toString());
    }     

    public List<Item> adicionarItem(Item p) {    
        return produtoDao.adicionarItem(p);        
    }
    
    public Produto buscarProduto(String nome) {
        return produtoDao.buscarProduto(nome);        
    }    
    
    public void listarProduto(){
         System.out.println(produtoDao.getProdutos());
    }

    public ProdutoDao getProdutoDao() {
        return produtoDao;
    }
//=============================================

//ESTOQUE (ITEM) ============================== 
    
//    public void listarItens() {
//        System.out.println(itemDao.getItens().toString());
//        
//     }
    
//    public void selecionarItens() {
//    
//    produtoDao.getItens().add(p);
//    }
//    
//    public Item buscarItem(String nome) {
//        return itemDao.buscarItem(nome);
//    }
//    
//     public List<Item> adicionarItemLista(Item p) {
//        
//    }
        
//=============================================    
    
//PEDIDO==========================================    
    //public void adicionarItens (Produto p, )
    public Pedido criarPedido (int data, String metodoPgto, String tipoPedido, List<Produto> produtos) {
        Pedido p;
        p = new Pedido(data, metodoPgto, tipoPedido, produtos);
        return p;
    }
     
    public Pedido novoProdutoPedido() {
        return null;
    }
    public PedidoDao getPedidoDao() {
        return pedidoDao;
    }
        
        public void adicionarProduto (Produto p) {        
        this.pedidoDao.getProdutos().add(p);
        
    }
//=================================================   
  
          
    
}
