import java.util.ArrayList;

public class Usuario {
    private String nome;
    private int id;
    private ArrayList <Livro> livrosEmprestados = new ArrayList<>();
    private static int sequencia = 1;

    public Usuario(String nome) {
        this.nome = nome;
        this.id = sequencia ++;
    }

    public void exibirDetalhes(){
        System.out.println("Usuário nome: " + this.nome + ", ID: " + this.id + ", Livros Emprestados: ");
        for (Livro livro: livrosEmprestados){
            livro.exibirDetalhes();
        }
    }

    public void adicionarLivro(Livro livro){
        if (livrosEmprestados.size() <= 2){
            livro.emprestar();
            livrosEmprestados.add(livro);
            System.out.println("Empréstimo realizado com sucesso!");
        }
        else {
            System.out.println("Você já tem 3 livros emprestados, não pode pegar mais.");
        }

    }

    public void removerLivro(Livro livro){
        livro.devolver();
        livrosEmprestados.remove(livro);
        System.out.println("Livro devolvido com sucesso!");
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

    public void setId() {
        this.id = sequencia ++;
    }

    public ArrayList<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados() {
        this.livrosEmprestados = new ArrayList<>();
    }
}
