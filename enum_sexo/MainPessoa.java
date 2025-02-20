package enum_sexo;

public class MainPessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Marta", Sexo.FEMININO, Estado.BAHIA);

        System.out.println(pessoa1.toString());
    }
}
