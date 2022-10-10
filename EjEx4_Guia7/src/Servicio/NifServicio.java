package Servicio;

import Entidades.Nif;
import java.util.Scanner;

public class NifServicio {

    Scanner sc = new Scanner(System.in);

    public Nif crearNif() {

        Nif n = new Nif();

        System.out.println("***** CREACION DE NIF *****");
        System.out.print("- Ingrese DNI: ");
        n.setNumDNI(sc.nextLong());

        return n;

    }

    public String calcularDigito(Nif n) {

        String digito[] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        int posicion = (int) (n.getNumDNI() % 23);

        n.setLetra(digito[posicion]);

        return n.getLetra();

    }

    public void mostrar(Nif n) {
        System.out.println("\nNIF: " + n.getNumDNI() + "-" + calcularDigito(n) + "\n");
    }

}
