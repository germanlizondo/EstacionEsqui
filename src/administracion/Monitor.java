package administracion;

import java.awt.event.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;

public class Monitor extends Empleado implements ActionListener {
    private ArrayList<Clase> clases = new ArrayList<Clase>();
    private Deporte deporte;
    private Boolean dandoclase = false;
    private int tiempodandoclase = 0;

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

    public void agregarClase(Clase clase){
        this.clases.add(clase);
    }

    public Clase crearClase(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Precio de la clase de "+this.deporte);
        int x = scan.nextInt();
        System.out.println("Dificultat");
        System.out.println("1-Principiante");
        System.out.println("2-Medio");
        System.out.println("3-Avanzada");
        int y = scan.nextInt();
        String dificultat = "";
        Boolean exitclase = false;
        while(!exitclase){

            switch (y){
                case 1: dificultat = "Principiante";
                    exitclase = true ;
                    break;
                case 2: dificultat = "Medio";
                    exitclase = true ;
                    break;
                case 3: dificultat = "Avanzado";
                    exitclase = true ;
                    break;
                default: exitclase = false ;
            }

        }


        Clase clase = new Clase(this.deporte.toString(),x,dificultat);
        this.clases.add(clase);
        return clase;
    }

  /*  public void darClase(Clase clase){
        Timer temporizador  = new Timer(1000,this.actionPerformed();)
    }
*/
    @Override
    public void actionPerformed(ActionEvent e) {

        this.tiempodandoclase++;
        System.out.println(this.tiempodandoclase);
    }

    public Deporte getDeporte() {
        return deporte;
    }

    public void setDeporte(Deporte deporte) {
        this.deporte = deporte;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "ID : " + getId()+
                ", NOMBRE: "+getNom()+
                ", clases=" + clases +
                ", deporte=" + deporte +
                ", dandoclase=" + dandoclase +
                ", tiempodandoclase=" + tiempodandoclase +
                '}';
    }
}



