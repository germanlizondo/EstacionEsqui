import administracion.*;
import infraestructura.Cañon;
import infraestructura.Pista;
import infraestructura.Telesilla;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Interface para buscar monitores
 */

interface Buscarmonitores {
    Empleado buscarempleado(int i);

}

/**
 * Interface para buscar clases practicas
 */
interface Buscarclase {
    Clase buscarclase(int i);

}

/**
 * Interface para lambda deonde valida el password
 */

interface Validar {
    Empleado validarpassword(String p);

}

/**
 * Clase principal del proyecto
 */
public class Main {
    /**
     * Funcion Main de la aplicación
     * @param args
     */
    public static void main(String[] args) {


//Principio
        ArrayList<Cañon> cañones = new ArrayList<Cañon>();
        ArrayList<Pista> pistas = new ArrayList<Pista>();
        ArrayList<Telesilla> telesillas = new ArrayList<Telesilla>();
        ArrayList<Clase> clases = new ArrayList<Clase>();

        ArrayList<Persona> clientes = new ArrayList<Persona>();
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();


/**
 * Agregar Telesillas a la ARRAYLIST DE TELESILLAS
 */
            telesillas.add(new Telesilla(10,5,6,15));
            telesillas.add(new Telesilla(5,5,4,10));
            telesillas.add(new Telesilla(7,5,3,5));

/**
 * Agregar PISTAS a la ARRAYLIST DE PISTAS
 */
            pistas.add(new Pista("pista1","Azul",15,65));
            pistas.add(new Pista("pista2","Roja",10,65));
            pistas.add(new Pista("pista3","Verde",20,65));

/**
 * Agregar CAÑONES a la ARRAYLIST DE CAÑONES
 */
        cañones.add(new Cañon(15,pistas.get(1)));

        cañones.add(new Cañon(15,pistas.get(2)));

        cañones.add(new Cañon(15,pistas.get(0)));


/**
 * Agregar CALSES a la ARRAYLIST DE CLASES
 */

          clases.add(new Clase("SNOWBOARD",50,"Principiante"));
        clases.add(new Clase("ESQUI",50,"Principiante"));
        clases.add(new Clase("RAQUETAS",25,"Avanzado"));

/**
 * Agregar TECNICOS a la ARRAYLIST DE EMPLEADOS
 */

        empleados.add(new Tecnico("German",1500,8048754,cañones,telesillas,pistas,"kenobi"));
        empleados.add(new Tecnico("Miquel",1500,8012345,cañones,telesillas,pistas,"hola"));
        empleados.add(new Tecnico("Dimitri",1500,8078948,cañones,telesillas,pistas,"adeu"));
        empleados.add(new Tecnico("Marcos",1500,80789456,cañones,telesillas,pistas,"123456"));
        /**
         * Agregar MONITORES a la ARRAYLIST DE EMPLEADOS
         */

        empleados.add(new Monitor("Andrea",1000,8047985,"SNOWBOARD","snow123"));
        empleados.add(new Monitor("Raul",1000,8047985,"ESQUI","esqui123"));
        empleados.add(new Monitor("Adria",1000,8047985,"RAQUETAS","raq123"));
        /**
         * Agregar EMPLEADOS a la ARRAYLIST DE EMPLEADOS
         */
        empleados.add(new Responsable("Steve",3000,801234,"res",empleados));



        boolean exitadmin = false;
        Scanner scanadmin = new Scanner(System.in);

        while (!exitadmin){
            System.out.println("¿Quien eres?");
            System.out.println("1- Cliente");
            System.out.println("2- Empleado");
            System.out.println(".. -Salir ");

            Persona cliente = new Cliente("");
            int x = scanadmin.nextInt();
            switch (x){
                case 1:

                    Boolean exitcliente = false;
                    while (!exitcliente){

                        System.out.println("1- Comprar Forfait");
                        System.out.println("2-Clases prácticas");
                        System.out.println("3-Adquirir clase práctica");
                        System.out.println(".. -Salir ");

                        int y = scanadmin.nextInt();
                        switch (y){
                            case 1:
                                System.out.println("Por favor ingrese su Nombre");

                                String nombrecliente = scanadmin.next();
                                Pattern pat = Pattern.compile("([a-z]+)");
                                Matcher mat = pat.matcher(nombrecliente);
                                if (mat.find()) {
                                    cliente.setNom(nombrecliente);

                                    ((Cliente) cliente).comprarForfait();
                                    clientes.add(cliente);
                                } else {
                                    System.out.println("Nombre no Válido");
                                }

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
                                        default:
                                            System.out.println("hola");
                                            exitmonitor = true;
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
                                    System.out.println("7- Ver todos los clientes");
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
                                        case 7:
                                            clientes.forEach(c -> System.out.println(c));
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


