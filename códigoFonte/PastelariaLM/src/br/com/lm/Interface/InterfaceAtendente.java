package br.com.lm.Interface;

import br.com.lm.controlador.Controlador;
import br.com.lm.modelo.TipoPedido;
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
        System.out.println("1. Delivery");
        System.out.println("2. Encomenda");
        System.out.println("3. Balcão");
        
        opcao scanner.nextInt();
	}

	public void gerenciarPedido() {

	}

}