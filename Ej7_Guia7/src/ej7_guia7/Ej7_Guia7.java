/* 7. Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo 
('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro 
atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al 
usuario y después se le asignan a sus respectivos atributos para llenar el objeto 
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. 
Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en 
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa 
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la 
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona 
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la 
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la 
función devuelve un 1. 
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve 
un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos 
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene 
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es 
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en 
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y 
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores. */
package ej7_guia7;

import Entidades.Persona;
import Servicio.PersonaServicio;

public class Ej7_Guia7 {

    public static void main(String[] args) {

        // Creo objeto de Servicio de Personas (ps) como Array.
        PersonaServicio[] ps = new PersonaServicio[4];

        int pesoXdebajo = 0;
        int pesoIdeal = 0;
        int pesoXencima = 0;
        int mayEdad = 0;
        int menEdad = 0;

        for (int i = 0; i < 4; i++) {

            ps[i] = new PersonaServicio();

            System.out.println("----------------------------------------------------------\n");
            Persona p = ps[i].crearPersona();

            switch (ps[i].calcularIMC(p)) {
                case -1:
                    System.out.println("- " + p.getNombre() + " está por debajo de su peso ideal.");
                    pesoXdebajo++;
                    break;
                case 0:
                    System.out.println("- " + p.getNombre() + " está en su peso ideal.");
                    pesoIdeal++;
                    break;
                case 1:
                    System.out.println("- " + p.getNombre() + " está por encima de su peso ideal.");
                    pesoXencima++;
                    break;
            }

            if (ps[i].esMayorDeEdad(p)) {
                System.out.println("- " + p.getNombre() + " es mayor de edad.\n");
                mayEdad++;
            } else {
                System.out.println("- " + p.getNombre() + " es menor de edad.\n");
                menEdad++;
            }

        }

        System.out.println("----------------------------------------------------------");
        System.out.println("\n- " + (pesoXdebajo * 25) + "% se encuentran por debajo de su peso ideal.");
        System.out.println("- " + (pesoIdeal * 25) + "% se encuentran en su peso ideal.");
        System.out.println("- " + (pesoXencima * 25) + "% se encuentran por encima de su peso ideal.");
        System.out.println("\n- " + (mayEdad * 25) + "% son mayores de edad.");
        System.out.println("- " + (menEdad * 25) + "% son menores de edad.");
        System.out.println("\n----------------------------------------------------------\n");

    }

}
