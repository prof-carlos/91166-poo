package roupas;

public class Calca extends Produto {

    public Calca(String marca, String cor, String tamanho, double preco) {
        super(marca, cor, tamanho, preco);
    }

    @Override
    public String toString() {
        return "Calca: " + super.toString();
    }

}
