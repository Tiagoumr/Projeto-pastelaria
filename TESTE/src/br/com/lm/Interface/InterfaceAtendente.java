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
        	
//========================================================    
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
        System.out.println("4. Exlcuir");   //NÃO IMPLEMENTADO
		return scanner.nextInt();
    }
   
   public int menuGerenciarPedido() {
        System.out.println("MENU GERENCIAR PEDIDO");
        System.out.println("");
        System.out.println("1. Novo Pedido");
        System.out.println("2. Listar "); // Veremos
        System.out.println("3. Alterar"); // Não implementado
        System.out.println("4. Exlcuir"); // Não implementado
		return scanner.nextInt();
    }
//========================================================      

      
	public void novoPedido (){
        System.out.println("Tipo de Pedido: ");
        System.out.println("1. " + TipoPedido.DELIVERY);
        System.out.println("2. " + TipoPedido.ENCOMENDA);
        System.out.println("3. " + TipoPedido.BALCAO);
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
                    
                    System.out.println("escolha o produto: ");
                    String nome = scanner.next();
                    
                    Produto p = controlador.buscarProduto(nome);
                    controlador.adicionarProduto(p);
                    System.out.println(p.toString());
                    
                    
                    System.out.println("Informe a data");
                    int data = scanner.nextInt();
                    System.out.println("Digite o metodo de pagamento:  ");
                    String metodoPgto = scanner.next();
                    String tipoPedido = ("Balcao");
                    List<Produto> list = controlador.getPedidoDao().getProdutos();
                    
                    Pedido pd = controlador.criarPedido(data, metodoPgto, tipoPedido, list);
                    
                    System.out.println(controlador.getPedidoDao().getProdutos().toString());
                    break;                         
            }
        }   while (opcao !=0);   
    }

    
	public void gerenciarPedido() {
        System.out.println("1. Novo pedido");
        System.out.println("2. Fechar");
        int opcao = scanner.nextInt();
        
        do {
           switch (opcao) {
                case 1:
                    novoPedido();
                    break;
                case 2:
                    fecharPedido();
                    break;
                case 3:                     
                    break;                         
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