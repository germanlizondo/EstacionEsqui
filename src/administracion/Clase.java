package administracion;

import java.lang.ref.Cleaner;
import java.util.ArrayList;

public class Clase {

    private Deporte deporte;
    private int precio;
    private String dificultat;

    private ArrayList<Monitor> monitores = new ArrayList<Monitor>();
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public Clase(String a_deporte, int precio) {
        this.deporte = Enum.valueOf(Deporte.class,a_deporte.toUpperCase());

        this.precio = precio;

    }

    @Override
    public String toString() {
        return "Clase{" +
                "deporte=" + deporte +
                ", precio=" + precio +
                ", dificultat='" + dificultat + '\'' +
                '}';
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

    public ArrayList<Monitor> getMonitores() {
        return monitores;
    }

    public void setMonitores(ArrayList<Monitor> monitores) {
        this.monitores = monitores;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
}
