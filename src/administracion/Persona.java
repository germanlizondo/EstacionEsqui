package administracion;

public abstract class Persona {
    private int Id;
    private static int Idsiguiente = 1;
    private String nom;
    private String DNI;

    public Persona(String nom) {

        this.nom = nom;
        this.Id = Idsiguiente;
        Idsiguiente++;
    }



    public void comprarForfait(){ }









    //GETTERS && SETTERS


    public int getId() {
        return Id;
    }



    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
}
