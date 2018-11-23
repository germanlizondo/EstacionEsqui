package administracion;

public abstract class Empleado extends Persona implements Administrador {


    private int sueldo;
    private int seguridadsocial;
    private String password;


    public Empleado(String nom, int sueldo, int seguridadsocial,String password) {
        super(nom);
        this.sueldo = sueldo;
        this.seguridadsocial = seguridadsocial;
        this.password = password;

    }








    public abstract void administrar();


    //GETTERS & SETTERS


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

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
