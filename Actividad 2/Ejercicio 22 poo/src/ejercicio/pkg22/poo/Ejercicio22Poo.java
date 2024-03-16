package ejercicio.pkg22.poo;

import java.util.Scanner;

public class Ejercicio22Poo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.println("Ingrese el nombre del empleado:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el salario basico por hora del empleado:");
        double salarioPorHora = scanner.nextDouble();
        System.out.println("Ingrese el numero de horas trabajadas en el mes:");
        int horasTrabajadas = scanner.nextInt();

        // Cálculo del salario mensual
        double salarioMensual = salarioPorHora * horasTrabajadas;

        // Mostrar el salario mensual si es mayor a $450.000
        if (salarioMensual > 450000) {
            System.out.println("Nombre del empleado: " + nombre);
            System.out.println("Salario mensual: $" + salarioMensual);
        } else {
            System.out.println("Nombre del empleado: " + nombre);
        }

    }
}
