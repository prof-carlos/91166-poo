package atividade_3;

public class Processador extends Produto {

    public Processador(String marca, String modelo, double frequencia) {
        super(marca, modelo, frequencia);
    }

    @Override
    public String toString() {
        return "Processador " + super.toStringMarcaModeloFrequencia();
    }
    
}
