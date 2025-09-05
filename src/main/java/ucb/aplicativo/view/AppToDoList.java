package ucb.aplicativo.view;

import java.util.Scanner;

public class AppToDoList {
    public static void main(String[] args) {

        executar();

    }
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {

            System.out.println("+================================+");
            System.out.println("|           TO DO LIST           |");
            System.out.println("+================================+");
            System.out.println("1. Cadastrar uma Tarefa");
            System.out.println("2. Exibir Tarefas");
            System.out.println("3. Atualizar Tarefas");
            System.out.println("4. Concluir Tarefas");
            System.out.println("5. Deletar Tarefas");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Você selecionou Cadastrar");

                    break;
                case 2:
                    System.out.println("Exbindo Tarefas");


                    break;
                case 3:
                    System.out.println("Atualizar Tarefas");


                    break;
                case 4:
                    System.out.println("COncluindo Tarefas");


                    break;
                case 5:
                    System.out.println("Deletando Tarefas");
                    break;
                case 6:
                    System.out.println("Saindo......");
                    break;
                default:
                    System.out.println("Opção inválida! Escolha uma opção válida.");


                    break;
            }


        } while (opcao != 6);

    }
}
