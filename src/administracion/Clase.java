package administracion;

import java.lang.ref.Cleaner;
import java.util.ArrayList;

public class Clase {
    private int Id;
    private static int Idsiguiente = 1;
    private Deporte deporte;
    private int precio;
    private String dificultat;
    private Boolean acabada = false;
    private int duracion;

    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public Clase(String a_deporte, int precio,String dificultat) {
        this.deporte = Enum.valueOf(Deporte.class,a_deporte.toUpperCase());
this.dificultat = dificultat;
        this.precio = precio;
        this.Id = Idsiguiente;
        Idsiguiente++;

    }

    @Override
    public String toString() {
        return "Clase{" +
                "Id=" + Id +
                ", deporte=" + deporte +
                ", clientes=" + clientes +
                '}';
    }

    public int getId() {
        return Id;
    }

    public static int getIdsiguiente() {
        return Idsiguiente;
    }

    public String getDificultat() {
        return dificultat;
    }

    public void setDificultat(String dificultat) {
        this.dificultat = dificultat;
    }

    public Boolean getAcabada() {
        return acabada;
    }

    public void setAcabada(Boolean acabada) {
        this.acabada = acabada;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Deporte getDeporte() {
        return deporte;
    }

    public void setDeporte(Deporte deporte) {
        this.deporte = deporte;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }



    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Cliente cliente) {
        this.clientes.add(cliente);
    }
}
