package roupas;

public class Sapato extends Produto {

    public Sapato(String marca, String cor, String tamanho, double preco) {
        super(marca, cor, tamanho, preco);
    }

    @Override
    public String toString() {
        return "Sapato: " + super.toString();
    }

    

}
