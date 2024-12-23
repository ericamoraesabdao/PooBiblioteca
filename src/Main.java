import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {

        Livro moreninha = new Livro("A moreninha", "Joaquim Manuel Macedo", "123432098432", true);
        Livro ubirajara = new Livro("Ubirajara", "José de Alencar", "123432098434", true);

        Usuario joao = new Usuario("João Silva");
        Usuario maria = new Usuario("Maria de Jesus");

        Biblioteca biblioteca = new Biblioteca(new ArrayList<>(), new ArrayList<>());

       biblioteca.setLivros(moreninha);
       biblioteca.setLivros(ubirajara);

        biblioteca.setUsuarios(joao);
        biblioteca.setUsuarios(maria);

        biblioteca.exibirListaUsuarios();
        biblioteca.exibirLivrosDisponiveis();

        biblioteca.cadastrarUsuario();
        biblioteca.exibirListaUsuarios();

        biblioteca.cadastrarLivro();
        biblioteca.exibirLivrosDisponiveis();

        biblioteca.realizarEmprestimo("123432098434", 2);
        biblioteca.exibirListaUsuarios();
        biblioteca.exibirLivrosDisponiveis();

        biblioteca.realizarDevolucao("123432098434", 2);
        biblioteca.exibirListaUsuarios();
        biblioteca.exibirLivrosDisponiveis();
    }
}

