import java.util.ArrayList;

public class Biblioteca {
    //Atributos:
    //● livros (ArrayList&lt;Livro&gt;): Lista de livros disponíveis na biblioteca.
    //● usuarios (ArrayList&lt;Usuario&gt;): Lista de usuários cadastrados.
    //Métodos:
    //● cadastrarLivro(Livro livro): Adiciona um livro à lista de livros.
    //● cadastrarUsuario(Usuario usuario): Adiciona um usuário à lista de usuários.
    //● realizarEmprestimo(String isbn, int idUsuario): Realiza o empréstimo de um livro
    //para um usuário.
    //● realizarDevolucao(String isbn, int idUsuario): Realiza a devolução de um livro por um
    //usuário.
    //● exibirLivrosDisponiveis(): Exibe todos os livros disponíveis para empréstimo.

    private ArrayList <Livro> livros = new ArrayList<>();
    private ArrayList <Usuario> usuarios = new ArrayList<>();

    public Biblioteca(ArrayList<Usuario> usuarios, ArrayList<Livro> livros) {
        this.usuarios = usuarios;
        this.livros = livros;
    }

    public void cadastrarLivro (Livro livro){

    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
