package administracion;

import infraestructura.Cañon;
import infraestructura.Telesilla;

import java.util.ArrayList;
import java.util.Scanner;

public class Tecnico extends Empleado{

    private ArrayList<Cañon> cañones = new ArrayList<Cañon>();
    private ArrayList<Telesilla> telesillas = new ArrayList<Telesilla>();
    public Tecnico(String nom, int sueldo, int seguridadsocial) {
        super(nom, sueldo, seguridadsocial);
    }


    public void adminitrar_telesillas(){
        boolean exitadmin = false;
        Scanner scanadmin = new Scanner(System.in);
        while (!exitadmin){
            System.out.println("¿Que desea hacer?");
            System.out.println("1- Ver los telesillas");
            System.out.println("2- Parar los telesillas");
            System.out.println("3- Encender los telesillas");
            System.out.println(".. -Salir Administrador");

            int x = scanadmin.nextInt();
            switch (x){
                case 1:
                    for (Telesilla t:this.telesillas
                         ) {
                        System.out.println(t);
                    }
                    break;
                case 2:
                    for (Telesilla t:this.telesillas
                    ) {
                        t.setEncendido(false);
                    }
                    System.out.println("Todos los Telesillas Parados");
                    break;
                case 3:
                    for (Telesilla t:this.telesillas
                    ) {
                        t.setEncendido(true);
                    }
                    System.out.println("Todos los Telesillas Parados");

                    break;
                case 4:


                    break;
                default: exitadmin = true;
            }
        }
    }

    public void administrar_cañones(){
        boolean exitadmin = false;
        Scanner scanadmin = new Scanner(System.in);
        while (!exitadmin){
            System.out.println("¿Que desea hacer?");
            System.out.println("1- Ver los cañones");
            System.out.println("2- Apagar Todos los Cañones");
            System.out.println("3- Encender Todos los Cañones");
            System.out.println("4- Encender o Apagar un Cañon");
            System.out.println(".. -Salir Administrador");

            int x = scanadmin.nextInt();
            switch (x){
                case 1:
                    for (Cañon i : this.cañones
                         ) {
                        System.out.println(i);

                    }
                    break;
                case 2:
                    for (Cañon i : this.cañones
                    ) {
                        i.apagar();
                        System.out.println("Todos los Cañones han sido apagados");

                    }
                    break;
                case 3:
                    for (Cañon i : this.cañones
                    ) {
                        System.out.println("¿Que porcentaje de nieve quieres llenar las pistas?");
                       int nivelnieve = scanadmin.nextInt();
                        i.encender(nivelnieve);
                        System.out.println("Todos los Cañones han sido encendidos al "+nivelnieve+"% de nieve");

                    }
                    break;
                case 4:
                    System.out.println("Que cañon quieres apagar o encender?");
                    for (Cañon i : this.cañones
                    ) {

                        System.out.println(i);

                    }

                    int nom_cañon = scanadmin.nextInt();

                   if (this.cañones.get(nom_cañon).isEncendido()) {
                       System.out.println("Que porcentage de nieve quieres encender?");
                       int por_nieve = scanadmin.nextInt();
                       this.cañones.get(nom_cañon).encender(por_nieve);
                   }else this.cañones.get(nom_cañon).apagar();
                    break;
                    default: exitadmin = true;
            }
        }
    }


    public  void administrar(){
        boolean exitadmin = false;
        Scanner scanadmin = new Scanner(System.in);
        while (!exitadmin){
            System.out.println("¿Que desea hacer?");
            System.out.println("1- Administrar Telesillas");
            System.out.println("2- Administrar Cañones");
            System.out.println(".. -Salir Administrador");

            int x = scanadmin.nextInt();
            switch (x){
                case 1:
this.adminitrar_telesillas();
                    break;
                case 2:
this.administrar_cañones();
                    break;

                default: exitadmin = true;
            }
        }
    }





    //GETTERS & SETTERS


    public ArrayList<Cañon> getCañones() {
        return cañones;
    }

    public void setCañones(Cañon cañon) {
        this.cañones.add(cañon);

    }

    public ArrayList<Telesilla> getTelesillas() {
        return telesillas;
    }

    public void setTelesillas(Telesilla telesilla) {
        this.telesillas.add(telesilla);
    }
}
