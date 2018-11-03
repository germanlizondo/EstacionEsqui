package administracion;

public class Empleado extends Persona {


    private int sueldo;
    private int seguridadsocial;


    public Empleado(String nom, int sueldo, int seguridadsocial) {
        super(nom);
        this.sueldo = sueldo;
        this.seguridadsocial = seguridadsocial;
    }











    //GETTERS & SETTERS


    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getSeguridadsocial() {
        return seguridadsocial;
    }

    public void setSeguridadsocial(int seguridadsocial) {
        this.seguridadsocial = seguridadsocial;
    }
}
