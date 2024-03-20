package menu;

import java.util.Scanner;

import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao; 
		
		while (true) {
			
			System.out.println("*****************************************************");
			System.out.println("*                                                   *");
			System.out.println("*               AUTO PECAS DOUGLAS PNT              *");  
			System.out.println("*             Sistema de pagamento a prazo          *");
			System.out.println("*                                                   *");
			System.out.println("*****************************************************");
			System.out.println("*                                                   *");
			System.out.println("*           1 - Cadastar Cliente                    *");
			System.out.println("*           2 - Gerenciar todas os Clientes         *");
			System.out.println("*           3 - Buscar clientes por Numero          *");
			System.out.println("*           4 - Corrigir cadastros                  *");
			System.out.println("*           5 - Deletar Contas                      *");
			System.out.println("*           6 - Realizou pagamento                  *");
			System.out.println("*           7 - Realizar vendar                     *");
			System.out.println("*           8 - Realizar estorno de venda           *");
			System.out.println("*           9 - Sair                                *");
			System.out.println("*                                                   *");
			System.out.println("*****************************************************");
			System.out.println("          Entre com a opção desejada:                ");
			System.out.println("                                                     " + Cores.TEXT_RESET);

			opcao = leia.nextInt();
			
			if (opcao == 9) {
				System.out.println("\nAUTO PECAS DOUGLAS PNT - O seu Futuro começa aqui!");
				sobre();
                 leia.close();
				System.exit(0);
			}
			
			switch(opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE +"Cadastar Cliente \n\n");
				
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE +"Gerenciar todas os Cliente \n\n");
				break;
				
			case 3:
				System.out.println(Cores.TEXT_WHITE +"Buscar clientes por Numero \n\n");
				break;
			
			case 4:
				System.out.println(Cores.TEXT_WHITE +"Corrigir meu cadastro \n\n");
				break;
				
			case 5:
				System.out.println(Cores.TEXT_WHITE +"Deletar Conta \n\n");
				break;
				
			case 6:
				System.out.println(Cores.TEXT_WHITE +"Realizou pagamento \n\n");
				break;
				
			case 7:
				System.out.println(Cores.TEXT_WHITE +"Realizar vendar \n\n");
				break;
				
			case 8:
				System.out.println(Cores.TEXT_WHITE +"Realizar estorno de venda \n\n");
				break;
				
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n"+ Cores.TEXT_RESET);
				break;
				
			}
			
		}
			
			
			
			}
			
			
			
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: @odouglaspnt ");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("https://github.com/douglaspnt/conta.git");
		System.out.println("*********************************************************");
	}

			


	}

