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
                    String titulo = scanner.next();
                    System.out.println("Digite o descricao da tarefa: ");
                    String descricao = scanner.next();
                    tarefa.criarTarefa(titulo, descricao);
                    System.out.println("Tarefa criada com sucesso: " + tarefa.getTitulo());

                    break;
                case 2:
                    List<Tarefas> tarefas = servico.listaTarefas();

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                default:
                    System.out.println("Opção inválida");

                    break;
            }


        } while (opcao != 7);

    }
}
