package enum_sexo;

public enum Sexo {
    MASCULINO("Masculino"),
    RECURSOS_HUMANOS("Recursos Humanos"),
    TRANS("Trans"),
    FEMININO("Feminino");

    private String texto;

    private Sexo(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
