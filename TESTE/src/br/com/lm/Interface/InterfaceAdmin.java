package br.com.lm.Interface;
import br.com.lm.controlador.Controlador;
import br.com.lm.modelo.Item;
import java.util.List;
import java.util.Scanner;


public class InterfaceAdmin {

    Scanner scanner = new Scanner(System.in);
    Controlador controlador = new Controlador();
       
    private String nome;
    private double preco;
    private List<Item> i;    

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
        System.out.println("1. Cadastrar Produto");
        System.out.println("2. Listar ");   //Não implementado
        System.out.println("3. Alterar");   //Não implementado
        System.out.println("4. Excluir");   //Não implementado    
		return scanner.nextInt();
    }    
    
    public int menuGerenciarEstoque() {            
        System.out.println("MENU GERENCIAR ESTOQUE");
        System.out.println("");
        System.out.println("1. GERAR NOTA DE COMPRA");
        System.out.println("2. MOSTRAR ESTOQUE ");   
//        System.out.println("3. Alterar");   
//        System.out.println("4. Exlcuir");   //Não implementado
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
    
    public void gerenciarProduto(){
        int opcao;
        do {
            opcao = menuGerenciarProduto();
            switch (opcao){
                case 1:
                    System.out.println("CADASTRAR NOVO PRODUTO" );
                    System.out.print("Nome do produto: " );
                    nome = scanner.next();                    
                    System.out.println("Preço " );
                    preco = scanner.nextDouble();
//                    System.out.println("Quais itens o produto vai ter?");
//                    System.out.println(controlador.listarItens());                    
                                                  
//                String opcao2;
//                do {
//                    System.out.println("digite o nome do item ou 'Fim' para finalizar");
//                    opcao2 = scanner.next();
//                    if (opcao2.equals("Fim")) {
//                        return;
//                    }   else { 
//                        nome = opcao2;
//                        Item p = controlador.buscarItem(nome);                        
//                        System.out.println(p.toString());
//                        i = controlador.adicionarItem(p);
//                    }
////                    System.out.println(i.toString());
//                }while (opcao2.equals("Fim"));   
                    
                    controlador.cadastrarProduto(nome, preco);
                    System.out.println("Produto cadastrado!");
                    break;
                case 2:
                    
                    controlador.listarProduto();
                    //produtodao
                    break;
                case 3:
                    //controlador.alterarProduto();
                    break;
                case 4:
                    //controlador.excluirProduto();
                    break;
            }
        } while (opcao != 0);   
    }
    
    public void gerenciarEstoque() {
        int opcao2;
        do {
            opcao2 = menuGerenciarEstoque();
            switch (opcao2){
                case 1:
                    //controlador.cadastrarItem();
                    break;
                case 2:
                    //controlador.listarItens();
                    break;
                case 3:
                    //controlador.alterarItem();
                    break;
                case 4:
                    //controlador.excluirItem();
                    break;
            }
        } while (opcao2 != 0);
}
        
     public void gerarRelatorio() {

	}    
//    public void listarProduto() {
//        System.out.println("Produtos disponíveis: ");
//        System.out.println("");        
//    }
//
//    private void cadastrarItem() {
//        System.out.println("\n");
//        System.out.println("Informe o nome do item: ");
//        String nomeItem = scanner.next();
//        
//    }
//
//    private void alterarItem() {
//        System.out.println("Versão ainda não suportada");
//    }
//
//    private void excluirItem() {
//        System.out.println("\nVersão ainda não suportada");
//    }
         	
    public void iniciar() {
        int opcao;
        do {
            opcao = menu();
            switch (opcao) {
                case 1:
                    gerenciarUsuarios();
                    break;
                case 2:
                    gerenciarProduto();
                    break;
                case 3:
                    gerenciarEstoque();
                    break;
                case 4:
                    //gerarRelatorio();
                    break;
            }
        } while (opcao != 0);
    }    
}
    
	