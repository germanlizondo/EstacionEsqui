package administracion;

/**
 * Enumeración Tipò de forfait
 */
enum Tipo{
    ADULTO("A"),ESTUDIANTE("E"),MENOR("M");

    private String abreviatura;

    /**
     * asigna la abreviatura
     * @param i
     */
    private Tipo(String i) {
        this.abreviatura = i;
    }

    /**
     * getter de la abreviatura
     * @return
     */
    public String getAbreviatura() {
        return abreviatura;
    }
}
