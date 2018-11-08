package infraestructura;

import administracion.Persona;

import java.util.ArrayList;

public class Telesilla {
    private int largo;
    private int velocidad;
    private int capacidad;
    private int consumo;
    private boolean encendido;

    private ArrayList<Persona> personasabordo = new ArrayList<Persona>();

    public Telesilla(int largo, int velocidad, int capacidad, int consumo) {
        this.largo = largo;
        this.velocidad = velocidad;
        this.capacidad = capacidad;
        this.consumo = consumo;
        this.encendido = false;
    }


  public void arrancar_parar(){
        if (this.encendido == false) this.encendido = true;
        else this.encendido = false;
  }

    public void aumentarVelocidad(int v){
        this.velocidad = this.velocidad+v;
        if (this.velocidad < 0) this.encendido = false;

    }

  public void disminuirVelocidad(int v){
        this.velocidad = this.velocidad-v;
      if (this.velocidad < 0) this.encendido = false;

  }

public void descargarPersonas(){
        this.personasabordo = new ArrayList<Persona>();
}

    @Override
    public String toString() {
        return "Telesilla{" +
                "largo=" + largo +
                ", velocidad=" + velocidad +
                ", capacidad=" + capacidad +
                ", consumo=" + consumo +
                ", encendido=" + encendido +
                '}';
    }


//GETTERS && SETTERS


    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public ArrayList<Persona> getPersonasabordo() {
        return personasabordo;
    }

    public void setPersonasabordo(Persona persona) {

        if (this.personasabordo.size() >= this.capacidad) System.out.println("!infraestructura.Telesilla lleno!");
        else this.personasabordo.add(persona);

    }

}
