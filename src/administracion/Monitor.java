package administracion;

import java.util.ArrayList;

public class Monitor extends Empleado {
    private ArrayList<Clase> clases = new ArrayList<Clase>();
    private Deporte deporte;

    public Monitor(String nom, int sueldo, int seguridadsocial, String a_deporte,String password) {
        super(nom, sueldo, seguridadsocial,password);
        this.deporte = Enum.valueOf(Deporte.class,a_deporte.toUpperCase());
    }


    @Override
    public void administrar() {



        for (Clase c : this.clases
             ) {
            System.out.println(c);
        }
    }

    public void darClase(Clase clase){
        this.clases.add(clase);
    }

    public Clase crearClase(){
        Clase clase = new Clase("snowboard",50);
        this.clases.add(clase);
        return clase;
    }


    public Deporte getDeporte() {
        return deporte;
    }

    public void setDeporte(Deporte deporte) {
        this.deporte = deporte;
    }
}
