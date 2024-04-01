import java.text.SimpleDateFormat;
import java.util.Date;

public class Emprestimo {
    private Date dataEmprestimo;
    private String horaEmprestimo;
    private Livro livro;
    private Usuario usuario;
    private boolean emprestado;

    public Emprestimo(Date dataEmprestimo, String horaEmprestimo, Livro livro, Usuario usuario) {
        this.dataEmprestimo = dataEmprestimo;
        this.horaEmprestimo = horaEmprestimo;
        this.livro = livro;
        this.usuario = usuario;
        this.emprestado = true; // Inicialmente, o livro está emprestado
    }

    public void devolverLivro() {
        if (emprestado) {
            livro.setEmprestimo(false); // Marcando o livro como devolvido
            System.out.println("LIVRO DEVOLVIDO");
        } else {
            System.out.println("O livro já foi devolvido anteriormente!");
        }
    }

    // Método para obter a data de empréstimo formatada
    public String getDataEmprestimoFormatada() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(dataEmprestimo);
    }

    // Acessando o método de leitura do usuário
    public void lerLivro() {
        usuario.lerLivro();
    }

    // Acessando o método de abrir o livro
    public void abrirLivro() {
        livro.abrirLivro();
    }

    // Acessando o método de fechar o livro
    public void fecharLivro() {
        livro.fecharLivro();
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getHoraEmprestimo() {
        return horaEmprestimo;
    }

    public void setHoraEmprestimo(String horaEmprestimo) {
        this.horaEmprestimo = horaEmprestimo;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    

}
