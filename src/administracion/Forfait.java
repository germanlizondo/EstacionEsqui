package administracion;

import java.util.*;

public class Forfait {
    private int precio;
    private String fecha;
    private String dni;
    private boolean seguro;
    private Tipo tipo;

    public Forfait(int precio, boolean seguro,String abreviatura) {

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
        this.tipo = Enum.valueOf(Tipo.class,abreviatura.toUpperCase());
    }

    @Override
    public String toString() {

        if(!seguro) return "TIPO: "+this.tipo+" | PRECIO: "+this.precio+"€ | "+this.fecha+" | SEGURO : NO";
        else return "TIPO: "+this.tipo+" | PRECIO: "+this.precio+"€ | "+this.fecha+" | SEGURO : SI | DNI: "+this.dni;

    }


    public boolean validarDni(String dni){

        if (dni.length() != 9 || Character.isLetter(dni.charAt(8)) == false){
            return false;
        }
        else return true;


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
