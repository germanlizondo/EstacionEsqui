import administracion.Clase;
import administracion.Cliente;
import administracion.Monitor;
import administracion.Tecnico;
import infraestructura.Cañon;
import infraestructura.Pista;
import infraestructura.Telesilla;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {


//Principio
        ArrayList<Cañon> cañones = new ArrayList<Cañon>();
        ArrayList<Pista> pistas = new ArrayList<Pista>();
        ArrayList<Telesilla> telesillas = new ArrayList<Telesilla>();
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        ArrayList<Clase> clases = new ArrayList<Clase>();

        for(int x = 0; x<5;x++){
            telesillas.add(new Telesilla(10+x,5+x,6,15));
        }
        for(int x = 0; x<5;x++){
            pistas.add(new Pista("pista"+x,"Azul",15+x,65+x));
        }
        for(int x = 0; x<5;x++){
           cañones.add(new Cañon(15+x,pistas.get(x)));
        }

        Tecnico tecnico = new Tecnico("German",123456,888483,cañones,telesillas,pistas,"hellothere");
        Monitor monitor = new Monitor("Obi",5000000,53443345,"snowboard","dewit");

        boolean exitadmin = false;
        Scanner scanadmin = new Scanner(System.in);
        while (!exitadmin){
            System.out.println("¿Quien eres?");
            System.out.println("1- Cliente");
            System.out.println("2- Empleado");

            System.out.println(".. -Salir ");

            int x = scanadmin.nextInt();
            switch (x){
                case 1:

                    Boolean exitcliente = false;
                    while (!exitcliente){

                        System.out.println("1- Comprar Forfait");



                        System.out.println("2-Clases prácticas");
                        System.out.println(".. -Salir ");

                        int y = scanadmin.nextInt();
                        switch (y){
                            case 1:
                                System.out.println("Por favor ingrese su Nombre");
                                String nombrecliente = scanadmin.next();
                                Cliente cliente = new Cliente(nombrecliente);
                                cliente.comprarForfait();
                                clientes.add(cliente);
                                break;

                            case 2 :

                                for (Clase c: clases
                                     ) {
                                    System.out.println(c);
                                }



                                break;



                            default: exitcliente = true;
                        }
                    }



                    break;
                case 2:
                    System.out.println("Por favor ingrese la contraseña");
                    String passwordpuesta = scanadmin.next();
                    if(tecnico.getPassword().equals(passwordpuesta)){
                        boolean exitempleado = false;

                        while (!exitempleado){
                            System.out.println("Bienvenido! ¿Quien eres?");
                            System.out.println("1- Técnico");
                            System.out.println("2- Monitor");

                            System.out.println(".. -Salir ");

                            int y = scanadmin.nextInt();
                            switch (y){
                                case 1:
                                    tecnico.administrar();
                                    break;
                                case 2:
                                    clases.add(monitor.crearClase());

                                    for (Clase c: clases
                                         ) {
                                        System.out.println(c);
                                    }
                                    break;



                                default: exitempleado = true;
                            }
                        }
                    }else{
                        System.out.println("Contraseña incorrecta");
                    }


                    break;



                default: exitadmin = true;
            }
        }
        //Final Principio

        //Tecnico




   //ADMINISTRADOR

}


}
