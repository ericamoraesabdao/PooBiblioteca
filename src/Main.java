import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        Livro moreninha = new Livro("A moreninha", "Joaquim Manuel Macedo", "123432098432", true);
        Livro ubirajara = new Livro("Ubirajara", "José de Alencar", "123432098434", true);

        System.out.println("Testando método exibirDetalhes da classe livro");
        moreninha.exibirDetalhes();
        ubirajara.exibirDetalhes();

        System.out.println("Testando o método emprestar da classe Livro");
        moreninha.emprestar();

        moreninha.exibirDetalhes();

        System.out.println("Testando o método devolver da classe Livro");
        moreninha.devolver();
        moreninha.exibirDetalhes();

        Usuario joao = new Usuario("João Silva", 1);

        System.out.println("Testando o método exibirDetalhes da classe Usuário");
        joao.exibirDetalhes();

        System.out.println("Testando o método adicionarLivro da classe Usuário");
        joao.adicionarLivro(ubirajara);
        joao.adicionarLivro(moreninha);


        joao.exibirDetalhes();
        ubirajara.exibirDetalhes();
        moreninha.exibirDetalhes();

        System.out.println("Testando o método removerLivro da classe Usuário");
        joao.removerLivro(ubirajara);

        joao.exibirDetalhes();
        ubirajara.exibirDetalhes();
        moreninha.exibirDetalhes();
    }
}