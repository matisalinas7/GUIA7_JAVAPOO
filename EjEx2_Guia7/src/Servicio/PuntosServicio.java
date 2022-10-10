package Servicio;

import Entidades.Puntos;
import java.util.Scanner;

public class PuntosServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Puntos crearPuntos() {

        Puntos p = new Puntos();

        System.out.println("- Punto 1");
        System.out.print("- Ingrese x1: ");
        p.setX1(sc.nextInt());
        System.out.print("- Ingrese y1: ");
        p.setY1(sc.nextInt());
        System.out.println(">>> Punto 1 (" + p.getX1() + ", " + p.getY1() + ")");
        System.out.println("\n- Punto 2");
        System.out.print("- Ingrese x2: ");
        p.setX2(sc.nextInt());
        System.out.print("- Ingrese y2: ");
        p.setY2(sc.nextInt());
        System.out.println(">>> Punto 2 (" + p.getX2() + ", " + p.getY2() + ")");

        return p;

    }

    public double calcularDistancia(Puntos p) {

        return Math.sqrt(Math.pow((p.getX2() - p.getX1()), 2) + Math.pow((p.getY2() - p.getY1()), 2));

    }

}
