package Servicio;

import Entidades.Rectangulo;
import java.util.Scanner;

public class RectanguloServicio {

    Scanner input = new Scanner(System.in);

    public Rectangulo crearRectangulo() {

        Rectangulo r1 = new Rectangulo();

        System.out.print("\nIngrese la base que tendra el rectangulo: ");
        r1.setBase(input.nextInt());
        System.out.print("Ingrese la altura que tendra el rectangulo: ");
        r1.setAltura(input.nextInt());

        return r1;

    }

    public void superficie(Rectangulo r1) {

        int sup = r1.getBase() * r1.getAltura();
        System.out.println("\n- La superficie del rectangulo es: " + sup);

    }

    public void perimetro(Rectangulo r1) {

        int per = (r1.getBase() + r1.getAltura()) * 2;
        System.out.println("- El perimetro del rectangulo es: " + per + "\n");

    }

    public void imprimirRectangulo(Rectangulo r1) {

        for (int i = 0; i < r1.getAltura(); i++) {
            for (int j = 0; j < r1.getBase(); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("");

    }
}
