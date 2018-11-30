package br.com.lm.Interface;

import java.util.Scanner;

public class InterfaceTexto {

    Scanner scanner = new Scanner(System.in);
    InterfaceAdmin interfaceAdmin = new InterfaceAdmin();
    InterfaceAtendente interfaceAtendente = new InterfaceAtendente();

    public int menu() {
        System.out.println("SISTEMA LM V1 - 2018");
        System.out.println("");
        System.out.println("=-=-=-=-=-=MENU PRINCIPAL=-=-=-=-=-=");
        System.out.println("");
        System.out.println("1. ADMINISTRADOR");
        System.out.println("2. ATENDENTE");
        return scanner.nextInt();
    }

    public void iniciar() {
        int opcao;
        do {
            opcao = menu();
            switch (opcao) {
                case 1:
                    interfaceAdmin.menu();
                    break;
                case 2:
                    interfaceAtendente.menu();
                    break;
            }
        } while (opcao != 0);
    }

}