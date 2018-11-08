package infraestructura;

public class Cañon {
    private int potencia;
    private boolean encendido;
    private Pista pistaasignada;

    public Cañon(int potencia, Pista pistaasignada) {
        this.potencia = potencia;
        this.encendido = false;
        this.pistaasignada = pistaasignada;
    }

public void encender(int nieve){

        this.encendido = true;
        this.pistaasignada.setNivelnieve(nieve);

}

public void apagar(){
        this.encendido=false;
}


    @Override
    public String toString() {
        return "Cañon{" +
                "potencia=" + potencia +
                ", encendido=" + encendido +
                ", pistaasignada=" + pistaasignada +
                '}';
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
