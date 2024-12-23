import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Escolha esc = new Escolha();


        boolean val = false;

        while (val == false) { // Enquanto "val"for "false" o while vai ficar fazendo loop, mas quando se tornar "true" ele vai parar
            int opc = esc.menu();
            val = esc.escolher(opc);
        }
    }

    static class Escolha {
        Biblioteca biblioteca = new Biblioteca(new ArrayList<>(), new ArrayList<>());

        public boolean escolher(int menu) {

            switch (menu) {
                case 1:
                    biblioteca.cadastrarLivro();
                    return false;
                case 2:
                    biblioteca.cadastrarUsuario();
                    return false;
                case 3:
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Digite o ISBN do livro desejado: ");
                    String isbn = scanner2.nextLine();

                    Scanner scanner3 = new Scanner(System.in);
                    System.out.println("Digite o ID do Usuário desejado: ");
                    int idUsuario = Integer.parseInt(scanner3.nextLine());

                    biblioteca.realizarEmprestimo(isbn, idUsuario);
                    return false;
                case 4:
                    Scanner scanner4 = new Scanner(System.in);
                    System.out.println("Digite o ISBN do livro desejado: ");
                    String isbn2 = scanner4.nextLine();

                    Scanner scanner5 = new Scanner(System.in);
                    System.out.println("Digite o ID do usuário desejado: ");
                    int idUsuario2 = Integer.parseInt(scanner5.nextLine());

                    biblioteca.realizarDevolucao(isbn2, idUsuario2);
                    return false;
                case 5:
                    biblioteca.exibirLivrosDisponiveis();
                    return false;
                case 6:
                    return true;
                default:
                    System.out.println("Por favor digite uma opção válida.");
                    return false;
            }
        }


        public int menu() {
            int menu;

            Scanner scanner = new Scanner(System.in);

            System.out.println("Bem-vindo ao Sistema de Gerenciamento de Biblioteca!" +
                    "\nEscolha uma opção:" +
                    "\n1. Cadastrar livro" +
                    "\n2. Cadastrar usuário" +
                    "\n3. Realizar empréstimo" +
                    "\n4. Realizar devolução" +
                    "\n5. Exibir livros disponíveis" +
                    " \n6. Sair");
            menu = Integer.parseInt(scanner.nextLine());

            return menu;
        }
    }
}

