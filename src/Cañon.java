public class Cañon {
    private int potencia;
    private boolean encendido;
    private Pista pistaasignada;

    public Cañon(int potencia, boolean encendido, Pista pistaasignada) {
        this.potencia = potencia;
        this.encendido = encendido;
        this.pistaasignada = pistaasignada;
    }

public void encender(int nieve){

        this.encendido = true;
        this.pistaasignada.setNivelnieve(nieve);

}

public void apagar(){
        this.encendido=false;
}


    //GETTERS && SETTERS
    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public Pista getPistaasignada() {
        return pistaasignada;
    }

    public void setPistaasignada(Pista pistaasignada) {
        this.pistaasignada = pistaasignada;
    }
}
