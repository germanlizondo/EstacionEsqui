package administracion;

/**
 * Clase Empleado extiende de Persona e implementa la interficie Administrador
 */
public abstract class Empleado extends Persona implements Administrador {


    private int sueldo;
    private int seguridadsocial;
    private String password;

    /**
     * Constructor de Empleado
     * @param nom
     * @param sueldo
     * @param seguridadsocial
     * @param password
     */
    public Empleado(String nom, int sueldo, int seguridadsocial,String password) {
        super(nom);
        this.sueldo = sueldo;
        this.seguridadsocial = seguridadsocial;
        this.password = password;

    }


    /**
     * metodo abstracto adminsitrar
     */

    public abstract void administrar();


    //GETTERS & SETTERS

    /**
     * Getter Password
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * setter password
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * getter Sueldo
     * @return
     */
    public int getSueldo() {
        return sueldo;
    }

    /**
     * setter Sueldo
     * @param sueldo
     */
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * getter SeguridadSocial
     * @return
     */
    public int getSeguridadsocial() {
        return seguridadsocial;
    }

    /**
     * setter SeguridadSocial
     * @param seguridadsocial
     */
    public void setSeguridadsocial(int seguridadsocial) {
        this.seguridadsocial = seguridadsocial;
    }
}
