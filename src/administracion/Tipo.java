package administracion;

enum Tipo{
    ADULTO("A"),ESTUDIANTE("E"),MENOR("M");

    private String abreviatura;

    private Tipo(String i) {
        this.abreviatura = i;
    }

    public String getAbreviatura() {
        return abreviatura;
    }
}
