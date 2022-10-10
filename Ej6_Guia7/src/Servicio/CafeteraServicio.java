package Servicio;

import Entidades.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {

    Scanner input = new Scanner(System.in);

    public Cafetera llenarCafetera() {

        Cafetera c1 = new Cafetera();

        c1.setCapacidadMaxima(2000);
        c1.setCantidadActual(c1.getCapacidadMaxima());

        return c1;

    }

    public void servirTaza(Cafetera c1) {

        System.out.print("- Ingrese el tamanio de la taza (ml): ");
        int tamTaza = input.nextInt();

        if (c1.getCantidadActual() < tamTaza) {

            System.out.println("\n- La taza no se llenó, café insuficiente!");
            System.out.println("- Se llenó hasta " + c1.getCantidadActual() + "ml.");
            c1.setCantidadActual(c1.getCantidadActual() - tamTaza);

        } else if (c1.getCantidadActual() > tamTaza || c1.getCantidadActual() == tamTaza) {

            c1.setCantidadActual(c1.getCantidadActual() - tamTaza);
            System.out.println("\n- La taza se llenó! ");

        }
    }

    public void vaciarCafetera(Cafetera c1) {

        c1.setCantidadActual(0);
        System.out.println("\n- Vaciando cafetera...");
        System.out.println("- Cafetera vacia");

    }

    public void agregarCafe(Cafetera c1) {

        System.out.println("- Cuanto café desea añadir? (ml)");
        int addCoffee = input.nextInt();

        if (c1.getCapacidadMaxima() < c1.getCantidadActual() + addCoffee) {

            System.out.println("\n- ERROR, la cantidad que desea añadir sobrepasa la capacidad máxima.");

        } else {

            c1.setCantidadActual(addCoffee);
            System.out.println("\n- Café añadido.");

        }

    }
}
