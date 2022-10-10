package Servicio;

import Entidades.Raices;
import java.util.Arrays;
import java.util.Scanner;

public class RaicesServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Raices crearRaiz() {

        Raices r = new Raices();

        System.out.println(">>> CALCULO DE ECUACION CUADRATICA PARA DETERMINAR RAICES <<<\n");
        System.out.println("- Se pediran datos para crear la formula x = (-b +- √b^2 - 4 . a . c) / 2 . a");
        System.out.print("- Ingrese el coeficiente a: ");
        r.setA(sc.nextDouble());
        System.out.print("- Ingrese el coeficiente b: ");
        r.setB(sc.nextDouble());
        System.out.print("- Ingrese el coeficiente c: ");
        r.setC(sc.nextDouble());

        return r;

    }

    public double getDiscriminante(Raices r) {

        double disc = (Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC());
        return disc;

    }

    public boolean tieneRaices(Raices r) {

        return getDiscriminante(r) > 0;

    }

    public boolean tieneRaiz(Raices r) {

        return getDiscriminante(r) == 0;

    }

    public double[] obtenerRaices(Raices r) {

        // disc = (b^2)-4*a*c 
        // x = (-b +- √((b^2) - (4 * a * c))) / (2 * a)
        double raices[] = new double[2];

        if (tieneRaices(r) == true) {

            raices[0] = (-r.getB() + Math.sqrt(getDiscriminante(r))) / (2 * r.getA());
            raices[1] = (-r.getB() - Math.sqrt(getDiscriminante(r))) / (2 * r.getA());

        }

        return raices;

    }

    public double obtenerRaiz(Raices r) {

        double raiz = -r.getB() / (2 * r.getA());

        return raiz;

    }

    public void calcular(Raices r) {

        if (tieneRaices(r) == true) {
            double[] raices = obtenerRaices(r);
            System.out.println("\n>>> Las raices de la ecuacion son: x1 = " + raices[0] + ", x2 = " + raices[1] + "\n");
        } else if (tieneRaiz(r) == true) {
            System.out.println("\n>>> La raiz de la ecuacion es: x = " + obtenerRaiz(r) + "\n");
        } else {
            System.out.println("\n>>> No existe solucion\n");
        }

    }

}
