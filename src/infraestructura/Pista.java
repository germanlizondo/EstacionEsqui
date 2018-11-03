package infraestructura;

import java.util.ArrayList;

public class Pista {
    private String name;
    private String color;
    private int longitud;
    private int nivelnieve;
    private boolean abierta;
    private ArrayList<Cañon> cañones ;

    public Pista(String name,String color, int longitud, int nivelnieve) {
        this.name = name;
        this.color = color;
        this.longitud = longitud;
        this.nivelnieve = nivelnieve;
        this.abierta = true;
    }



    //TO STRING

    @Override
    public String toString() {
        return "NOMBRE : " + name  +
                " | COLOR : " + color  +
                " | LONGITUD: " + longitud + "km"+
                " | NIVEL DE NIEVE: " + nivelnieve +"%"
                ;
    }


    //GETTERS && SETTERS


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getNivelnieve() {
        return nivelnieve;
    }

    public void setNivelnieve(int nivelnieve) {
        this.nivelnieve = nivelnieve;
    }

    public ArrayList<Cañon> getCañones() {
        return cañones;
    }

    public void setCañones(Cañon cañon) {
        this.cañones.add(cañon);
    }


    public boolean isAbierta() {
        return abierta;
    }

    public void setAbierta(boolean abierta) {
        this.abierta = abierta;
    }
}
