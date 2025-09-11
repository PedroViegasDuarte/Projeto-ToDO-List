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

            switch (opcao) {
                case 1:
                    System.out.println("Digite o titulo da tarefa: ");
                    String titulo = scanner.nextLine();
                    System.out.println("Digite o descricao da tarefa: ");
                    String descricao = scanner.nextLine();
                    tarefa.criarTarefa(titulo, descricao);
                    System.out.println("Tarefa criada com sucesso");

                    break;
                case 2:
                    List<Tarefas> tarefas = tarefa.listaTarefas();
                    System.out.println("Lista de Tarefas:");
                    for (Tarefas t : tarefas) {
                        String status = t.isCompleta() ? "Concluida" : "Pendente";
                        System.out.println("- " + t.getTitulo() + ": " + t.getDescricao() + " ---> " + status);
                    }
                    break;
                case 3:
                    System.out.println("Atualizar Tarefas");
                    System.out.println("Digite o titulo da tarefa a ser atualizada: ");
                    String tituloAtualizar = scanner.nextLine();
                    System.out.println("Digite a nova descrição da tarefa: ");
                    String descricaoAtualizar = scanner.nextLine();
                    tarefa.atualizarTarefa(tituloAtualizar, descricaoAtualizar);
                    System.out.println("Tarefa atualizada com sucesso");
                    break;
                case 4:
                    System.out.println("Concluir Tarefas");
                    System.out.println("Digite o titulo da tarefa a ser concluida: ");
                    String tituloConcluir = scanner.nextLine();
                    tarefa.concluirTarefa(tituloConcluir);
                    System.out.println("Tarefa concluida com sucesso");
                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                default:
                    System.out.println("Opção invaqlida");

                    break;
            }


        } while (opcao != 7);

    }
}
