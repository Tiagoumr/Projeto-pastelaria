package br.com.lm.Interface;

import br.com.lm.controlador.Controlador;
import br.com.lm.modelo.Produto;
import java.util.Scanner;

public class InterfaceTexto {

    Controlador controlador = new Controlador();
    Scanner scanner = new Scanner(System.in);
    private String nomeProduto; private double precoProduto; int quantidadeProduto;
    private String nomeItem; private double qtdMinItem; private double saldoItem; private double porcaoItem;
//    InterfaceAdmin interfaceAdmin = new InterfaceAdmin();
//    InterfaceAtendente interfaceAtendente = new InterfaceAtendente();
    //int opcao;

//    public int menuUsuario() {
//        System.out.println("SISTEMA LM V1 - 2018");
//        System.out.println("");
//        System.out.println("=-=-=-=-=-=MENU PRINCIPAL=-=-=-=-=-=");
//        System.out.println("");
//        System.out.println("1. ADMINISTRADOR");
//        System.out.println("2. ATENDENTE");
//        return scanner.nextInt();
//    }
    
    public int menu() {
        System.out.println("0. Sair");
        System.out.println("1. Cadastrar Produto");
        System.out.println("2. Buscar Produto");
        System.out.println("3. Listar Produtos");
        System.out.println("4. ");
        System.out.print("Digite a opção:");
        return scanner.nextInt();
    }
    
    public void iniciar() {
        int opcao;
        do {
            opcao = menu();
            switch (opcao) {
                case 1:
                    menuCadastrarProduto();
                    controlador.adicionarProduto(controlador.getProdutoDao().criarProduto(nomeProduto, precoProduto, quantidadeProduto));
                    break;
                case 2:
                    menuBuscarProduto();
                    break;
                case 3:
                    listarProdutos();
                    break;
                case 4:
                    menuCadastrarItens();
                    //controlador.adicionarItem(controlador.getItemDao().criarItem(nomeItem,))
                    break;
                case 5:
                    //menuBuscarItens();
            }
        } while (opcao != 0);
    }
        
    private void menuCadastrarProduto() {
        System.out.println("Informe o nome do produto: ");
        System.out.println("");
        nomeProduto = scanner.next();
        System.out.println("Informe o preço do produto: ");
        precoProduto = scanner.nextDouble();
        System.out.println("Informe a quantidade do produto: ");
        quantidadeProduto = scanner.nextInt();

    }

    private void menuBuscarProduto() {
        System.out.println("Informe o nome do produto: ");
        nomeProduto = scanner.next();
        Produto p = controlador.getProdutoDao().buscarProduto(nomeProduto);
        if (p != null) {
            System.out.println("Produto encontrado: " + p.toString());
        }
    }
        
    public void listarProdutos() {
        System.out.println("Produtos disponíveis: ");
        System.out.println("");
        System.out.println(controlador.getProdutoDao().getProdutos().toString());

    }
    
    private void menuCadastrarItens() {
        System.out.println("Informe o nome do item: ");
        
        System.out.println("Informe o  ");
    }
            
//    public void iniciar() {
//        int opcao;
//         do {
//            opcao = menuUsuario();
//            switch (opcao) {
//                case 1:
//                    interfaceAdmin.menu();
//                    interfaceAdmin.menuAdmin();
//                    break;
//                case 2:
//                    interfaceAtendente.menu();
//                    break;
//            }
//        } while (opcao != 0);
//    }
    
//    public void iniciar() {
//        do {
//            menuUsuario();
//            switch (opcao){
//                case 1: menuTelaAUsuario();
//            
//        }while(opcao != 0);
//    } */



}