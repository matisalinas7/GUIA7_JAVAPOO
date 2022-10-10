/* 6. Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad 
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos: 
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual 
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el 
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la 
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El 
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en 
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero. 
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo 
recibe y se añade a la cafetera la cantidad de café indicada. */
package ej6_guia7;

import Entidades.Cafetera;
import Servicio.CafeteraServicio;
import java.util.Scanner;

public class Ej6_Guia7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        CafeteraServicio cs = new CafeteraServicio();

        Cafetera c1 = cs.llenarCafetera();

        int opt = 0;

        System.out.println("--- CAFETERA (2000ml) ---");

        do {

            System.out.println("");
            System.out.println("1. Servir Taza");
            System.out.println("2. Vaciar Cafetera");
            System.out.println("3. Agregar Café");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");

            opt = input.nextInt();

            System.out.println("");

            switch (opt) {

                case 1:
                    cs.servirTaza(c1);
                    break;
                case 2:
                    cs.vaciarCafetera(c1);
                    break;
                case 3:
                    cs.agregarCafe(c1);
                    break;
            }

        } while (opt != 4);

    }

}
