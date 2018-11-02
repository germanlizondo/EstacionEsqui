import java.util.*;

public class Forfait {
    private int precio;
    private String fecha;
    private String dni;
    private boolean seguro;

    public Forfait(int precio, boolean seguro) {

        Calendar calendario = new GregorianCalendar();
        int año = calendario.get(Calendar.YEAR);
        int mes = calendario.get(Calendar.MONTH);
        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        int hora = calendario.get(Calendar.HOUR_OF_DAY);
        int minuto = calendario.get(Calendar.MINUTE);
        int segundo = calendario.get(Calendar.SECOND);

        this.precio = precio;
        this.fecha = dia + "/" + (mes+1) + "/" + año;
        this.seguro = seguro;
    }


    //GETTERS && SETTERS

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getFecha() {
        return fecha;
    }



    public boolean isSeguro() {
        return seguro;
    }

    public void setSeguro(boolean seguro) {
        this.seguro = seguro;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
