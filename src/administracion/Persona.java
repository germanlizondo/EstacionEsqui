package administracion;

/**
 * Clase abstracta Persona
 */
public abstract class Persona {
    private int Id;
    private static int Idsiguiente = 1;
    private String nom;
    private String DNI;

    /**
     * Constructo persona
     * @param nom
     */
    public Persona(String nom) {

        this.nom = nom;
        this.Id = Idsiguiente;
        Idsiguiente++;
    }


    //GETTERS && SETTERS

    /**
     * getter ID
     * @return
     */
    public int getId() {
        return Id;
    }


    /**
     * getter Nom
     * @return
     */
    public String getNom() {
        return nom;
    }

    /**
     * setter Nom
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * getter Dni
     * @return
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * setter Dni
     * @param DNI
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
}
