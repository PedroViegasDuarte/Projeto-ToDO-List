package ucb.aplicativo.view;

import java.util.Scanner;
import java.util.List;

import ucb.aplicativo.control.TarefaServico;
import ucb.aplicativo.model.Tarefas;

public class AppToDoList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TarefaServico tarefa = new TarefaServico();

        int opcao;
        do {
            System.out.println("+================================+");
            System.out.println("|           TO DO LIST           |");
            System.out.println("+================================+");
            System.out.println("1. Criar uma Tarefa");
            System.out.println("2. Exibir Tarefas");
            System.out.println("3. Atualizar Tarefas");
            System.out.println("4. Concluir Tarefas");
            System.out.println("5. Pesquisar");
            System.out.println("6. Deletar Tarefas");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao)
            {
                case 1 ->
                {
                    System.out.print("Digite o título da tarefa: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite a descrição da tarefa: ");
                    String descricao = scanner.nextLine();
                    tarefa.criarTarefa(titulo, descricao);

                    System.out.println("\n---------------------------------");
                    System.out.println("  Tarefa criada com sucesso!");
                    System.out.println("---------------------------------\n");
                }
                case 2 ->
                {
                    List<Tarefas> tarefas = tarefa.listaTarefas();

                    if (tarefas.isEmpty()) {
                        System.out.println("\n---------------------------------");
                        System.out.println(" Nenhuma tarefa encontrada!");
                        System.out.println("---------------------------------\n");
                    } else {
                        System.out.println("\n+================================+");
                        System.out.println("|        LISTA DE TAREFAS        |");
                        System.out.println("+================================+");

                        int index = 1;
                        for (Tarefas t : tarefas) {
                            String status = t.isCompleta() ? " Concluída" : " Pendente";
                            System.out.println(index++ + ") " + t.getTitulo());
                            System.out.println("   Descrição: " + t.getDescricao());
                            System.out.println("   Status: " + status);
                            System.out.println("---------------------------------");
                        }
                        System.out.println();
                    }
                }
                case 3 ->
                {
                    System.out.print("Digite o título da tarefa a ser atualizada: ");
                    String tituloAtualizar = scanner.nextLine();
                    System.out.print("Digite a nova descrição da tarefa: ");
                    String descricaoAtualizar = scanner.nextLine();
                    tarefa.atualizarTarefa(tituloAtualizar, descricaoAtualizar);

                    System.out.println("\n---------------------------------");
                    System.out.println(" Tarefa atualizada com sucesso!");
                    System.out.println("---------------------------------\n");
                }
                case 4 -> {
                    System.out.print("Digite o título da tarefa a ser concluída: ");
                    String tituloConcluir = scanner.nextLine();
                    tarefa.concluirTarefa(tituloConcluir);

                    System.out.println("\n---------------------------------");
                    System.out.println(" Tarefa concluída com sucesso!");
                    System.out.println("---------------------------------\n");
                }

                case 5 ->
                {

                }

                case 6 ->
                {
                    System.out.println();
                }
                case 7 ->
                {
                    System.out.println("Saindo...");
                }
                default -> System.out.println("Opção inválida");
            }

        } while (opcao != 7);

    }
}
