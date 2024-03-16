package ejercicio.pkg14.poo;

import java.util.Scanner;

public class Ejercicio14Poo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los importes de ventas de los departamentos
        System.out.println("Ingrese el importe de ventas para el departamento 1:");
        double ventas1 = scanner.nextDouble();

        System.out.println("Ingrese el importe de ventas para el departamento 2:");
        double ventas2 = scanner.nextDouble();

        System.out.println("Ingrese el importe de ventas para el departamento 3:");
        double ventas3 = scanner.nextDouble();

        // Solicitar el salario
        System.out.println("Ingrese el salario de los vendedores:");
        double salario = scanner.nextDouble();

        // Calcular las ventas totales
        double ventasTotales = ventas1 + ventas2 + ventas3;

        // Calcular el monto adicional del 20% del salario mensual
        double montoAdicional = 0.2 * salario;

        // Determinar el salario total
        double salarioDepartamento1 = salario;
        double salarioDepartamento2 = salario;
        double salarioDepartamento3 = salario;

        // Verificar si excede el 33% de las ventas totales
        if (ventas1 > 0.33 * ventasTotales) {
            salarioDepartamento1 += montoAdicional;
        }

        if (ventas2 > 0.33 * ventasTotales) {
            salarioDepartamento2 += montoAdicional;
        }

        if (ventas3 > 0.33 * ventasTotales) {
            salarioDepartamento3 += montoAdicional;
        }

        System.out.println("Salario recibido por el departamento 1: $" + salarioDepartamento1);
        System.out.println("Salario recibido por el departamento 2: $" + salarioDepartamento2);
        System.out.println("Salario recibido por el departamento 3: $" + salarioDepartamento3);

    }
}
