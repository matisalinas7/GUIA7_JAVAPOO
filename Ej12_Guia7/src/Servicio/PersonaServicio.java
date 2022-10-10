package Servicio;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaServicio {

    public Persona crearPersona() {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        Persona p = new Persona();

        int dia, mes, anio;

        System.out.print("\n- Ingrese su nombre: ");
        p.setNombre(sc.nextLine());

        System.out.println("\n- Ingrese su fecha de nacimiento");
        do {
            System.out.print("- Dia: ");
            dia = sc.nextInt();
        } while (dia < 1 || dia > 31);

        do {
            System.out.print("- Mes: ");
            mes = sc.nextInt();
        } while (mes < 1 || mes > 12);

        do {
            System.out.print("- Año: ");
            anio = sc.nextInt();
        } while (anio < 0 || anio > 2022);

        Date fecha = new Date(anio - 1900, mes - 1, dia);
        p.setFechaNac(fecha);

        return p;

    }

    public int calcularEdad(Persona p) {

        Date fechaActual = new Date();
        return fechaActual.getYear() - p.getFechaNac().getYear();

    }

    public boolean menorQue(Persona p, int edad) {

        return calcularEdad(p) < edad;

    }

    public void mostrarPersona(Persona p) {

        System.out.println(p.toString());

    }
}
