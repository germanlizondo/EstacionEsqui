package administracion;

import infraestructura.Cañon;
import infraestructura.Telesilla;

import java.util.ArrayList;

public class Tecnico extends Empleado{

    private ArrayList<Cañon> cañones;
    private ArrayList<Telesilla> telesillas;
    public Tecnico(String nom, int sueldo, int seguridadsocial) {
        super(nom, sueldo, seguridadsocial);
    }


    public void encender_apagar_cañon(int i,int nieve){
      if (this.cañones.get(i).isEncendido()) this.cañones.get(i).apagar();
      else this.cañones.get(i).encender(nieve);
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
