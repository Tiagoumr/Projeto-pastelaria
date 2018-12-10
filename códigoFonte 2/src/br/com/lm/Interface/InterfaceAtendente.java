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
        System.out.println("");
        System.out.println("-=-=-=-=-=-MENU ATENDENTE-=-=-=-=-=-");
        System.out.println("");
        System.out.println("0. Sair");
        System.out.println("1. Gerenciar Cliente [VERSÃO PREMIUM]");
        System.out.println("2. Gerenciar Pedido");       
        System.out.println("");
        System.out.print("Digite a opcao: ");
        return scanner.nextInt();
    }
    
   public int menuGerenciarCliente() {
        System.out.println("MENU GERENCIAR CLIENTE");
        System.out.println("");
        System.out.println("0. Sair");
        System.out.println("1. Cadastrar [VERSÃO PREMIUM]"); //NÃO IMPLEMENTADO
        System.out.println("2. Listar [VERSÃO PREMIUM]");   //NÃO IMPLEMENTADO
        System.out.println("3. Alterar [VERSÃO PREMIUM]");   //NÃO IMPLEMENTADO
        System.out.println("4. Excluir [VERSÃO PREMIUM]");   //NÃO IMPLEMENTADO
		return scanner.nextInt();
    }
   
    public int menuGerenciarPedido() {
        System.out.println("");         
        System.out.println("-=-=-=-MENU GERENCIAR PEDIDO-=-=-=-");        
        System.out.println("");
        System.out.println("0. Sair");
        System.out.println("1. Novo Pedido");
        System.out.println("2. Listar [VERSÃO PREMIUM]"); // Veremos
        System.out.println("3. Alterar [VERSÃO PREMIUM]"); // Não implementado
        System.out.println("4. Excluir [VERSÃO PREMIUM]"); // Não implementado
        System.out.println("");
        System.out.print("Digite a opção: ");
        return scanner.nextInt();
    }
//========== MENUS ========== MENUS ========== MENUS ========== MENUS 
//===================================================================    

//======= IMPLEMENTAÇÃO ======= IMPLEMENTAÇÃO ======= IMPLEMENTAÇÃO 

      
        public void gerenciarCliente(){
            
        }
    
	public void novoPedido (){
            Pedido pd = controlador.criarPedido();
            
            System.out.println("");
            System.out.println("-=-=-=-=-PEDIDO Nº " + pd.getCodigoPedido() + "-=-=-=-=-");
            System.out.println("" );
            System.out.println("Selecione o Tipo de Pedido: ");
            System.out.println("1. " + TipoPedido.DELIVERY + "[VERSÃO PREMIUM]"); 
            System.out.println("2. " + TipoPedido.ENCOMENDA + "[VERSÃO PREMIUM]");
            System.out.println("3. " + TipoPedido.BALCAO);
            System.out.println("");
            System.out.print("Digite a opção: ");
            int opcao;
            opcao = scanner.nextInt();

//        Pedido pd = new Pedido();
        
        
        do {
           switch (opcao) {
                case 1:                    
                    break;
                case 2:
                    break;
                case 3:                     
                    while (opcao != 0) {
                        System.out.println("");
                        System.out.println("PRODUTOS DISPONÍVEIS: ");
                        controlador.listarNomeProdutos();
                        System.out.println("");
                        System.out.print("Digite o nome do produto: ");
                        nome = scanner.next();
                        Produto p = controlador.buscarProduto(nome);
                        p = new Produto(p);
//                        p.setNome("teste");
//                        controlador.listarProduto(); //teste
//                        System.out.println("p.toString " + p.toString()); //teste
                        System.out.print("Quantidade: ");
                        int quantidade = scanner.nextInt();
                        pd = controlador.incluirProduto(pd, p, quantidade);
//                        controlador.listarProdutoPedido();
                        System.out.println("");
                        System.out.println("produto incluso");
//                      controlador.adicionarProduto(p);
                        System.out.println("");
                        System.out.println("0. Fechar");
                        System.out.println("1. Adicionar novo produto");
                        System.out.println("");
                        System.out.print("Digite a opcao: ");
                        opcao = scanner.nextInt();
                    }                    
                    
                    System.out.println("");
                    System.out.println("CONCLUINDO PEDIDO...");
                    System.out.println("");
                    System.out.print("Informe a data: ");
                    int data = scanner.nextInt();                    
                    System.out.print("Método de pagamento:  ");
                    String metodoPgto = scanner.next();
                    String tipoPedido = ("Balcão");
                    
                    pd = controlador.fecharPedido(pd, data, metodoPgto, tipoPedido);
                    System.out.println("");
                    System.out.println("IMPRIMINDO PEDIDO...");
                    System.out.println("");
//                    System.out.println(controlador.imprimirPedido(pd));
                    controlador.imprimirPedido(pd);
//                    List<Produto> list = controlador.getPedidoDao().getProdutos();
//                    Pedido pd = controlador.criarPedido(data, metodoPgto, tipoPedido, list);                            
                            
//                    System.out.println("TESTE" + controlador.getPedidoDao().getProdutos().toString());
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
                    //listarPedido();
                    //listarProduto();
                    break;
                case 3:
                    //AlterarPedido();
                    break;                         
                case 4: 
                    //ExcluirPedido();                    
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