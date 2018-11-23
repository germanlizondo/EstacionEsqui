package infraestructura;

import java.util.ArrayList;

public class Pista implements Comparable {
    private int Id;
    private static int Idsiguiente =1;
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
        this.abierta = false;
        this.Id = Idsiguiente;
        Idsiguiente++;
    }



    //TO STRING

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCañones(ArrayList<Cañon> cañones) {
        this.cañones = cañones;
    }

    public int getId() {
        return Id;
    }


}
