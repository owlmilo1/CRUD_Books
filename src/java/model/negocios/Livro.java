package model.negocios;

public class Livro {

    int id;
    String nomeLivro;
    String autor;
    String edicao;
    String editora;
    int anoPublicacao;
    String assunto;

    public Livro(int id, String nomeLivro, String autor, String edicao, String editora, int anoPublicacao, String assunto) {
        this.id = id;
        this.nomeLivro = nomeLivro;
        this.autor = autor;
        this.edicao = edicao;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.assunto = assunto;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getAutor() {
        return autor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }
}
