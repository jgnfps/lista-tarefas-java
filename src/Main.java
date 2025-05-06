import ListTarefa.ListaTarefas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n1 - Adicionar tarefa");
            System.out.println("2 - Remover tarefa");
            System.out.println("3 - Listar tarefas");
            System.out.println("4 - Ver número total de tarefas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a descrição da tarefa: ");
                    String descAdd = scanner.nextLine();
                    listaTarefas.adicionarTarefa(descAdd);
                    break;
                case 2:
                    System.out.print("Digite a descrição da tarefa a remover: ");
                    String descRemover = scanner.nextLine();
                    listaTarefas.removerTarefa(descRemover);
                    break;
                case 3:
                    listaTarefas.obterDescricoesTarefas();
                    break;
                case 4:
                    System.out.println("Total de tarefas: " + listaTarefas.obterNumeroTotalTarefas());
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}


