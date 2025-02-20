package pets;

public class MainPet {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Marta", "32", 
            new Pet("Totó", "4", "Pitbull"));

        System.out.println(cliente1.toString());
    }
}
