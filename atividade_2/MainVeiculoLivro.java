package atividade_2;

public class MainVeiculoLivro {
    public static void main(String[] args) {
        Livro livro = new Livro("A Cabana", "Seu José", 300, 55.50, "4654");
        Cliente cliente  = new Cliente("Marta", "22", "6546546", "Rua A", "56465465");

        System.out.println("Dados do livro: ");
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());

        System.out.println("\nDados do cliente: ");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());


    }
}
