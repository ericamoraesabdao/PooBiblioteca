import java.util.ArrayList;

public class Usuario {
//Métodos:
//● exibirDetalhes(): Exibe as informações do usuário.
//
//● adicionarLivro(Livro livro): Adiciona um livro à lista de livros emprestados.
//● removerLivro(Livro livro): Remove um livro da lista de livros emprestados.
    private String nome;
    private int id;
    private ArrayList <String> livrosEmprestados = new ArrayList<>();

    public Usuario(String nome, int id) {
        this.nome = nome;
        this.id = id;
   //     this.livrosEmprestados = livrosEmprestados;
    }

    public void exibirDetalhes(){
        System.out.println("Usuário nome: " + this.nome + ", ID: " + this.id + ", Livros Emprestados: " + this.livrosEmprestados);
    }

    public void adicionarLivro(Livro livro){
        livro.emprestar();
        String titulo = livro.getTitulo();
        livrosEmprestados.add(titulo);
    }

    public void removerLivro(Livro livro){
        livro.devolver();
        String titulo = livro.getTitulo();
        livrosEmprestados.remove(titulo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<String> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(Livro livro) {
        this.livrosEmprestados = new ArrayList<>();
    }
}
