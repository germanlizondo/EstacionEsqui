import administracion.Cliente;
import infraestructura.Cañon;
import infraestructura.Pista;

import java.util.*;
public class Main {

    public static void main(String[] args) {


        String nombrepista = "";
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
       System.out.println("5- Eliminar Pista");
       System.out.println("6- Cambiar estado de la Pista");
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
           case 5:

               for (Pista i: pistas
               ) {
                   System.out.println(i);
               }
int iterador = 0;
               System.out.println("NOMBRE: ");
                nombrepista = scanadmin.next();
               for (Pista i : pistas
               ) {

                       if (i.getName().equals(nombrepista)){
                           pistas.remove(iterador);
                           System.out.println("Pista : " + i.getName()+ " eliminada" );
                       }

                   iterador++;
               }
               break;

           case 6:

               for (Pista i: pistas
                    ) {
               System.out.println(i);
               }

               System.out.println("NOMBRE: ");
                nombrepista = scanadmin.next();
               for (Pista i : pistas
               ) {
                   String estado = "";
                   if(i.getName().equals(nombrepista)) {
                       if (i.isAbierta()) estado = "Cerrada";
                       else estado = "Abierta";
                       if (i.isAbierta()) i.setAbierta(false);
                       else i.setAbierta(true);
                       System.out.println("Pista : " + i.getName() + " | Estado : " + estado);
                   }
               }
               break;

           default:
               exitadmin = true;
       }


    }
}

}
