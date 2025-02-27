package atividade_2;

public class MainProduto {
    public static void main(String[] args) {
        Processador processador1 = new Processador("AMD", "Ryzen", 3.5);
        PlacaMae placaMae1 = new PlacaMae("AMD", "XVM", "EEE");
        
        System.out.println(processador1.toString());
        System.out.println(placaMae1.toString());
    }
}
