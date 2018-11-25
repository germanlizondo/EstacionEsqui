package administracion;

import java.util.*;

/**
 * Calse Forfait
 */
public class Forfait {
    private int precio;
    private String fecha;
    private String dni;
    private boolean seguro;
    private Tipo tipo;

    /**
     * Constructor de Forfait
     * @param precio
     * @param seguro
     * @param abreviatura
     */
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

    /**
     * Override toString de Forfait
     * @return
     */
    @Override
    public String toString() {

        if(!seguro) return "TIPO: "+this.tipo+" | PRECIO: "+this.precio+"€ | "+this.fecha+" | SEGURO : NO";
        else return "TIPO: "+this.tipo+" | PRECIO: "+this.precio+"€ | "+this.fecha+" | SEGURO : SI | DNI: "+this.dni;

    }

    /**
     * Metodo para validar el dni; retorna false o true
     * @param dni
     * @return
     */

    public boolean validarDni(String dni){

        if (dni.length() != 9 || Character.isLetter(dni.charAt(8)) == false){
            return false;
        }
        else return true;


    }

    //GETTERS && SETTERS

    /**
     * getter Precio
     * @return
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * setter Precio
     * @param precio
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * getter Fecha
     * @return
     */

    public String getFecha() {
        return fecha;
    }

    /**
     * Compueba si hay seguro o no
     * @return
     */

    public boolean isSeguro() {
        return seguro;
    }

    /**
     * añade el seguro
     * @param seguro
     */
    public void setSeguro(boolean seguro) {
        this.seguro = seguro;
    }

    /**
     * getter DNI
     * @return
     */
    public String getDni() {
        return dni;
    }

    /**
     * setter DNI
     * @param dni
     */
    public void setDni(String dni) {
        this.dni = dni;
    }
}
