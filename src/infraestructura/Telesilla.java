package infraestructura;

import administracion.Persona;

import java.util.ArrayList;

/**
 * Class Telesilla
 */
public class Telesilla {
    private int Id;
    private static int Idsiguiente = 1;
    private int largo;
    private int velocidad;
    private int capacidad;
    private int consumo;
    private boolean encendido;

    private ArrayList<Persona> personasabordo = new ArrayList<Persona>();

    /**
     * Constructor Telesilla
     * @param largo
     * @param velocidad
     * @param capacidad
     * @param consumo
     */
    public Telesilla(int largo, int velocidad, int capacidad, int consumo) {
        this.largo = largo;
        this.velocidad = velocidad;
        this.capacidad = capacidad;
        this.consumo = consumo;
        this.encendido = false;
        this.Id = Idsiguiente;
        Idsiguiente++;

    }

    /**
     * Metodo que detecta el estado del telesilla
     * y lo enciende o lo apaga
     * depende de su estado
     */
  public void arrancar_parar(){
        if (this.encendido == false) this.encendido = true;
        else this.encendido = false;
  }

    /**
     * augmenta la velocidad
     * @param v
     */
    public void aumentarVelocidad(int v){
        this.velocidad = this.velocidad+v;
        if (this.velocidad < 0) this.encendido = false;

    }

    /**
     * disminuye la velocidad
     * @param v
     */
  public void disminuirVelocidad(int v){
        this.velocidad = this.velocidad-v;
      if (this.velocidad < 0) this.encendido = false;

  }

    /**
     * descarga las personas
     */

public void descargarPersonas(){
        this.personasabordo = new ArrayList<Persona>();
}

    /**
     * Overrode de To String
     * @return
     */
    @Override
    public String toString() {
        return "Telesilla{" +
                "Id = "+Id+
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                ", capacidad=" + capacidad +
                ", consumo=" + consumo +
                ", encendido=" + encendido +
                '}';
    }


//GETTERS && SETTERS

    /**
     * getter de largo
     * @return
     */

    public int getLargo() {
        return largo;
    }

    /**
     * setter de largo
     * @param largo
     */
    public void setLargo(int largo) {
        this.largo = largo;
    }

    /**
     * getter de velocidad
     * @return
     */
    public int getVelocidad() {
        return velocidad;
    }

    /**
     * setter de velocidad
     * @param velocidad
     */
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    /**
     * getter de capacidad
     * @return
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * setter de capacidad
     * @param capacidad
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * getter de consumo
     * @return
     */
    public int getConsumo() {
        return consumo;
    }

    /**
     * setter de consumo
     * @param consumo
     */
    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    /**
     * detecta el estado del telesilla
     * @return
     */
    public boolean isEncendido() {
        return encendido;
    }

    /**
     * cambia el estado del telesilla
     * @param encendido
     */
    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    /**
     * retorna las personas que lleva
     * @return
     */
    public ArrayList<Persona> getPersonasabordo() {
        return personasabordo;
    }

    /**
     * retorna id
     * @return
     */
    public int getId() {
        return Id;
    }

    /**
     * añade personas
     * @param persona
     */
    public void setPersonasabordo(Persona persona) {

        if (this.personasabordo.size() >= this.capacidad) System.out.println("!infraestructura.Telesilla lleno!");
        else this.personasabordo.add(persona);

    }

}
