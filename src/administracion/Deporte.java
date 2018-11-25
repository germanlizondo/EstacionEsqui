package administracion;

/**
 * enumeracion Deporte;
 * Puede ser SNOWBOARD - ESQUI - RAQUETAS
 */
enum Deporte{
    SNOWBOARD("S"),ESQUI("E"),RAQUETAS("R");

    private String abreviatura;

    /**
     * Añade la abreviatura
     * @param i
     */
    private Deporte(String i) {
        this.abreviatura = i;
    }

    /**
     * getter de abreviatura
     * @return
     */
    public String getAbreviatura() {
        return abreviatura;
    }
}
