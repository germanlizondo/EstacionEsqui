import administracion.Cliente;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

       Cliente cliente = new Cliente("german");
       cliente.comprarForfait();
        System.out.println( cliente.getForfait());

    }
}
