package ejercicio.pkg23;

import java.util.Scanner;

public class Ejercicio23Poo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.println("Ingrese el valor de A:");
        double A = scanner.nextDouble();
        System.out.println("Ingrese el valor de B:");
        double B = scanner.nextDouble();
        System.out.println("Ingrese el valor de C:");
        double C = scanner.nextDouble();

        // Cálculo del discriminante
        double discriminante = B * B - 4 * A * C;

        // Comprobar si hay soluciones reales
        if (discriminante >= 0) {
            double x1 = (-B + Math.sqrt(discriminante)) / (2 * A);
            double x2 = (-B - Math.sqrt(discriminante)) / (2 * A);
            System.out.println("Las soluciones son:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else {
            System.out.println("La ecuación no tiene soluciones reales.");
        }

    }
}
