package br.com.lm.Interface;

import br.com.lm.controlador.Controlador;
import br.com.lm.dao.ProdutoDao;
import br.com.lm.dao.ProdutoDaoImplement;
import br.com.lm.modelo.Produto;
import java.util.Scanner;

public class InterfaceTexto {

    final Controlador controlador = new Controlador();
    Scanner scanner = new Scanner(System.in);
    private String nomeProduto;
    private double precoProduto;    
    private int quantidadeProduto;
    final InterfaceAdmin interfaceAdmin = new InterfaceAdmin();
    final InterfaceAtendente interfaceAtendente = new InterfaceAtendente();
   
    public int menuUsuario() {
        System.out.println("SISTEMA LM V1 - 2018");
        System.out.println("");
        System.out.println("=-=-=-=-=-=MENU PRINCIPAL=-=-=-=-=-=");
        System.out.println("");
        System.out.println("0. SAIR");
        System.out.println("1. ADMINISTRADOR");
        System.out.println("2. ATENDENTE");
        System.out.println("");
        System.out.print("Digite a opção: ");
        return scanner.nextInt();
    }
    
    /*public int menu() {
        System.out.println("0. Sair");
        System.out.println("1. Cadastrar Produto");
        System.out.println("2. Buscar Produto");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.print("Digite a opção:");
        return scanner.nextInt();
    }*/
    
//        public void iniciar() {
//        int opcao;
//        do {
//            opcao = menu();
//            switch (opcao) {
//                case 1:
//                    menuCadastrarProduto();
//                    controlador.adicionarProduto(controlador.getProdutoDao().criarProduto(nomeProduto, precoProduto, quantidadeProduto));
//                    break;
//                case 2:
//                    menuBuscarProduto(); 
//                    break;
//                case 3:
                    //menuCadastrarAnimal();
                    //controlador.adicionarAnimal(controlador.getAnimalDao().criarAnimal(nomeAnimal, idadeAnimal, especieAnimal), controlador.getResponsavelDao().buscarResponsavel(nomeResponsavel));
//                    break;
//            }
//        } while (opcao != 0);
//    }
        
//        private void menuCadastrarProduto() {
//           System.out.println("Informe o nome do produto: ");
//           nomeProduto = scanner.next();
//           System.out.println("Informe o preço do produto: ");
//           precoProduto = scanner.nextDouble();
//           System.out.println("Informe a quantidade do produto: ");
//           quantidadeProduto = scanner.nextInt();
//           
//           }
        
//        private void menuBuscarProduto() {
//            System.out.println("Informe o nome do produto: ");
//            nomeProduto = scanner.next();
//            Produto p = controlador.getProdutoDao().buscarProduto(nomeProduto);
//            if (p != null) {
//                System.out.println("Produto encontrado: " + p.toString());
//            }
//        }
            
    public void iniciar() {
        int opcao;        
        
        controlador.inicializarProduto();      

         do {
            opcao = menuUsuario();
            switch (opcao) {
                case 1:
                    interfaceAdmin.iniciar();
                    break;
                case 2:
                    interfaceAtendente.iniciar();
                    break;
            }
        } while (opcao != 0);
    }
     
//    public void iniciar() {
//        do {
//            menuUsuario();
//            switch (opcao){
//                case 1: menuTelaAUsuario();
//            
//        }while(opcao != 0);
//    } 

}