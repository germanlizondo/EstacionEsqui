package administracion;

import infraestructura.Cañon;
import infraestructura.Pista;
import infraestructura.Telesilla;

import java.util.ArrayList;
import java.util.Scanner;




public class Responsable extends Empleado {
    private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    private ArrayList<Empleado> monitores = new ArrayList<Empleado>();
    private ArrayList<Empleado> tecnicos = new ArrayList<Empleado>();
    public Responsable(String nom, int sueldo, int seguridadsocial, String password,  ArrayList<Empleado> empleados) {
        super(nom, sueldo, seguridadsocial, password);
       this.empleados = empleados;


    }

    @Override
    public void administrar() {

        Scanner scan = new Scanner(System.in);
        Boolean exitcliente = false;
        while (!exitcliente){

            System.out.println("¿Que quieres ver?");
            System.out.println("1-Todos los empleados");
            System.out.println("2-Tecnicos");
            System.out.println("3-Monitores");
            System.out.println(".. -Salir ");

            int y = scan.nextInt();
            switch (y){
                case 1:
                   this.empleados.forEach(c -> System.out.println(c));
                    break;
                case 2 :
                    this.empleados.forEach(c -> {
                        if(c instanceof Tecnico){
                            System.out.println(c);
                        }

                    });


                    break;
                case 3 :

                    this.empleados.forEach(c -> {
                        if(c instanceof Monitor){
                            System.out.println(c);
                        }

                    });
                    break;
                default: exitcliente = true;
            }
        }

    }


    public Clase crearClase(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Deporte de la clase :");
        String deporte = scan.next();
        System.out.println("Precio de la clase :");
        int precio = scan.nextInt();
        System.out.println("Dificultad de la clase :");
        String dificultad = scan.next();
        Clase clase = new Clase(deporte,precio,dificultad);
        return clase;
    }

    public Tecnico contratarTecnico(ArrayList<Pista> pistas, ArrayList<Cañon> cañones, ArrayList<Telesilla> telesillas){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nombre del Técnico :");
        String nombre = scan.next();
        System.out.println("Sueldo del Técnico :");
        int sueldo = scan.nextInt();
        System.out.println("Numero de la Seguridad Social del Técnico :");
        int seso = scan.nextInt();
        System.out.println("Contraseña del Técnico :");
        String password = scan.next();
        Tecnico tecnico = new Tecnico(nombre,sueldo,seso,cañones,telesillas,pistas,password);
        return tecnico;
    }

    public Monitor contratarMonitor(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nombre del Monitor :");
        String nombre = scan.next();
        System.out.println("Sueldo del Monitor :");
        int sueldo = scan.nextInt();
        System.out.println("Numero de la Seguridad Social del Monitor :");
        int seso = scan.nextInt();
        String sport = "";
        Boolean exit = false;
        while(!exit){
            System.out.println("Deporte especializado :");
            System.out.println("1- SNOWBOARD");
            System.out.println("2- ESQUI");
            System.out.println("3- RAQUETAS");
            int x = scan.nextInt();

            switch (x){
                case 1: sport = "SNOWBOARD";
                        exit = true;
                        break;
                case 2: sport = "ESQUI";
                        exit = true;
                        break;
                case 3: sport = "RAQUETAS";
                        exit = true;
                        break;
                default: exit = false;
            }
        }


        System.out.println("Contraseña del Monitor :");
        String password = scan.next();
        Monitor monitor = new Monitor(nombre,sueldo,seso,sport,password);
        return monitor;
    }


    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
}
