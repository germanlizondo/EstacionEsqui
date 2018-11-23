package administracion;

import infraestructura.Cañon;
import infraestructura.Pista;
import infraestructura.Telesilla;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tecnico extends Empleado{

    private ArrayList<Cañon> cañones = new ArrayList<Cañon>();
    private ArrayList<Telesilla> telesillas = new ArrayList<Telesilla>();
    private ArrayList<Pista> pistas = new ArrayList<Pista>();

    public Tecnico(String nom, int sueldo, int seguridadsocial, ArrayList<Cañon> cañones, ArrayList<Telesilla> telesillas, ArrayList<Pista> pistas,String password) {
        super(nom, sueldo, seguridadsocial,password);
        this.cañones = cañones;
        this.telesillas = telesillas;
        this.pistas = pistas;
    }

    public void adminitrar_telesillas(){
        boolean exitadmin = false;
        Scanner scanadmin = new Scanner(System.in);
        int idtelesiila;
        while (!exitadmin){
            System.out.println("¿Que desea hacer?");
            System.out.println("1- Ver los telesillas");
            System.out.println("2- Parar todos los telesillas");
            System.out.println("3- Encender todos los telesillas");
            System.out.println("3- Encender todos los telesillas");
            System.out.println("4- Encender un telesilla");
            System.out.println("4- Para un telesilla");
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
                    System.out.println("Todos los Telesillas Encendidos+");

                    break;
                case 4:
                    for (Telesilla i: this.telesillas
                    ) {
                        System.out.println(i);
                    }

                    System.out.println("ID: ");
                    idtelesiila = scanadmin.nextInt();
                    for (Telesilla i : this.telesillas
                    ) {

                        if (i.getId() == idtelesiila){
                            i.setEncendido(true);
                            System.out.println("Telesilla : " + i.getId()+ " encendido" );
                            break;
                        }


                    }
                    break;
                case 5:
                    for (Telesilla i: this.telesillas
                    ) {
                        System.out.println(i);
                    }

                    System.out.println("ID: ");
                    idtelesiila = scanadmin.nextInt();
                    for (Telesilla i : this.telesillas
                    ) {

                        if (i.getId() == idtelesiila){
                            i.setEncendido(false);
                            System.out.println("Telesilla : " + i.getId()+ " parado" );
                            break;
                        }


                    }
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
            System.out.println("5- Ordenar por Potencia");
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
                    System.out.println("¿Que porcentaje de nieve quieres llenar las pistas?");
                    int nivelnieve = scanadmin.nextInt();
                    for (Cañon i : this.cañones
                    ) {

                        i.encender(nivelnieve);


                    }
                    System.out.println("Todos los Cañones han sido encendidos al "+nivelnieve+"% de nieve");
                    break;
                case 4:
                    System.out.println("Que cañon quieres apagar o encender?");
                    for (Cañon i : this.cañones
                    ) {

                        System.out.println(i);

                    }

                    int id_cañon = scanadmin.nextInt();

                    for (Cañon i : this.cañones
                    ) {
                        System.out.println(i.getId());
                        System.out.println(id_cañon);
                        if (i.getId() == id_cañon){
                            if(!i.isEncendido()){
                                System.out.println("Que porcentage de nieve quieres encender?");
                                int por_nieve = scanadmin.nextInt();
                                i.encender(por_nieve);
                            }else{
                                i.apagar();
                            }
                            break;
                        }


                    }

                    break;
                case 5:

                    Collections.sort(this.cañones);
                    for (Cañon i: this.cañones
                    ) {
                        System.out.println(i);
                    }


                    break;

                    default: exitadmin = true;
            }
        }
    }


    public void administrarpistas(){

        Scanner scanadmin = new Scanner(System.in);
        boolean exitadmin = false;
        int idpista;
        while (!exitadmin){


            System.out.println("¿Que desea hacer?");
            System.out.println("1- Ver todas las Pistas");
            System.out.println("2- Ver todas las Pistas abiertas");
            System.out.println("3- Ver todas las Pistas cerradas");
            System.out.println("4- Cambiar estado de la Pista");
            System.out.println("5- Ver todas las Pistas ordenadas por Longitud");
            System.out.println(".. -Salir ");

            int x = scanadmin.nextInt();
            switch (x){
                case 1:
                    if (pistas.isEmpty()) System.out.println("No hay pistas");
                    else   for (Pista i : pistas
                    ) {
                        System.out.println(i);
                    }

                    break;
                case 2:

                    for (Pista i : pistas
                    ) {
                        if(i.isAbierta())   System.out.println(i);

                    }
                    break;
                case 3:
                    for (Pista i : pistas
                    ) {
                        if(!i.isAbierta())   System.out.println(i);

                    }
                    break;



                case 4:

                    for (Pista i: pistas
                    ) {
                        System.out.println(i);
                    }

                    System.out.println("ID: ");
                    idpista = scanadmin.nextInt();
                    for (Pista i : this.pistas
                    ) {

                        if (i.getId() == idpista){
                           if(i.isAbierta()){
                               i.setAbierta(false);
                               System.out.println("Pista : " + i.getId()+ " Cerrada" );

                           }else if(!i.isAbierta()){
                               i.setAbierta(true);
                               System.out.println("Pista : " + i.getId()+ " Abierta" );
                           }

                            break;
                        }


                    }
                    break;

                case 5:

                    Collections.sort(pistas);
                    for (Pista i: pistas
                    ) {
                        System.out.println(i);
                    }


                    break;

                default:
                    exitadmin = true;
            }


        }
    }

    @Override
    public  void administrar(){
        boolean exitadmin = false;
        Scanner scanadmin = new Scanner(System.in);
        while (!exitadmin){
            System.out.println("¿Que desea hacer?");
            System.out.println("1- Administrar Telesillas");
            System.out.println("2- Administrar Cañones");
            System.out.println("3- Administrar Pistas");
            System.out.println(".. -Salir Administrador");

            int x = scanadmin.nextInt();
            switch (x){
                case 1:
this.adminitrar_telesillas();
                    break;
                case 2:
this.administrar_cañones();
                    break;
                case 3:
                    this.administrarpistas();
                    break;
                default: exitadmin = true;
            }
        }
    }





    //GETTERS & SETTERS


    public void setCañones(ArrayList<Cañon> cañones) {
        this.cañones = cañones;
    }

    public void setTelesillas(ArrayList<Telesilla> telesillas) {
        this.telesillas = telesillas;
    }

    public ArrayList<Pista> getPistas() {
        return pistas;
    }

    public void setPistas(ArrayList<Pista> pistas) {
        this.pistas = pistas;
    }

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
