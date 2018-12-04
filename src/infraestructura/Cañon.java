package infraestructura;

/**
 * Class Cañon implementa Comparable
 * para ordenar los cañones
 */
public class Cañon implements Comparable{
    private int Id;
    private static int Idsiguiente =1;
    private int potencia;
    private boolean encendido;
    private Pista pistaasignada;

    /**
     * Constructor de cañon
     * @param potencia
     * @param pistaasignada
     */
    public Cañon(int potencia, Pista pistaasignada) {
        this.potencia = potencia;
        this.encendido = false;
        this.pistaasignada = pistaasignada;
        this.Id = Idsiguiente;
        Idsiguiente++;
    }

    /**
     * Encinde cañon, recibe el nivel de nieve
     * para lenar la pista que tiene asignada
     * @param nieve
     */
    public void encender(int nieve){

        this.encendido = true;
        this.pistaasignada.setNivelnieve(nieve);

}

    /**
     * apaga cañon
     */
    public void apagar(){
        this.encendido=false;
}


//Compare TO

    /**
     * Compara To
     * Ordena por potencia de menor a mayor
     * @param cañon
     * @return
     */
    public int compareTo(Object cañon){
        Cañon cañon2 = (Cañon) cañon;
        if(this.potencia<cañon2.potencia){
            return -1;
        }
        else if(this.potencia>cañon2.potencia){
            return 1;
        }else{
            return 0;
        }
    }

    /**
     * Override de tostring
     * @return
     */
    @Override
    public String toString() {
        return "Cañon{" +
                "ID : "+Id+
                ", potencia= " + potencia +
                ", encendido= " + encendido +
                ", pistaasignada= " + pistaasignada.getName() +", Nivel de nive= " + pistaasignada.getNivelnieve() +
                '}';
    }

    //GETTERS && SETTERS

    /**
     * Getter Potencia
     * @return
     */
    public int getPotencia() {
        return potencia;
    }

    /**
     * setter Potencia
     * @param potencia
     */
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    /**
     * devuleve el estado del cañon
     * @return
     */
    public boolean isEncendido() {
        return encendido;
    }

    /**
     * cambia el estado
     * @param encendido
     */
    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    /**
     * getter de pista
     * @return
     */
    public Pista getPistaasignada() {
        return pistaasignada;
    }

    /**
     * setter de pista
     * @param pistaasignada
     */
    public void setPistaasignada(Pista pistaasignada) {
        this.pistaasignada = pistaasignada;
    }

    /**
     * getter de id
     * @return
     */
    public int getId() {
        return Id;
    }

}
