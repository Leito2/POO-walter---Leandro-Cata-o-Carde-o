package ejercicio.pkg24.poo;

import java.util.Scanner;

public class Ejercicio24Poo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.println("Ingrese el peso de la esfera A:");
        double pesoA = scanner.nextDouble();
        System.out.println("Ingrese el peso de la esfera B:");
        double pesoB = scanner.nextDouble();
        System.out.println("Ingrese el peso de la esfera C:");
        double pesoC = scanner.nextDouble();

        // Determinar la esfera de mayor peso
        if (pesoA > pesoB && pesoA > pesoC) {
            System.out.println("La esfera A es la de mayor peso.");
        } else if (pesoB > pesoA && pesoB > pesoC) {
            System.out.println("La esfera B es la de mayor peso.");
        } else if (pesoC > pesoA && pesoC > pesoB) {
            System.out.println("La esfera C es la de mayor peso.");
        } else {
            System.out.println("Hay al menos dos esferas con el mismo peso máximo.");
        }

    }
}
