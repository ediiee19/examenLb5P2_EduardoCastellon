package Registro;

import java.util.Date;

/*nombre, apellido, contraseña, fecha de  
nacimiento, sexo, departamento (podrá elegir entre Francisco Morazán, Cortés y  Comayagua) 
y número de identidad (más adelante se explica que se hará con este  atributo).
 */
public class Persona {

    private String nombre, contra, sexo, departamento, identidad;
    private Date fechaNcimiento;

    public Persona() {
    }

    public Persona(String nombre, String contra, String sexo, String departamento, String identidad, Date fechaNcimiento) {
        this.nombre = nombre;
        this.contra = contra;
        this.sexo = sexo;
        this.departamento = departamento;
        this.identidad = identidad;
        this.fechaNcimiento = fechaNcimiento;
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

}
