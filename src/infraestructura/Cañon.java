package infraestructura;

public class Cañon implements Comparable{
    private int Id;
    private static int Idsiguiente =1;
    private int potencia;
    private boolean encendido;
    private Pista pistaasignada;

    public Cañon(int potencia, Pista pistaasignada) {
        this.potencia = potencia;
        this.encendido = false;
        this.pistaasignada = pistaasignada;
        this.Id = Idsiguiente;
        Idsiguiente++;
    }

public void encender(int nieve){

        this.encendido = true;
        this.pistaasignada.setNivelnieve(nieve);

}

public void apagar(){
        this.encendido=false;
}


//Compare TO

    public int compareTo(Object cañon){
        Cañon cañon2 = (Cañon) cañon;
        if(this.potencia<cañon2.potencia){
            return 1;
        }
        else if(this.potencia>cañon2.potencia){
            return -1;
        }else{
            return 0;
        }
    }


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

    public int getId() {
        return Id;
    }

}
