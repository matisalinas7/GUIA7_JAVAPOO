package Servicio;

import Entidades.Operacion;
import java.util.Scanner;

public class OperacionServicio {

    Scanner input = new Scanner(System.in);

    public Operacion crearOperacion() {

        Operacion o1 = new Operacion();

        System.out.print("Ingrese el primer numero: ");
        o1.setNumero1(input.nextInt());

        System.out.print("Ingrese el segundo numero: ");
        o1.setNumero2(input.nextInt());

        return o1;

    }

    public void sumar(Operacion o1) {

        int suma = o1.getNumero1() + o1.getNumero2();
        System.out.println("\n- SUMA: " + o1.getNumero1() + " + " + o1.getNumero2() + " = " + suma);

    }

    public void restar(Operacion o1) {

        int resta = o1.getNumero1() - o1.getNumero2();
        System.out.println("- RESTA: " + o1.getNumero1() + " - " + o1.getNumero2() + " = " + resta);

    }

    public void multiplicar(Operacion o1) {

        if (o1.getNumero1() != 0 && o1.getNumero2() != 0) {
            int mult = o1.getNumero1() * o1.getNumero2();
            System.out.println("- MULTIPLICACION: " + o1.getNumero1() + " x " + o1.getNumero2() + " = " + mult);
        } else {
            System.out.println("- MULTIPLICACION: ERROR " + o1.getNumero1() + " x " + o1.getNumero2() + " = 0");
        }

    }

    public void dividir(Operacion o1) {

        if (o1.getNumero2() != 0) {
            double div = (double) o1.getNumero1() / o1.getNumero2();
            System.out.println("- DIVISION: " + o1.getNumero1() + " / " + o1.getNumero2() + " = " + div + "\n");
        } else {
            System.out.println("- DIVISION: ERROR\n");
        }

    }

}
