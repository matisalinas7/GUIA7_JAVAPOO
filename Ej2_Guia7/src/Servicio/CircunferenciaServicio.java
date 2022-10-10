package Servicio;

import Entidades.Circunferencia;
import java.util.Scanner;

public class CircunferenciaServicio {

    Scanner input = new Scanner(System.in);

    public Circunferencia crearCircunferencia() {

        Circunferencia c1 = new Circunferencia();

        System.out.print("Ingrese el radio de la circunferencia: ");
        c1.setRadio(input.nextDouble());

        return c1;

    }

    public void area(Circunferencia c1) {

        Double retornoArea = (Math.PI * c1.getRadio() * c1.getRadio());
        System.out.println("\n- El area de la circunferencia es: " + retornoArea);

    }

    public void perimetro(Circunferencia c1) {

        Double retornoPerimetro = (2 * 3.14 * c1.getRadio());
        System.out.println("- El perimetro de la circunferencia es: " + retornoPerimetro + "\n");

    }

}
