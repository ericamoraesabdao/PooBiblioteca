import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        Livro moreninha = new Livro("A moreninha", "Joaquim Manuel Macedo", "123432098432", true);
        Livro ubirajara = new Livro("Ubirajara", "José de Alencar", "123432098434", true);

        moreninha.exibirDetalhes();
        ubirajara.exibirDetalhes();

        moreninha.emprestar();

        moreninha.exibirDetalhes();

        moreninha.devolver();
        moreninha.exibirDetalhes();
    }
}