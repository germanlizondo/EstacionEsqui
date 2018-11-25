package infraestructura;

import java.util.ArrayList;

/**
 * Class pista implementa la interface Comparable
 * para poder ordenar listas
 */
public class Pista implements Comparable {
    private int Id;
    private static int Idsiguiente =1;
    private String name;
    private String color;
    private int longitud;
    private int nivelnieve;
    private boolean abierta;
    private ArrayList<Cañon> cañones ;

    /**
     * Contructor de Pista
     * @param name
     * @param color
     * @param longitud
     * @param nivelnieve
     */
    public Pista(String name,String color, int longitud, int nivelnieve) {
        this.name = name;
        this.color = color;
        this.longitud = longitud;
        this.nivelnieve = nivelnieve;
        this.abierta = false;
        this.Id = Idsiguiente;
        Idsiguiente++;
    }



    //TO STRING

    /**
     * Override de ToString
     * @return
     */
    @Override
    public String toString() {
        String estado = "";
        if (this.isAbierta()) estado = "Abierta";
        else estado = "Cerrada";
        return "ID : " + Id  +
                " |NOMBRE : " + name  +
                " | COLOR : " + color  +
                " | LONGITUD: " + longitud + "km"+
                " | NIVEL DE NIEVE: " + nivelnieve +"%"+
        " | ESTADO: " + estado
                ;
    }


    //COMPARE TO

    /**
     * Compare TO
     * ordena lista de menos a mayor
     * @param pista
     * @return
     */
    public int compareTo(Object pista){
        Pista pista2 = (Pista) pista;
        if(this.longitud<pista2.longitud){
            return -1;
        }
        else if(this.longitud>pista2.longitud){
            return 1;
        }else{
            return 0;
        }
    }


    //GETTERS && SETTERS

    /**
     * Getter color
     * @return
     */
    public String getColor() {
        return color;
    }

    /**
     * setter Color
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * getter Longitud
     * @return
     */
    public int getLongitud() {
        return longitud;
    }

    /**
     * setter Longitud
     * @param longitud
     */
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    /**
     * getter Nivel de nieve
     * @return
     */
    public int getNivelnieve() {
        return nivelnieve;
    }

    /**
     * setter Nivel de nieve
     * @param nivelnieve
     */
    public void setNivelnieve(int nivelnieve) {
        this.nivelnieve = nivelnieve;
    }

    /**
     * getter cañones
     * @return
     */
    public ArrayList<Cañon> getCañones() {
        return cañones;
    }

    /**
     * getter cañones
     * @param cañon
     */
    public void setCañones(Cañon cañon) {
        this.cañones.add(cañon);
    }

    /**
     * retorna el estado
     * @return
     */
    public boolean isAbierta() {
        return abierta;
    }

    /**
     * cambia el estado
     * @param abierta
     */
    public void setAbierta(boolean abierta) {
        this.abierta = abierta;
    }

    /**
     * gettter name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * setter name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * setter Cañones
     * @param cañones
     */
    public void setCañones(ArrayList<Cañon> cañones) {
        this.cañones = cañones;
    }

    /**
     * getter id
     * @return
     */
    public int getId() {
        return Id;
    }


}
