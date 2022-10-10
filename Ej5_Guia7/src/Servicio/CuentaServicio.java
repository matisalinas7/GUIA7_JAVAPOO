package Servicio;

import Entidades.Cuenta;
import java.util.Locale;
import java.util.Scanner;

public class CuentaServicio {

    Scanner input = new Scanner(System.in);

    public Cuenta crearCuenta() {

        input.useLocale(Locale.US);

        Cuenta c = new Cuenta();

        System.out.println("\n --- CUENTA BANCARIA ---\n");
        System.out.print("- Ingrese el DNI: ");
        c.setDniCliente(input.nextLong());
        System.out.print("- Ingrese el numero de cuenta: ");
        c.setNumeroCuenta(input.nextInt());
        c.setSaldoActual(Math.random() * 10000);

        return c;

    }

    public void ingresar(Cuenta c) {

        System.out.println("\n- Cuanto dinero desea ingresar?");
        double ingreso = input.nextDouble();

        c.setSaldoActual(ingreso + c.getSaldoActual());

    }

    public void retirar(Cuenta c) {

        System.out.println("\n- Cuanto dinero desea retirar?");
        double retiro = input.nextDouble();

        if (retiro > c.getSaldoActual()) {

            c.setSaldoActual(0);

        } else {

            c.setSaldoActual(c.getSaldoActual() - retiro);

        }

    }

    public void extraccionRapida(Cuenta c) {

        System.out.println("\n- Extrayendo 20% ...");
        c.setSaldoActual(c.getSaldoActual() - (c.getSaldoActual() * 0.20));

    }

    public void consultarSaldo(Cuenta c) {

        System.out.println("\n- Consultando saldo ....");
        System.out.print("- Saldo actual: $" + c.getSaldoActual() + "\n");

    }

    public void consultarDatos(Cuenta c) {

        System.out.println("\n- DNI: " + c.getDniCliente());
        System.out.println("- Numero de cuenta: " + c.getNumeroCuenta());

    }

}
