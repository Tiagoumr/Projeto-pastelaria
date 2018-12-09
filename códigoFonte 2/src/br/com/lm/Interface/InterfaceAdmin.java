package br.com.lm.Interface;
import br.com.lm.controlador.Controlador;
import br.com.lm.modelo.Item;
import br.com.lm.modelo.Produto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class InterfaceAdmin {
   

    Scanner scanner = new Scanner(System.in);
    Controlador controlador = new Controlador();
       
    private String nome;
    private double preco;
    private int estoque;
    private int EstoqueMin;    
//    private List<Item> i;    

//========== MENUS ========== MENUS ========== MENUS ========== MENUS
    public int menu() {
        System.out.println("");        
        System.out.println("-=-=-=-=-MENU ADMINISTRADOR-=-=-=-=-");
        System.out.println("");
        System.out.println("0. Sair");
        System.out.println("1. Gerenciar usuário [VERSÃO PREMIUM]"); //Não implementado
        System.out.println("2. Gerenciar produto");
        System.out.println("3. Gerenciar estoque");
        System.out.println("4. Gerar Relatório [VERSÃO PREMIUM]");  //Não implementado         
        System.out.println("");        
        System.out.print("Digite a opção: ");
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
        System.out.println("");        
        System.out.println("-=-=-=-MENU GERENCIAR PRODUTO-=-=-=-");
        System.out.println("");
        System.out.println("0. Sair");
        System.out.println("1. Cadastrar Produto");
        System.out.println("2. Listar ");  
        System.out.println("3. Alterar [VERSÃO PREMIUM]");   //Não implementado
        System.out.println("4. Excluir [VERSÃO PREMIUM]");   //Não implementado            
        System.out.println("");
        System.out.print("Digite a opção: ");
        return scanner.nextInt();
    }                 
    
    public int menuGerenciarEstoque() {            
        System.out.println("");        
        System.out.println("-=-=-=-MENU GERENCIAR ESTOQUE-=-=-=-" );        
        System.out.println("");
        System.out.println("0. Sair");
        System.out.println("1. Gerar Nota de Compra");        
        System.out.println("2. Baixa de Estoque");
        System.out.println("3. Mostrar Estoque ");   
//        System.out.println("3. Alterar");   
//        System.out.println("4. Exlcuir");   //Não implementado
        System.out.println("");
        System.out.print("Digite a opção: ");
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
                    System.out.println("");
                    System.out.println("-=-=-=-CADASTRAR NOVO PRODUTO-=-=-=-" );
                    System.out.println("");
                    System.out.print("Nome do produto: " );
                    nome = scanner.next();                    
                    System.out.print("Preço: " );
                    preco = scanner.nextDouble();
                    System.out.print("Estoque inicial: ");
                    estoque = scanner.nextInt();
                    System.out.println("Quantidade Mínima: ");
                    EstoqueMin = scanner.nextInt();
                    
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
                    
                    String out = controlador.cadastrarProduto(nome, preco, estoque, EstoqueMin);
                    System.out.println("");
                    System.out.println(out);
                    System.out.println("cadastrado com sucesso!");
                    System.out.println("");
                    System.out.println("Retornando ao Menu Gerenciar Produto...");
                    break;                    
                case 2:                    
                    controlador.listarProdutos();
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
                    gerarNotaCompra();
                    break;
                case 2:
                    baixaEstoque();
                    break;
                case 3:
                    mostrarEstoque();                    
                    break;
                case 4:

                    break;
            }
        } while (opcao2 != 0);
}
               
    public void baixaEstoque() {        
        mostrarEstoque();        
        System.out.println("");                
        mostrarProdutosVendidos();

//        controlador.getPedidoDao().mostarProdutos();
        System.out.println("");
        System.out.println("DESEJA REALIZAR BAIXA DE ESTOQUE?");
        System.out.println("1. Sim");
        System.out.println("2. Não");
        System.out.print("Digite a opção: ");
        int opcao = scanner.nextInt();
        
        if (opcao == 1) {
            controlador.baixarEstoque();            
            mostrarEstoque();
//            for (Produto p : controlador.buscarProdutosPedido()) {
//                for (Produto p2 : controlador.buscarProdutos()) {
//                    if (p.getNome().equals(p2.getNome())) {
//                        int quantidade = p2.getQuantidade() - p.getQuantidade();
//                        p2.setQuantidade(quantidade);
//                    }
//                }
//            }
        } else {
            System.out.println("");
            System.out.println("-FINALIZADO-");            
        }
    }
    
    public void gerarNotaCompra() {                
        mostrarEmFalta();        
        System.out.println("");        
        System.out.println("DESEJA GERAR NOTA DE COMPRA DESTES ITENS?");
        System.out.println("1. Sim");
        System.out.println("2. Não");
        System.out.println("");
        System.out.print("Digite a opção: ");
        int opcao = scanner.nextInt();
        
        if (opcao == 1) {
            System.out.println("");            
            for (Produto p : controlador.getFaltaProdutos()){
                System.out.print("Quantos pasteis de " + p.getNome() + " deseja comprar: ");
                int quantidade = scanner.nextInt();
                controlador.atualizarEstoque(p, quantidade);                
            }                          
            System.out.println("");
            
            System.out.println("------- PRODUTOS ATUALIZADOS --------");            
            for (Produto p : controlador.getFaltaProdutos()){                
                System.out.println("PRODUTO: " + p.getNome() + " ESTOQUE: " + p.getEstoque());
            }            
            controlador.atualizarEmFalta();            
        }
    }
    
    public void mostrarEstoque() {
        System.out.println("");      
        System.out.println("----------- ESTOQUE ATUAL ----------" );       
        System.out.println("");        
        for (Produto p : controlador.getProdutos()) {
            System.out.println("PRODUTO: " + p.getNome() + " ESTOQUE: " + p.getEstoque());
        }
        System.out.println("");
        System.out.println("------------------------------------");        
    }

    public void mostrarProdutosVendidos() {      
        System.out.println("");
        System.out.println("--------- PRODUTOS VENDIDOS ---------" );
        System.out.println("");
        for (Produto p: controlador.getProdutosPedido()) {
            System.out.println("PRODUTO: " + p.getNome() + " QUANTIDADE " + p.getQuantidade());                       
        }    
        System.out.println("");
        System.out.println("------------------------------------");
    }
    
    
    public void mostrarEmFalta(){
        System.out.println("");
        System.out.println("--------- PRODUTOS EM FALTA --------" );       
        System.out.println("");
        controlador.atualizarEmFalta();
        for (Produto p : controlador.getFaltaProdutos()){            
                System.out.println("PRODUTO: " + p.getNome() + " ESTOQUE: " + p.getEstoque() + " ESTOQUE MÍNIMO: " + p.getEstoqueMin());
        }        
        System.out.println("");
        System.out.println("------------------------------------");        
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
