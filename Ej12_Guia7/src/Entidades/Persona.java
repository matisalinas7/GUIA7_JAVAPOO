package Entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Persona {

    private String nombre;
    private Date fechaNac;

    SimpleDateFormat dateForm = new SimpleDateFormat("dd/MM/Y");

    public Persona() {
    }

    public Persona(String nombre, Date fechaNac) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "\nPersona { " + "nombre: " + nombre + ", fecha de nacimiento: " + dateForm.format(fechaNac) + " }\n";
    }

}
