package atividadeArquivos;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArquivosMenu  {

	    private static Map<Integer, Funcionario> funcionarios = new HashMap<>();
	    private static Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int opcao;

	        do {
	            exibirMenu();
	            opcao = scanner.nextInt();
	            scanner.nextLine();

	            switch (opcao) {
	                case 1:
	                    adicionarFuncionario();
	                    break;
	                case 2:
	                    visualizarFuncionario();
	                    break;
	                case 3:
	                    alterarFuncionario();
	                    break;
	                case 4:
	                    System.out.println("Saindo da aplicação...");
	                    break;
	                default:
	                    System.out.println("Opção inválida!");
	            }
	        } while (opcao != 4);
	    }

	    private static void exibirMenu() {
	        System.out.println("\nMenu:");
	        System.out.println("1 - Adicionar funcionário");
	        System.out.println("2 - Visualizar funcionário");
	        System.out.println("3 - Alterar funcionário");
	        System.out.println("4 - Sair");
	        System.out.print("Digite sua opção: ");
	    }

	    private static void adicionarFuncionario() {
	        System.out.print("ID: ");
	        int id = scanner.nextInt();
	        scanner.nextLine(); 

	        System.out.print("Nome: ");
	        String nome = scanner.nextLine();

	        System.out.print("Salário: ");
	        double salario = scanner.nextDouble();
	        scanner.nextLine();

	        funcionarios.put(id, new Funcionario(id, nome, salario));
	        System.out.println("Funcionário adicionado com sucesso!");
	    }

	    private static void visualizarFuncionario() {
	        System.out.print("ID do funcionário: ");
	        int id = scanner.nextInt();
	        scanner.nextLine(); 
	        Funcionario funcionario = funcionarios.get(id);
	        if (funcionario != null) {
	            System.out.println(funcionario);
	        } else {
	            System.out.println("Funcionário não encontrado!");
	        }
	    }

	    private static void alterarFuncionario() {
	        System.out.print("ID do funcionário: ");
	        int id = scanner.nextInt();
	        scanner.nextLine();
	        
	        Funcionario funcionario = funcionarios.get(id);
	        if (funcionario != null) {
	            System.out.print("Novo nome: ");
	            String novoNome = scanner.nextLine();

	            System.out.print("Novo salário: ");
	            double novoSalario = scanner.nextDouble();
	            scanner.nextLine();

	            funcionario.setNome(novoNome);
	            funcionario.setSalario(novoSalario);
	            System.out.println("Funcionário alterado com sucesso!");
	        } else {
	            System.out.println("Funcionário não encontrado!");
	        }
	    }
	}