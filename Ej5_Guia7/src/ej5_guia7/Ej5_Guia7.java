/* 5. Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos: 
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las 
operaciones asociadas a dicha clase son: 
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes 
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar 
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la 
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el 
saldo actual en 0. 
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el 
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta. 
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
package ej5_guia7; */
package ej5_guia7;

import Entidades.Cuenta;
import Servicio.CuentaServicio;
import java.util.Scanner;

public class Ej5_Guia7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        CuentaServicio cs = new CuentaServicio();
        Cuenta c1 = cs.crearCuenta();

        int opt = 0;

        do {
            System.out.println("");
            System.out.println("- Elija una opcion");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Extraccion rapida (20%)");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Consultar datos");
            System.out.println("6. Salir");
            System.out.print("- Opcion: ");
            opt = input.nextInt();

            switch (opt) {

                case 1:
                    cs.ingresar(c1);
                    break;
                case 2:
                    cs.retirar(c1);
                    break;
                case 3:
                    cs.extraccionRapida(c1);
                    break;
                case 4:
                    cs.consultarSaldo(c1);
                    break;
                case 5:
                    cs.consultarDatos(c1);
                    break;

            }

        } while (opt != 6);

        System.out.println("");

    }

}
