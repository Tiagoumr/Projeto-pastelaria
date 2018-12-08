package br.com.lm.Interface;

import br.com.lm.controlador.Controlador;
import br.com.lm.modelo.Pedido;
import br.com.lm.modelo.Produto;
import br.com.lm.modelo.TipoPedido;
import java.util.List;
import java.util.Scanner;

public class InterfaceAtendente {
    
    Scanner scanner = new Scanner(System.in);
    Controlador controlador = new Controlador();
    String nome;
        	
//========== MENUS ========== MENUS ========== MENUS ========== MENUS
    
    public int menu() {
        System.out.println("0. Sair");
        System.out.println("1. Gerenciar Cliente");
        System.out.println("2. Gerenciar Pedido");       
        System.out.print("Digite a opcao: ");
        return scanner.nextInt();
    }
    
   public int menuGerenciarCliente() {
        System.out.println("MENU GERENCIAR CLIENTE");
        System.out.println("");
        System.out.println("1. Cadastrar"); //ENUM
        System.out.println("2. Listar ");   //NÃO IMPLEMENTADO
        System.out.println("3. Alterar");   //NÃO IMPLEMENTADO
        System.out.println("4. Excluir");   //NÃO IMPLEMENTADO
		return scanner.nextInt();
    }
   
   public int menuGerenciarPedido() {
        System.out.println("MENU GERENCIAR PEDIDO");
        System.out.println("");
        System.out.println("1. Novo Pedido");
        System.out.println("2. Listar "); // Veremos
        System.out.println("3. Alterar"); // Não implementado
        System.out.println("4. Excluir"); // Não implementado
		return scanner.nextInt();
    }
//========== MENUS ========== MENUS ========== MENUS ========== MENUS 
//===================================================================    

//======= IMPLEMENTAÇÃO ======= IMPLEMENTAÇÃO ======= IMPLEMENTAÇÃO 

      
    public void novoPedido() {
        System.out.println("");
        System.out.println("Selecione o Tipo de Pedido: ");
        System.out.println("1. " + TipoPedido.DELIVERY.getDescricao());
        System.out.println("2. " + TipoPedido.ENCOMENDA.getDescricao());
        System.out.println("3. " + TipoPedido.BALCAO.getDescricao());
        int opcao;
        opcao = scanner.nextInt();

        do {
            switch (opcao) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("'--- NOVO PEDIDO BALCÃO ---'");
                    String tipoPedido = TipoPedido.BALCAO.getDescricao();
                    Pedido pd = controlador.getPedidoDao().criarPedido(tipoPedido);
                    while (opcao != 0) {
                        System.out.println("escolha o produto: ");
                        nome = scanner.next();
//                            Produto p = controlador.buscarProduto(nome);
//                            System.out.println(p.toString());
//                          int quantidade = scanner.nextInt();
                        controlador.incluirProduto(controlador.buscarProduto(nome));
//                          controlador.adicionarProduto(p);
                        System.out.println("");
                        System.out.println("Produto adicionado com sucesso!");
                        System.out.println("");
                        System.out.println("'--------PEDIDO BALCÃO Nº" + /*controlador.getPedidoDao().toString()*/ pd.getCodigoPedido() + "--------'");
//                            for (int i = 0; i < controlador.getPedidoDao().getProdutos().size(); i++) {
//                            for (Produto p : controlador.getPedidoDao().getProdutos()) {
//                        for (List<Produto> produtos : pd.getProdutos()) {
                            for (Produto p : pd.getProdutos()) {
                                System.out.println("|  " + p.getNome() + "                 |");
                            }
                        
                        System.out.println("Deseja adicionar mais produtos?");
                        System.out.println("0. Não");
                        System.out.println("1. Sim");
                        opcao = scanner.nextInt();
                    }

    System.out.println (
    "Informe a data");
                    int data = scanner.nextInt();

    System.out.println (
    "Método de pagamento:  ");
                    String metodoPgto = scanner.next();
    String tipoPedido = ("Balcão");

    pd  = controlador.fecharPedido(pd, data, metodoPgto, tipoPedido);

    System.out.println (controlador.imprimirPedido

    (pd));
//                    List<Produto> list = controlador.getPedidoDao().getProdutos();
//                    Pedido pd = controlador.criarPedido(data, metodoPgto, tipoPedido, list);                            
                            
    System.out.println (
    "TESTE" + controlador.getPedidoDao().getProdutos().toString());

break;                         
            }
        }   while (opcao !=0);   
    }

    
	public void gerenciarPedido() {
        
        int opcao;        
        
        do {
            opcao = menuGerenciarPedido();
            switch (opcao) {
                case 1:
                    novoPedido();
                    break;
                case 2:
                    listarPedido();
                    break;
                case 3:
                    AlterarPedido();
                    break;                         
                case 4: 
                    ExcluirPedido();                    
            }
        }   while (opcao !=0);   
    }	
    
     public void iniciar() {
        int opcao;
        do {
            opcao = menu();
            switch (opcao) {
                case 1:
                    gerenciarCliente();
                    break;
                case 2:
                    gerenciarPedido();
                    break;
            }
        } while (opcao != 0);
    }    

}