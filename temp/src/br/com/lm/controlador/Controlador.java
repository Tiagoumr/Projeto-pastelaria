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

    private PedidoDao pedidoDao = new PedidoDaoImplement();
    private ProdutoDao produtoDao = new ProdutoDaoImplement();
    private ItemDao itemDao = new ItemDaoImplement();
       
    private Produto produto;
    private Item item;
    private Cliente cliente;
    private NotaEntrada notaEntrada;

   
//INICIALIZAR==================================

    public void inicializarProduto(){
        produtoDao.inicializarProduto();
        System.out.println(produtoDao);
        System.out.println(produtoDao.getProdutos().toString());
    }    

//=============================================
    
//USUÁRIO======================================

//=============================================    

//PRODUTO======================================
    
    public void cadastrarProduto(String nome, double preco){            
       Produto p = produtoDao.criarProduto(nome, preco);       
       produtoDao.adicionarProduto(p);
       
       //varificação
       System.out.println(produtoDao.getProdutos().toString());
    }     

//    public List<Item> adicionarItem(Item p) {    
//        return produtoDao.adicionarItem(p);        
//    }
    
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
    
//    public Pedido criarPedido (int data, String metodoPgto, String tipoPedido, List<Produto> produtos) {
//        Pedido p;
//        p = new Pedido(data, metodoPgto, tipoPedido, produtos);
//        return p;
//    }
     
//    public Pedido criarPedido(int data, String metodoPgto, String tipoPedido, List<Produto> list){     
//        return pedidoDao.criarPedido(data, metodoPgto, tipoPedido, list);
//    }
    
    public Pedido criarPedido(String tipoPedido){
     return pedidoDao.criarPedido(tipoPedido);   
    }
    
    public void incluirProduto(Produto p) {
//        p.setQuantidade(quantidade);
//        p.setNome("teste");
        pedidoDao.getProdutos().add(p);
    }
    
    public Pedido fecharPedido(Pedido pd, int data, String metodoPgto, String tipoPedido) {        
        double valorTotal = 0;
        for (Produto produtos: pedidoDao.getProdutos()){
            valorTotal = valorTotal + produtos.getQuantidade() * produtos.getPreco();
        }
        pd.setData(data);
        pd.setMetodoPgto(metodoPgto);
        pd.setTipoPedido(tipoPedido);        
        pd.setValorTotal(valorTotal);
        return pd;                
    }
    
    public String imprimirPedido(Pedido pd){
        return pd.toString();
    }
    

    public PedidoDao getPedidoDao() {
        return pedidoDao;
    }
        
        public void Produto (Produto p) {                     
             this.pedidoDao.getProdutos().add(p);                
    }
//=================================================   
  
          
    
}
