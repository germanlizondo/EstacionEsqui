package infraestructura;

public class Pista {
    private String color;
    private int longitud;
    private int nivelnieve;

    public Pista(String color, int longitud, int nivelnieve) {
        this.color = color;
        this.longitud = longitud;
        this.nivelnieve = nivelnieve;
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
}
