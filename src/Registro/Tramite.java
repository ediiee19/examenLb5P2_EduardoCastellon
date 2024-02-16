
package Registro;

import java.util.Date;

public class Tramite {
    private String nombre, desc, identidad;
    private Date fecha;

    public Tramite(String nombre, String desc, String identidad, Date fecha) {
        this.nombre = nombre;
        this.desc = desc;
        this.identidad = identidad;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Tramite{" + "nombre=" + nombre + ", desc=" + desc + ", identidad=" + identidad + ", fecha=" + fecha + '}';
    }
    
    
}
