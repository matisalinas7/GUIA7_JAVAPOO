package Servicio;

import Entidades.Cadena;
import java.util.Scanner;

public class CadenaServicio {

    Scanner sc = new Scanner(System.in);

    public void mostrarVocales(Cadena c) {

        int contVocales = 0;

        for (int i = 0; i < c.getLongitud(); i++) {

            if (c.getFrase().charAt(i) == 'a' || c.getFrase().charAt(i) == 'e' || c.getFrase().charAt(i) == 'i' || c.getFrase().charAt(i) == 'o' || c.getFrase().charAt(i) == 'u') {

                contVocales++;

            }

        }

        if (contVocales == 1) {
            
            System.out.println("\n- Contando vocales...");
            System.out.println(">>> Hay 1 vocal en la frase ingresada.");

        } else {

            System.out.println("\n- Contando vocales...");
            System.out.println(">>> Hay " + contVocales + " vocales en la frase ingresada.");

        }

    }

    public void invertirFrase(Cadena c) {

        String fraseInvertida = "";

        for (int i = c.getLongitud() - 1; i >= 0; i--) {

            fraseInvertida += c.getFrase().charAt(i);

        }

        System.out.println("\n- Inviertiendo frase...");
        System.out.println(">>> Frase entrada: " + c.getFrase() + ", Frase salida: " + fraseInvertida);

    }

    public void vecesRepetido(Cadena c) {

        System.out.print("\n- Ingrese un carácter para contabilizar las veces que se repite: ");
        String caracter = sc.nextLine();

        int contador = 0;

        for (int i = 0; i < c.getLongitud(); i++) {

            if (c.getFrase().charAt(i) == caracter.charAt(0)) {
                contador++;
            }

        }

        if (contador == 1) {

            System.out.println(">>> El carácter " + caracter + " se repite 1 vez.");

        } else {

            System.out.println(">>> El carácter " + caracter + " se repite " + contador + " veces.");

        }

    }

    public void compararLongitud(Cadena c) {

        System.out.print("\n- Ingrese una nueva frase para comparar su longitud con la de la frase anterior: ");
        String frase2 = sc.nextLine();

        int longitud = frase2.length();

        System.out.println(">>> Longitud primer frase: " + c.getLongitud() + ", longitud frase nueva: " + longitud);

        if (longitud > c.getLongitud()) {
            System.out.println(">>> La frase: " + frase2 + " es más larga que la frase: " + c.getFrase());
        } else if (c.getLongitud() > longitud) {
            System.out.println(">>> La frase: " + c.getFrase() + " es más larga que la frase: " + frase2);
        } else {
            System.out.println(">>> La frase: " + frase2 + " igual de larga que la frase: " + c.getFrase());
        }

    }

    public void unirFrases(Cadena c) {

        System.out.print("\n- Ingrese una nueva frase para ser unida con la frase anterior: ");
        String nuevaFrase = sc.nextLine();

        String fraseUnida = c.getFrase().concat(nuevaFrase);

        System.out.println(">>> Frase resultante: " + fraseUnida);

    }

    public void reemplazar(Cadena c) {

        System.out.print("\n- ¿Por qué letra desea reemplazar las a de la frase?: ");
        String letraReemplazo = sc.nextLine();

        String nuevaCad = "";
        boolean encontrarA = false;

        for (int i = 0; i < c.getLongitud(); i++) {

            if (c.getFrase().charAt(i) == 'a') {
                nuevaCad += letraReemplazo;
                encontrarA = true;
            } else {
                nuevaCad += c.getFrase().charAt(i);
            }
        }

        if (encontrarA = true) {
            System.out.println(">>> Frase resultante reemplazando las a por " + letraReemplazo + ": " + nuevaCad);

        } else {
            System.out.println(">>> No hay letras a para poder reemplazar la frase: " + c.getFrase());
        }

    }

    public boolean contiene(Cadena c) {
        boolean contiene = false;

        System.out.print("\n- Ingrese una letra para saber si la frase ingresada la contiene o no: ");
        String letra = sc.nextLine();

        for (int i = 0; i < c.getLongitud(); i++) {
            if (c.getFrase().charAt(i) == letra.charAt(0)) {
                contiene = true;
            }
        }

        return contiene;

    }

}
