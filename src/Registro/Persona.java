package Registro;

import java.util.Date;
import java.util.Random;

/*nombre, apellido, contraseña, fecha de  
nacimiento, sexo, departamento (podrá elegir entre Francisco Morazán, Cortés y  Comayagua) 
y número de identidad (más adelante se explica que se hará con este  atributo).
 */
public class Persona {

    private String nombre, contra, sexo, departamento, identidad;
    private Date fechaNcimiento;

    public Persona() {
    }

    public Persona(String nombre, String contra, String sexo, String departamento, Date fechaNcimiento) {
        this.nombre = nombre;
        this.contra = contra;
        this.sexo = sexo;
        this.departamento = departamento;
        this.fechaNcimiento = fechaNcimiento;
        this.identidad = crearId();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public Date getFechaNcimiento() {
        return fechaNcimiento;
    }

    public void setFechaNcimiento(Date fechaNcimiento) {
        this.fechaNcimiento = fechaNcimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", contra=" + contra + ", sexo=" + sexo + ", departamento=" + departamento + ", identidad=" + identidad + ", fechaNcimiento=" + fechaNcimiento + '}';
    }

    public String crearId() {
        String id = "";

        if (departamento.equals("Francisco Morazán")) {
            String depId = "01";
            id = crearIdSegundo(depId);
        } else if (departamento.equals("Cortés")) {
            String depId = "02";
            id = crearIdSegundo(depId);
        } else if (departamento.equals("Comayagua")) {
            String depId = "03";
            id = crearIdSegundo(depId);
        } else {

        }

        return id;
    }

    public String crearIdSegundo(String dep) {
        Random r = new Random();

        String id = dep;
        String anio = String.valueOf(fechaNcimiento.getYear());
        id += anio;

        if (id.equalsIgnoreCase("01")) {
            String numR = String.valueOf(1 + r.nextInt(28));
            if (numR.length() == 1) {
                id += "0" + numR;
            } else {
                id += numR;
            }
        } else if (id.equalsIgnoreCase("02")) {
            String numR = String.valueOf(1 + r.nextInt(12));
            if (numR.length() == 1) {
                id += "0" + numR;
            } else {
                id += numR;
            }
        } else {
            String numR = String.valueOf(1 + r.nextInt(21));
            if (numR.length() == 1) {
                id += "0" + numR;
            } else {
                id += numR;
            }
        }

        for (int i = 0; i < 5; i++) {
            int numR = r.nextInt(9);
            id += numR;
        }

        return id;
    }

}
