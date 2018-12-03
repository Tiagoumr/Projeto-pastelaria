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
    
	public int menuGerenciarProduto() {            
        System.out.println("MENU GERENCIAR PRODUTO");
        System.out.println("");
        System.out.println("1. Cadastrar Produto"); //Não implementado
        System.out.println("2. Listar ");   
        System.out.println("3. Alterar");   //Não implementado
        System.out.println("4. Exlcuir");   //Não implementado    
		return scanner.nextInt();
    }    
    
    public int menuGerenciarEstoque() {            
        System.out.println("MENU GERENCIAR ESTOQUE");
        System.out.println("");
        System.out.println("1. Cadastrar Item"); //Não implementado
        System.out.println("2. Listar ");   
        System.out.println("3. Alterar");   
        System.out.println("4. Exlcuir");   //Não implementado
        System.out.println("Digite a opção: ");
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
    
	public void gerenciarUsuarios() {

	}

	public void gerarRelatorio() {

	}

   
	
    public void menuAdmin() {
        int opcao;

        do {
            opcao = menu();
            switch (opcao) {
                case 1:
                    //gerenciarUsuarios();
                    break;
                case 2:
                    menuGerenciarProduto();
                    break;
                case 3:
                    menuEstoque();
                    break;
                case 4:
                    //gerarRelatorio();
                    break;
            }
        } while (opcao != 0);
    }
    
    public void menuEstoque() {
        int opcao2;

        do {
            opcao2 = menuGerenciarEstoque();
            switch (opcao2) {
                case 1:
                    cadastrarItem();
                    break;
                case 2:
                    listarProduto();
                    break;
                case 3:
                    alterarItem();
                    break;
                case 4:
                    excluirItem();
                    break;
            }
        } while (opcao2 != 0);
    }


    
    public void listarProduto() {
        System.out.println("Produtos disponíveis: ");
        System.out.println("");
        
    }

    private void cadastrarItem() {
        System.out.println("\n");
        System.out.println("Informe o nome do item: ");
        String nomeItem = scanner.next();
        
    }

    private void alterarItem() {
        System.out.println("Versão ainda não suportada");
    }

    private void excluirItem() {
        System.out.println("\nVersão ainda não suportada");
    }
}
          
    
	