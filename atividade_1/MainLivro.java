import java.util.Scanner;

public class MainLivro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o título do livro: ");
        String titulo = teclado.next();

        System.out.println("Digite o nomme do autor: ");
        String autor = teclado.next();

        Livro livro1 = new Livro(titulo, autor, 300, 11.50, "45465-54");

        System.out.println("Título: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Número de páginas: " + livro1.getNumeroDePaginas());
        System.out.println("Preço: " + livro1.getPreco());
    }
}
