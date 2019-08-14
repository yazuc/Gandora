import java.util.Scanner;

public class Principal {
  public static void main(String args[]){
	  int opcao=0;
	  Scanner entrada = new Scanner(System.in);
	  Cofre meuPorquinho = new Cofre(25);
	  
	  do{		  
		  System.out.println("Escolha uma das opcoes:");
		  System.out.println("  1 - Inserir Moedas");
		  System.out.println("  2 - Avaliar Cofre");
		  System.out.println("  0 - Sair do programa");
		  System.out.print("Digite sua opção");
		  
		  opcao = entrada.nextInt();
		  entrada.nextLine();
		  if(opcao<=0) break;
		  
		  switch(opcao){
			  case 1:
				System.out.println("Informe a moeda a ser inserida:");
				System.out.println("  1 - Inserir R$ 1,00");
				System.out.println("  2 - Inserir R$ 0,50");
				System.out.println("  3 - Inserir R$ 0,25");
				System.out.println("  4 - Inserir R$ 0,10");
				System.out.println("  5 - Inserir R$ 0,05");
				System.out.println("  6 - Inserir R$ 0,01");
				System.out.print("Digite sua opção");

				opcao = entrada.nextInt();
				entrada.nextLine();

				switch(opcao){
					case 1: 
						meuPorquinho.insereMoeda(new Moeda(NomeMoeda.UmReal));
						break;
					case 2: 
						meuPorquinho.insereMoeda(new Moeda(NomeMoeda.CinquentaCentavos));
						break;
					case 3: 
						meuPorquinho.insereMoeda(new Moeda(NomeMoeda.VinteCincoCentavos));
						break;
					case 4: 
						meuPorquinho.insereMoeda(new Moeda(NomeMoeda.DezCentavos));
						break;
					case 5: 
						meuPorquinho.insereMoeda(new Moeda(NomeMoeda.CincoCentavos));
						break;
					case 6: 
						meuPorquinho.insereMoeda(new Moeda(NomeMoeda.UmCentavo));
						break;
					default: 
						opcao=1;
						System.out.println("Opcao inválida");
				}
				break;
			  case 2:
				System.out.println("Informe a operacao:");
				System.out.println("  1 - Qual a qtde de moedas no cofrinho");
				System.out.println("  2 - Qual a qtde de moedas por tipo");
				System.out.println("  3 - Qual o valor disponivel em centavos");
				System.out.println("  4 - Qual o valor disponivel em Reais");
				System.out.print("Digite sua opção");
				
				opcao = entrada.nextInt();
				entrada.nextLine();

				switch(opcao){
					case 1:
						System.out.println("O cofre possui "+ meuPorquinho.qtdMoedas() + " moedas");
						break;
					case 2:
						System.out.println("O cofre possui "+ meuPorquinho.qtdMoedas(new Moeda(NomeMoeda.UmReal)) + " moedas de 1 Real");
						System.out.println("O cofre possui "+ meuPorquinho.qtdMoedas(new Moeda(NomeMoeda.CinquentaCentavos)) + " moedas de 50 Centavos");
						System.out.println("O cofre possui "+ meuPorquinho.qtdMoedas(new Moeda(NomeMoeda.VinteCincoCentavos)) + " moedas de 25 Centavos");
						System.out.println("O cofre possui "+ meuPorquinho.qtdMoedas(new Moeda(NomeMoeda.DezCentavos)) + " moedas de 10 Centavos");
						System.out.println("O cofre possui "+ meuPorquinho.qtdMoedas(new Moeda(NomeMoeda.CincoCentavos)) + " moedas de 5 Centavos");
						System.out.println("O cofre possui "+ meuPorquinho.qtdMoedas(new Moeda(NomeMoeda.UmCentavo)) + " moedas de 1 Centavo");
						break;
					case 3:
						System.out.println("O cofre possui "+ meuPorquinho.totalCentavos() + " Centavos");
						break;
					case 4:
						System.out.println("O cofre possui "+ meuPorquinho.totalReais() + " Reais");
						break;
					default:
						opcao=1;
						System.out.println("Opcao inválida");					   
				}				
				break;
			  default:
		  }		  
	  }while(opcao>0);
	  
	  System.out.println("Fim de execução do programa");
	  
  }

}