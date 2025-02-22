package exemplo;

public class MainExemplo {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Marta", 33, "11/12/2000", "PIX");
        Funcionario funcionario1 = new Funcionario("José", 44, "ABC123", "Programador", 4000);

        System.out.println();
        System.out.println(cliente1.toString());
        System.out.println();
        System.out.println(funcionario1.toString());

    }
}
