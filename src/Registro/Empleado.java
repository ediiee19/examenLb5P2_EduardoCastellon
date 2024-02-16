
package Registro;

import java.util.Date;

public class Empleado extends Persona{
    private int anios;
    private String puesto;

    public Empleado() {
    }

    public Empleado(int anios, String puesto, String nombre, String contra, String sexo, String departamento, Date fechaNcimiento) {
        super(nombre, contra, sexo, departamento, fechaNcimiento);
        this.anios = anios;
        this.puesto = puesto;
    }

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Empleado{" + "anios=" + anios + ", puesto=" + puesto + '}';
    }

}
