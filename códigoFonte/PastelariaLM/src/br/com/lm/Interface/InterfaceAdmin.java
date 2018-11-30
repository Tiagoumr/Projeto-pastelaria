package br.com.lm.Interface;
import br.com.lm.controlador.Controlador;
import java.util.Scanner;


public class InterfaceAdmin {

    Scanner scanner = new Scanner(System.in);
    Controlador controlador = new Controlador();

//    
    public int menu() {
        System.out.println("0. Sair");
        System.out.println("1. Gerenciar usuário");
        System.out.println("2. Gerenciar produto");
        System.out.println("3. Gerenciar estoque");
//        System.out.println("4. Gerar Relatório");
        System.out.print("Digite a opcao: ");
        return scanner.nextInt();
    }
    
	public int menuGerenciarUsuario() {
        System.out.println("MENU GERENCIAR USUÁRIO");
        System.out.println("");
        System.out.println("1. Cadastrar");
        System.out.println("2. Listar ");
        System.out.println("3. Alterar");
        System.out.println("4. Exlcuir");       
		return scanner.nextInt();
    }
    
	public int menuGerenciarProduto() {            
        System.out.println("MENU GERENCIAR PRODUTO");
        System.out.println("");
        System.out.println("1. Cadastrar");
        System.out.println("2. Listar ");
        System.out.println("3. Alterar");
        System.out.println("4. Exlcuir");       
		return scanner.nextInt();
    }    
    
    public int menuGerenciarEstoque() {            
        System.out.println("MENU GERENCIAR ESTOQUE");
        System.out.println("");
        System.out.println("1. Cadastrar");
        System.out.println("2. Listar ");
        System.out.println("3. Alterar");
        System.out.println("4. Exlcuir");       
		return scanner.nextInt();
    }
    
    public int menuGerarRelatório() {            
        System.out.println("MENU GERAR RELATÓRIO");
        System.out.println("");
        System.out.println("1. Vendas");
        System.out.println("2. Produção");
        System.out.println("3. Contábil");      
		return scanner.nextInt();
    }
	public menuBuscarResponsavel() {
		System.out.println("Informe o nome do responsavel:");
		nomeResponsavel = scanner.next();
		Responsavel r =
				controlador.getResponsavelDao().buscarResponsavel(nomeResponsavel);
		return r;
	}
	public Especie menuEspecies() {
		System.out.println("Lista de especies:");
		int opcao;
		//mostra lista de especies
		for (Especie e : Especie.values()) {
			System.out.println(e.ordinal() + " - " + e.name());
		}
		System.out.println("Escolha uma opcao de especie:");
		opcao = scanner.nextInt();
		//busca qual a especie selecionada
		for (Especie e : Especie.values()) {
			if (e.ordinal() == opcao) {
				return e; //retorna a especie selecionada
			}
		}
		return null;
	}
	public void menuCadastrarAnimal() {
		System.out.println("Informe o nome do animal:");
		nomeAnimal = scanner.next();
		Especie e = menuEspecies();
		Animal a = controlador.criarAnimal(nomeAnimal, e);
		Responsavel r = menuBuscarResponsavel();
		if (r == null) {
			r =
					controlador.getResponsavelDao().criarResponsavel(nomeResponsavel);
			controlador.adicionarResponsavel(r);
		}
		r.getAnimais().add(a);
	}
	public void iniciar() {
		int opcao;
		do {
			opcao = menu();
			switch (opcao) {
			case 1:
				menuCadastrarResponsavel();
				controlador.adicionarResponsavel(controlador.getResponsavelD
						ao().criarResponsavel(nomeResponsavel));
				break;
			case 2:
				Responsavel r = menuBuscarResponsavel();
				if (r != null) {
					System.out.println("Responsavel encontrado: " +
							r.toString());
				} else {
					System.out.println("Responsavel inexistente.");
				}
				break;
			case 3:
				menuCadastrarAnimal();
				break;
			}
		} while (opcao != 0);
	}
          
    
	public void gerenciarProduto() {
        
	}

	public void gerenciarEstoque() {

	}

	public void gerenciarUsuarios() {

	}

	public void gerarRelatorio() {

	}

}
