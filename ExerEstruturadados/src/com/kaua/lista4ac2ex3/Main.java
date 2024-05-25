package com.kaua.lista4ac2ex3;

	import java.util.Scanner;

	public class Main {
	    public static void main(String[] args) {
	        Empresa empresa = new Empresa();
	        Scanner scanner = new Scanner(System.in);
	        int opcao;

	        do {
	            System.out.println("Escolha uma opção:");
	            System.out.println("1. Inserir um novo funcionário no início da lista");
	            System.out.println("2. Inserir um novo funcionário no final da lista");
	            System.out.println("3. Remover um funcionário pelo seu nome");
	            System.out.println("4. Exibir todos os funcionários");
	            System.out.println("5. Atualizar o salário de um funcionário pelo seu nome");
	            System.out.println("6. Verificar se um determinado funcionário faz parte da lista");
	            System.out.println("0. Sair");
	            opcao = scanner.nextInt();
	            scanner.nextLine();

	            switch (opcao) {
	                case 1:
	                    System.out.println("Digite o nome do funcionário: ");
	                    String nomeInicio = scanner.nextLine();
	                    System.out.println("Digite o cargo do funcionário: ");
	                    String cargoInicio = scanner.nextLine();
	                    System.out.println("Digite o salário do funcionário: ");
	                    double salarioInicio = scanner.nextDouble();
	                    scanner.nextLine();
	                    empresa.inserirNoInicio(new Funcionario(nomeInicio, cargoInicio, salarioInicio));
	                    break;
	                case 2:
	                    System.out.println("Digite o nome do funcionário: ");
	                    String nomeFim = scanner.nextLine();
	                    System.out.println("Digite o cargo do funcionário: ");
	                    String cargoFim = scanner.nextLine();
	                    System.out.println("Digite o salário do funcionário: ");
	                    double salarioFim = scanner.nextDouble();
	                    scanner.nextLine();
	                    empresa.inserirNoFim(new Funcionario(nomeFim, cargoFim, salarioFim));
	                    break;
	                case 3:
	                    System.out.println("Digite o nome do funcionário a ser removido: ");
	                    String nomeRemover = scanner.nextLine();
	                    empresa.removerPorNome(nomeRemover);
	                    break;
	                case 4:
	                    empresa.exibirFuncionarios();
	                    break;
	                case 5:
	                    System.out.println("Digite o nome do funcionário: ");
	                    String nomeAtualizar = scanner.nextLine();
	                    System.out.println("Digite o novo salário do funcionário: ");
	                    double novoSalario = scanner.nextDouble();
	                    scanner.nextLine();
	                    empresa.atualizarSalario(nomeAtualizar, novoSalario);
	                    break;
	                case 6:
	                    System.out.println("Digite o nome do funcionário: ");
	                    String nomeVerificar = scanner.nextLine();
	                    if (empresa.verificarFuncionario(nomeVerificar)) {
	                        System.out.println("Funcionário " + nomeVerificar + " está na lista.");
	                    } else {
	                        System.out.println("Funcionário " + nomeVerificar + " não está na lista.");
	                    }
	                    break;
	                case 0:
	                    System.out.println("Saindo...");
	                    break;
	                default:
	                    System.out.println("Opção inválida. Tente novamente!");
	            }
	        } while (opcao != 0);
	        
	        scanner.close();
	    }
	}