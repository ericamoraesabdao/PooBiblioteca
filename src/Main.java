import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {

        Livro moreninha = new Livro("A moreninha", "Joaquim Manuel Macedo", "123432098432", true);
        Livro ubirajara = new Livro("Ubirajara", "José de Alencar", "123432098434", true);
        Livro casmurro = new Livro("Dom Casmurro", "Machado de Assis", "123432098436", true);
        Livro helena = new Livro("Helena", "Machado de Assis", "123432098439", true);

        Usuario joao = new Usuario("João Silva");
        Usuario maria = new Usuario("Maria de Jesus");

        Biblioteca biblioteca = new Biblioteca(new ArrayList<>(), new ArrayList<>());

       biblioteca.setLivros(moreninha);
       biblioteca.setLivros(ubirajara);
       biblioteca.setLivros(casmurro);
       biblioteca.setLivros(helena);

        biblioteca.setUsuarios(joao);
        biblioteca.setUsuarios(maria);

        biblioteca.exibirListaUsuarios();
        biblioteca.exibirLivrosDisponiveis();


        biblioteca.realizarEmprestimo("123432098432", 1);
        biblioteca.realizarEmprestimo("123432098434", 1);
        biblioteca.realizarEmprestimo("123432098436", 1);
        biblioteca.realizarEmprestimo("123432098439", 1);


        biblioteca.exibirListaUsuarios();
        biblioteca.exibirLivrosDisponiveis();

        biblioteca.realizarDevolucao("123432098432", 1);
        biblioteca.realizarDevolucao("123432098436", 1);

        biblioteca.exibirListaUsuarios();
        biblioteca.exibirLivrosDisponiveis();


    }
}

