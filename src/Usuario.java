import java.util.ArrayList;

public class Usuario {
//Métodos:
//● exibirDetalhes(): Exibe as informações do usuário.
//
//● adicionarLivro(Livro livro): Adiciona um livro à lista de livros emprestados.
//● removerLivro(Livro livro): Remove um livro da lista de livros emprestados.
    private String nome;
    private int id;
    private ArrayList <String> livrosEmprestados;

    public Usuario(String nome, int id, ArrayList<String> livrosEmprestados) {
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = livrosEmprestados;
    }

    public void exibirDetalhes(String nome, int id, ArrayList<String> livrosEmprestados){
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = livrosEmprestados;
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

    public void setLivrosEmprestados(ArrayList<String> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }
}
