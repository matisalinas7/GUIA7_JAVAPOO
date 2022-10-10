package Servicio;

import Entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

public class AhorcadoServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void juego(Ahorcado juego) {

        System.out.println("");

        String[] adivinadas = new String[juego.getPalabraBuscar().length];
        Arrays.fill(adivinadas, "_");

        for (String adivinada : adivinadas) {
            System.out.print(adivinada + " ");
        }

        System.out.println("");

        boolean acierto;

        do {
            System.out.print("\n- Ingrese una letra: ");
            String letra = sc.next();
            buscar(juego, letra, adivinadas);

            System.out.println("\n------------------------------------------------------------");
            System.out.println("- Longitud de la palabra: " + longitud(juego));

            acierto = encontradas(juego, letra);

            intentos(juego, acierto);

            System.out.println("------------------------------------------------------------");
        } while ((juego.getMaxJugadas() > 0) && (longitud(juego) - juego.getEncontradas() != 0));

        if (longitud(juego) - juego.getEncontradas() == 0) {
            System.out.println("\n >>>>> FELICITACIONES!!!, HAS GANADO :)\n");
        } else if (juego.getMaxJugadas() == 0 && juego.getEncontradas() != longitud(juego)) {
            System.out.println("\n >>>>> LO SIENTO, HAS PERDIDO :(\n");
        }
    }

    public Ahorcado crearJuego() {

        String[] palabraBuscar;
        String palabra;
        int encontradas = 0;
        int maxJugadas;

        System.out.println("******************************");
        System.out.println("********** AHORCADO **********");
        System.out.println("******************************");
        System.out.print("\n- Para comenzar, ingrese la palabra: ");
        palabra = sc.next();

        palabraBuscar = palabra.split("");

        System.out.print("- Ingrese la cantidad de jugadas máximas: ");
        maxJugadas = sc.nextInt();

        Ahorcado juego = new Ahorcado(palabraBuscar, maxJugadas, encontradas);

        return juego;
    }

    public int longitud(Ahorcado juego) {

        int longPalabra = juego.getPalabraBuscar().length;
        return longPalabra;

    }

    public void buscar(Ahorcado juego, String letra, String[] adivinadas) {

        boolean acierto = false;

        for (int i = 0; i < longitud(juego); i++) {

            if (juego.getPalabraBuscar()[i].equalsIgnoreCase(letra)) {
                adivinadas[i] = letra;
                acierto = true;
            }
            System.out.print(adivinadas[i] + " ");
        }
        
        System.out.println("");
        
        if (acierto == true) {
            System.out.println("\n>>> LETRA ACERTADA!");
        } else {
            System.out.println("\n>>> LETRA NO ACERTADA");
        }
    }

    public boolean encontradas(Ahorcado juego, String letra) {

        boolean acierto = false;

        for (int i = 0; i < longitud(juego); i++) {

            if (juego.getPalabraBuscar()[i].equalsIgnoreCase(letra)) {
                juego.setEncontradas(juego.getEncontradas() + 1);
                acierto = true;
            }

        }
        System.out.println("- Letras (encontradas / restantes) >>> (" + juego.getEncontradas() + " / " + (longitud(juego) - juego.getEncontradas()) + ")");

        return acierto;

    }

    public void intentos(Ahorcado juego, boolean acierto) {

        if (acierto == false) {
            juego.setMaxJugadas(juego.getMaxJugadas() - 1);
        }

        System.out.println("- Intentos restantes: " + juego.getMaxJugadas());

    }

}
