package Servicio;

import Entidades.Cancion;
import java.util.Scanner;

public class CancionServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Cancion cargarCancion() {

        Cancion c = new Cancion();

        System.out.print("\n- Ingrese el titulo de la cancion: ");
        c.setTitulo(sc.nextLine());
        System.out.print("- Ingrese el autor de la cancion: ");
        c.setAutor(sc.nextLine());

        return c;

    }

    public void mostrarCancion(Cancion c) {

        System.out.println("\n" + c.toString() + "\n");

    }

}
