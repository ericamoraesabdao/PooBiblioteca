import java.util.*;

public class Biblioteca {
    private ArrayList <Livro> livros = new ArrayList<>();
    private ArrayList <Usuario> usuarios = new ArrayList<>();

    public Biblioteca(ArrayList<Usuario> usuarios, ArrayList<Livro> livros) {
        this.usuarios = usuarios;
        this.livros = livros;
    }

    public void cadastrarLivro (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDigite o título do livro: ");
        String titulo1 = scanner.nextLine();

        System.out.println("\nDigite o autor do livro: ");
        String autor1 = scanner.nextLine();

        System.out.println("\nDigite o ISBN do livro: ");
        String isbn1 = (scanner.nextLine());

        boolean disponivel1 = true;

        Livro livro = new Livro(titulo1, autor1, isbn1, disponivel1);

        this.livros.add(livro);
    }

    public void cadastrarUsuario(){
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("\nDigite o nome: ");
        String nome1 = scanner2.nextLine();

        Usuario usuario1 = new Usuario(nome1);

        this.usuarios.add(usuario1);
    }

    public void realizarEmprestimo(String isbn, int idUsuario){
        for (Usuario usuario: usuarios) {
            if (usuario.getId() == idUsuario){
                for (Livro livro: livros){
                    if (Objects.equals(livro.getIsbn(), isbn)){
                        usuario.adicionarLivro(livro);
                    }
                }
            }
        }
    }

    public void realizarDevolucao(String isbn, int idUsuario){
        for (Usuario usuario: usuarios) {
            if (usuario.getId() == idUsuario){
                for (Livro livro: livros){
                    if (Objects.equals(livro.getIsbn(), isbn)){
                        usuario.removerLivro(livro);
                    }
                }
            }
        }
    }

    public void exibirLivrosDisponiveis(){
        for (Livro livro: livros){
            System.out.println("Título: " + livro.getTitulo() + ", Autor: " + livro.getAutor() + ", ISBN: " + livro.getIsbn() + ", Disponível: " + livro.getDisponivel());
            }
    }
    public void exibirListaUsuarios(){
        for (Usuario usuario: usuarios){
            System.out.println("Nome: " + usuario.getNome() + ", ID: " + usuario.getId() + ", Livros emprestados: ");
            for (Livro livro: usuario.getLivrosEmprestados()){
                livro.exibirDetalhes();
            }
        }
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(Livro livros) {
        this.livros.add(livros);
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario usuario) {
        this.usuarios.add(usuario);
    }
}