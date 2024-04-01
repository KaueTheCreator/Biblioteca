import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Criando um livro
        Livro livro = new Livro("AMOR", "Autor", "Romance", "Editora", "2020", "1st", "200");

        // Criando um usuário
        Usuario usuario = new Usuario("Michelle", "Feminino", 25, 123456789);

        // Criando um empréstimo com o livro e o usuário criados
        Emprestimo emprestimo = new Emprestimo(new Date(), "13:00", livro, usuario);

        // Realizando algumas operações com o empréstimo
        System.out.println("----EMPRESTIMO");
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Usuário: " + usuario.getNome());
        System.out.println("Data: " + emprestimo.getDataEmprestimoFormatada());

        emprestimo.lerLivro(); // Simulando que o usuário está lendo o livro
        emprestimo.abrirLivro(); // Abrindo o livro
        emprestimo.fecharLivro(); // Fechando o livro
        emprestimo.devolverLivro(); // Devolvendo o livro
    }
}
