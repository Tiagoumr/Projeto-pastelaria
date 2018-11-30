package br.com.lm.Interface;
import br.com.lm.controlador.Controlador;
import java.util.Scanner;


public class InterfaceAdmin {

    Scanner scanner = new Scanner(System.in);
    Controlador controlador = new Controlador();

//========== MENUS ========== MENUS ========== MENUS ========== MENUS
    public int menu() {
        System.out.println("0. Sair");
        System.out.println("1. Gerenciar usuário"); //Não implementado
        System.out.println("2. Gerenciar produto");
        System.out.println("3. Gerenciar estoque");
        System.out.println("4. Gerar Relatório");  //Não implementado 
        System.out.print("Digite a opcao: ");
        return scanner.nextInt();
    }
    
/*	public int GerenciarUsuario() {
        System.out.println("MENU GERENCIAR USUÁRIO");
        System.out.println("");
        System.out.println("1. Cadastrar");
        System.out.println("2. Listar ");
        System.out.println("3. Alterar");
        System.out.println("4. Exlcuir");       
		return scanner.nextInt();
    } */
    
	public int gerenciarProduto() {            
        System.out.println("MENU GERENCIAR PRODUTO");
        System.out.println("");
        System.out.println("1. Cadastrar Produto"); //Não implementado
        System.out.println("2. Listar ");   
        System.out.println("3. Alterar");   //Não implementado
        System.out.println("4. Exlcuir");   //Não implementado    
		return scanner.nextInt();
    }    
    
    public int gerenciarEstoque() {            
        System.out.println("MENU GERENCIAR ESTOQUE");
        System.out.println("");
        System.out.println("1. Cadastrar Item"); //Não implementado
        System.out.println("2. Listar ");   
        System.out.println("3. Alterar");   
        System.out.println("4. Exlcuir");   //Não implementado
		return scanner.nextInt();
    }
    
/*  public int gerarRelatório() {            
        System.out.println("MENU GERAR RELATÓRIO");
        System.out.println("");
        System.out.println("1. Vendas");
        System.out.println("2. Produção");
        System.out.println("3. Contábil");      
		return scanner.nextInt();
    }
*/
//========== MENUS ========== MENUS ========== MENUS ========== MENUS 
//===================================================================    

//======= IMPLEMENTAÇÃO ======= IMPLEMENTAÇÃO ======= IMPLEMENTAÇÃO 
    
    public void ListarProduto() {
        System.out.println("Produtos disponíveis: ");
        System.out.println("");
        
	}

	public void gerenciarEstoque() {

	}

	public void gerenciarUsuarios() {

	}

	public void gerarRelatorio() {

	}

}

    
	
		int opcao;
		do {
			opcao = menu();
			switch (opcao) {
			case 1:
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			}
		} while (opcao != 0);
	}
          
    
	