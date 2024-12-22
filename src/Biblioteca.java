import java.util.*;

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

    public void cadastrarLivro (){
        Scanner scanner = new Scanner(System.in);
        this.livros = new ArrayList<Livro>();

            System.out.println("\nDigite o título do livro: ");
            String titulo1 = scanner.nextLine();

            System.out.println("\nDigite o autor do livro: ");
            String autor1 = scanner.nextLine();

            System.out.println("\nDigite o ISBN do livro: ");
            String isbn1 = (scanner.nextLine());

            Boolean disponivel1 = true;


            Livro livro = new Livro(titulo1, autor1, isbn1, disponivel1);
            livro.exibirDetalhes();

            livros.add(new Livro(livro.getTitulo(), livro.getAutor(), livro.getIsbn(), livro.getDisponivel()));
            livros.add(livro);

            exibirLivrosDisponiveis();
    }

    public void cadastrarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    public void realizarEmprestimo(String isbn, int idUsuario){

    }

    public void realizarDevolucao(String isbn, int idUsuario){

    }

    public void exibirLivrosDisponiveis(){
        for(Livro j : getLivros()){
            for (Livro s: livros)
                System.out.println(s);
        }


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
