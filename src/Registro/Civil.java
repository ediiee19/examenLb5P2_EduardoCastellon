package Registro;

import java.util.ArrayList;
import java.util.Date;

public class Civil extends Persona {

    public ArrayList<Tramite> tramites = new ArrayList();

    public Civil() {
        
    }

    public Civil(String nombre, String contra, String sexo, String departamento, Date fechaNcimiento) {
        super(nombre, contra, sexo, departamento, fechaNcimiento);
        this.tramites = new ArrayList();
    }

    public void agregarTramite(Tramite tramite) {
        tramites.add(tramite);
    }

    public ArrayList<Tramite> getTramites() {
        return tramites;
    }

    public void setTramites(ArrayList<Tramite> tramites) {
        this.tramites = tramites;
    }

    @Override
    public String toString() {
        return "Civil{" + "tramites=" + tramites + '}';
    }
}
