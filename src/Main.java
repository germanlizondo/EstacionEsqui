import administracion.Cliente;
import infraestructura.Cañon;
import infraestructura.Pista;

import java.util.*;
public class Main {

    public static void main(String[] args) {

//Principio
        ArrayList<Cañon> cañones = new ArrayList<Cañon>();
        ArrayList<Pista> pistas = new ArrayList<Pista>();
        //Final Principio



   //ADMINISTRADOR

        Scanner scanadmin = new Scanner(System.in);
     boolean exitadmin = false;

   while (!exitadmin){

        System.out.println("¿Que desea hacer?");
       System.out.println("1- Ver todas las Pistas");
       System.out.println("2- Ver todas las Pistas abiertas");
       System.out.println("3- Ver todas las Pistas cerradas");
       System.out.println("4- Añadir Pista");
       System.out.println(".. -Salir Administrador");

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

               break;
           case 3:

               break;
           case 4:
               System.out.println("NOMBRE: ");
               String name = scanadmin.next();
               System.out.println("COLOR: ");
               String color = scanadmin.next();
               System.out.println("LONGITUD(km): ");
               int longitud = scanadmin.nextInt();
               System.out.println("NIVEL DE LA NIEVE(%): ");
               int nivelnieve = scanadmin.nextInt();
                pistas.add(new Pista(name,color,longitud,nivelnieve));
               break;

           default:
               exitadmin = true;
       }


    }
}

}
