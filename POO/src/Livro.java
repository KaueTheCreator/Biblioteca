public class Livro {
    private boolean emprestimo;
    private String titulo, autores, area, editora, ano, edicao, numfolha;

    public Livro(String titulo, String autores, String area,
                 String editora, String ano, String edicao, String numfolha) {
        this.titulo = titulo;
        this.autores = autores;
        this.area = area;
        this.editora = editora;
        this.ano = ano;
        this.edicao = edicao;
        this.numfolha = numfolha;
        this.emprestimo = false; // Inicialmente, o livro não está emprestado
    }

    public void abrirLivro() {
        System.out.println("LIVRO ESTÁ ABERTO PARA LEITURA");
    }

    public void fecharLivro() {
        System.out.println("LIVRO ESTÁ FECHADO PARA LEITURA");
    }

    public boolean isEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(boolean emprestimo) {
        this.emprestimo = emprestimo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getNumfolha() {
        return numfolha;
    }

    public void setNumfolha(String numfolha) {
        this.numfolha = numfolha;
    }

    
}