package administracion;


enum Deporte{
    SNOWBOARD("S"),ESQUI("E"),RAQUETAS("R");

    private String abreviatura;

    private Deporte(String i) {
        this.abreviatura = i;
    }

    public String getAbreviatura() {
        return abreviatura;
    }
}
