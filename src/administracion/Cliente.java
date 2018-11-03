package administracion;

import java.util.Scanner;

public class Cliente extends Persona {
    private Forfait forfait;

    public Cliente(String nom) {
        super(nom);
    }


    public void comprarForfait(){
        Scanner scanner = new Scanner(System.in);
        String seguro = "";
        boolean exit = false;
        while (!exit){
            System.out.println("¿Que administracion.Forfait desea comprar?" +
                    "\n "
                    + "1- Adulto - 50E"+
                    "\n "
                    + "1- Estudiante - 25E"+
                    "\n "
                    + "3- Menor - 15E"+
                    "\n "

            );
            int x = scanner.nextInt();
            switch (x){
                case 1:
                    this.forfait = new Forfait(50,false,"adulto");
                    System.out.println("1");
                    exit = true;
                    break;
                case 2:
                    this.forfait = new Forfait(25,false,"estudiante");
                    System.out.println("2");
                    exit = true;
                    break;
                case 3:
                    this.forfait = new Forfait(15,false,"menor");
                    System.out.println("3");
                    exit = true;
                    break;

                default:
                    System.out.println("Selecciona una opción");
            }

        }




        do {
            System.out.println("¿Quiere Seguro? y/n");
            seguro = scanner.next();
        }while (!seguro.equals("y") && !seguro.equals("n") );


        if(seguro.equals("y")){
            String dni = "";
            do {
                System.out.println("Escriba el DNI");
               dni = scanner.next().toUpperCase();
                this.forfait.validarDni(dni);

            }while (!this.forfait.validarDni(dni));


            this.forfait.setDni(dni);
            super.setDNI(dni);
            this.forfait.setSeguro(true);
        }
        else this.forfait.setSeguro(false);



    }


    //GETTERS && SETTERS


    public Forfait getForfait() {
        return forfait;
    }


}