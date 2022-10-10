package Servicio;

import Entidades.Persona;
import java.util.Locale;
import java.util.Scanner;

public class PersonaServicio {

    Scanner input = new Scanner(System.in);

    public Persona crearPersona() {

        input.useLocale(Locale.US);

        Persona p = new Persona();

        System.out.print("- Ingrese su nombre: ");
        p.setNombre(input.nextLine());

        do {

            System.out.print("- Ingrese su sexo (H,M,O): ");
            p.setSexo(input.nextLine().toUpperCase());

            if (!"H".equals(p.getSexo()) && !"M".equals(p.getSexo()) && !"O".equals(p.getSexo())) {

                System.out.println("- Sexo invalido");

            }

        } while (!"H".equals(p.getSexo()) && !"M".equals(p.getSexo()) && !"O".equals(p.getSexo()));

        System.out.print("- Ingrese su edad: ");
        p.setEdad(input.nextInt());

        System.out.print("- Ingreso su peso (kg): ");
        p.setPeso(input.nextDouble());

        System.out.print("- Ingrese su altura (mts): ");
        p.setAltura(input.nextDouble());

        System.out.println("");

        return p;

    }

    public int calcularIMC(Persona p) {

        double imc = (p.getPeso() / (Math.pow(p.getAltura(), p.getAltura())));
        System.out.println("- IMC de " + p.getNombre() + " = " + imc);

        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }

    }

    public boolean esMayorDeEdad(Persona p) {

        return p.getEdad() >= 18;

    }

}
