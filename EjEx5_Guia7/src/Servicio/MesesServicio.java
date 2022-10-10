package Servicio;

import Entidades.Meses;
import java.util.Scanner;

public class MesesServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void adivinarMes() {

        Meses m = new Meses();

        System.out.println("*** ADIVINE EL MES SECRETO ***");
        System.out.println("- Introduzca un mes (en minusculas):");
        String mesIntento = sc.nextLine();

        do {
            System.out.println("\n- No ha acertado. Intente nuevamente:");
            mesIntento = sc.nextLine();
        } while (!m.getMesSecreto().equals(mesIntento));

        System.out.println("\nHa acertado! :) \n");

    }

}
