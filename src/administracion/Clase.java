package administracion;

import java.lang.ref.Cleaner;
import java.util.ArrayList;

/**
 *  Clase de clase practica
 */
public class Clase {
    private int Id;
    private static int Idsiguiente = 1;
    private Deporte deporte;
    private int precio;
    private String dificultat;
    private Boolean acabada = false;
    private int duracion;

    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    /**
     * Constructor de clase
     * @param a_deporte
     * @param precio
     * @param dificultat
     */
    public Clase(String a_deporte, int precio,String dificultat) {
        this.deporte = Enum.valueOf(Deporte.class,a_deporte.toUpperCase());
this.dificultat = dificultat;
        this.precio = precio;
        this.Id = Idsiguiente;
        Idsiguiente++;

    }

    /**
     * Override de Tostring de Clase
     * @return
     */
    @Override
    public String toString() {
        return "Clase{" +
                "Id=" + Id +
                ", deporte=" + deporte +
                ", clientes=" + clientes +
                '}';
    }

    /**
     * getter de ID
     * @return
     */
    public int getId() {
        return Id;
    }

    /**
     * getter idsiguiente
     * @return
     */
    public static int getIdsiguiente() {
        return Idsiguiente;
    }

    /**
     * getter dificultad
     * @return
     */
    public String getDificultat() {
        return dificultat;
    }

    /**
     * setter Dificultat
     * @param dificultat
     */
    public void setDificultat(String dificultat) {
        this.dificultat = dificultat;
    }

    /**
     * Get si esta acabada
     * @return
     */
    public Boolean getAcabada() {
        return acabada;
    }

    /**
     * setter acabada
     * @param acabada
     */
    public void setAcabada(Boolean acabada) {
        this.acabada = acabada;
    }

    /**
     * getter duracion
     * @return
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * setter duracion
     * @param duracion
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     * getter deporte
     * @return
     */
    public Deporte getDeporte() {
        return deporte;
    }

    /**
     * setter deporte
     * @param deporte
     */
    public void setDeporte(Deporte deporte) {
        this.deporte = deporte;
    }

    /**
     * getter precio
     * @return
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * setter precio
     * @param precio
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * getter ArrayList Clientes
     * @return
     */


    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    /**
     * setter ArrayList Clientes
     * @param cliente
     */
    public void setClientes(Cliente cliente) {
        this.clientes.add(cliente);
    }
}
