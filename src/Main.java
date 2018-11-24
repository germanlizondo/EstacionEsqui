import administracion.*;
import infraestructura.Cañon;
import infraestructura.Pista;
import infraestructura.Telesilla;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


interface Buscarmonitores {
    Empleado buscarempleado(int i);

}

interface Buscarclase {
    Clase buscarclase(int i);

}

interface Validar {
    Empleado validarpassword(String p);

}
public class Main {

    public static void main(String[] args) {


//Principio
        ArrayList<Cañon> cañones = new ArrayList<Cañon>();
        ArrayList<Pista> pistas = new ArrayList<Pista>();
        ArrayList<Telesilla> telesillas = new ArrayList<Telesilla>();
        ArrayList<Clase> clases = new ArrayList<Clase>();

        ArrayList<Persona> clientes = new ArrayList<Persona>();
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();


        for(int x = 0; x<5;x++){
            telesillas.add(new Telesilla(10+x,5+x,6,15));
        }
        for(int x = 0; x<5;x++){
            pistas.add(new Pista("pista"+x,"Azul",15+x,65+x));
        }
        for(int x = 0; x<5;x++){
            cañones.add(new Cañon(15+x,pistas.get(x)));
        }
        for(int x = 0; x<5;x++){
          clases.add(new Clase("SNOWBOARD",50+x,"Avanzado"));
        }
        for(int x = 0; x<5;x++){
            empleados.add(new Tecnico("empleado"+x,1500,8012345+x,cañones,telesillas,pistas,"kenobi"+x));
            empleados.add(new Monitor("monitor"+x,1000,803243+x,"SNOWBOARD","monitor"+x));
            empleados.add(new Responsable("responsable"+x,3000,801234,"res"+x,empleados));
        }


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
                        Persona cliente = new Cliente("");
                        System.out.println("1- Comprar Forfait");
                        System.out.println("2-Clases prácticas");
                        System.out.println("3-Adquirir clase práctica");
                        System.out.println(".. -Salir ");

                        int y = scanadmin.nextInt();
                        switch (y){
                            case 1:
                                System.out.println("Por favor ingrese su Nombre");
                                String nombrecliente = scanadmin.next();
                                cliente.setNom(nombrecliente);
                                cliente.comprarForfait();
                                clientes.add(cliente);
                                break;

                            case 2 :

                                for (Clase c: clases
                                     ) {
                                    System.out.println(c);
                                }
                                break;
                            case 3 :

                                for (Clase c: clases
                                ) {
                                    System.out.println(c);
                                }
                                System.out.println("¿Que clase quiere?");
                                int id_clase = scanadmin.nextInt();

                                for (Clase i : clases
                                ) {
                                    System.out.println(i.getId());
                                    if (i.getId() == id_clase){
                                        System.out.println(i);
                                        try {
                                            ((Cliente) cliente).setClases(i);
                                        }catch (Exception e){
                                            System.out.println(e);
                                        }

                                        i.setClientes((Cliente) cliente);
                                        break;
                                    }


                                }

                                break;



                            default: exitcliente = true;
                        }
                    }



                    break;
                case 2:
                    System.out.println("Por favor ingrese la contraseña");
                    String passwordpuesta = scanadmin.next();

                    Validar validar = (p) ->{

                        for (Empleado e: empleados
                        ) {
                            if(e.getPassword().equals(p)){
                                return e;

                            }

                        }


                        return null;

                    };

                    Empleado empleadologeado = validar.validarpassword(passwordpuesta);
                    if(empleadologeado != null){
                        boolean exitempleado = false;


                            System.out.println("Bienvenido "+empleadologeado.getNom());
                            if(empleadologeado instanceof Tecnico){
                                System.out.println("Técnico :");
                                Tecnico tecnico = (Tecnico) empleadologeado;
                                tecnico.administrar();
                            }else if(empleadologeado instanceof Monitor){
                                Monitor monitor = (Monitor) empleadologeado;
                                System.out.println("Monitor :");
                                Boolean exitmonitor = false;

                                while (!exitmonitor){
                                    System.out.println("¿Que queires hacer?");
                                    System.out.println("1- Ver tus Clases");
                                    System.out.println("2-  Crear Clase");
                                    System.out.println(".. -Salir ");

                                    int xmonitor = scanadmin.nextInt();
                                    switch (xmonitor){
                                        case 1:
                                            monitor.administrar();
                                            break;
                                        case 2:
                                            ((Monitor) monitor).crearClase();
                                            break;
                                        default: exitmonitor = true;
                                    }
                                }
                                clases.add(((Monitor) monitor).crearClase());

                                for (Clase c: clases
                                ) {
                                    System.out.println(c);
                                }
                            }else if(empleadologeado instanceof Responsable) {

                                Responsable responsable = (Responsable) empleadologeado;

                                Boolean exitresponsable = false;


                                System.out.println(" Responsable: ¿Que queires hacer?");
                                while (!exitresponsable){

                                    System.out.println("1- Ver los Empleados");
                                    System.out.println("2- Crear Clase práctica");
                                    System.out.println("3- Ver todas Clase práctica");
                                    System.out.println("4- Asignar Clase");
                                    System.out.println("5- Contratar Monitor");
                                    System.out.println("6- Contratar Técnico");
                                    System.out.println(".. -Salir ");

                                    int xres = scanadmin.nextInt();
                                    switch (xres){
                                        case 1:
                                            responsable.administrar();
                                            break;
                                        case 2:
                                            clases.add(((Responsable) responsable).crearClase());
                                            break;
                                        case 3:
                                            clases.forEach(c -> System.out.println(c));

                                            break;
                                        case 4:

                                            Buscarmonitores buscarmoonitores = (i) ->{
                                                for (Empleado e: empleados
                                                ) {
                                                    if(e.getId() == i){
                                                        return e;
                                                    }
                                                }


                                                return null;
                                            };

                                            Buscarclase buscarclase = (i) ->{
                                                for (Clase e: clases
                                                ) {
                                                    if(e.getId() == i){
                                                        return e;
                                                    }
                                                }


                                                return null;
                                            };


                                            clases.forEach(c -> System.out.println(c));

                                            System.out.println("Que clase quieres asignar?");
                                            int id_clase = scanadmin.nextInt();

                                            empleados.forEach(e -> {
                                                if(e instanceof Monitor){
                                                    System.out.println(e);
                                                }

                                            });
                                            System.out.println("Que monitor quieres asignar la clase?");
                                            int id_empleado = scanadmin.nextInt();


                                            Empleado este_empleado = buscarmoonitores.buscarempleado(id_empleado);
                                            Clase esta_clase = buscarclase.buscarclase(id_clase);
                                            Monitor casting_empleado = (Monitor) este_empleado;
                                            casting_empleado.agregarClase(esta_clase);



                                            break;
                                        case 5:
                                            Monitor nuevomonitor = ((Responsable) responsable).contratarMonitor();
                                            empleados.add(nuevomonitor);
                                            break;
                                        case 6:
                                            Tecnico nuevotecnico = ((Responsable) responsable).contratarTecnico(pistas,cañones,telesillas);
                                            empleados.add(nuevotecnico);
                                            break;
                                        default:

                                            exitresponsable = true;
                                    }
                                }

                            }


                    }else{
                        System.out.println("Contraseña incorrecta");

                        break;
                    }
                    break;
                    default: exitadmin = true;
            }
        }

}


}


