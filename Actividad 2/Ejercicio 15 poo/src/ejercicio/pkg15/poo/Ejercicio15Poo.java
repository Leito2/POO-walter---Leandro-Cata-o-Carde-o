package ejercicio.pkg15.poo;

import java.util.Scanner;

public class Ejercicio15Poo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el peso de la esfera A:");
        double pesoA = scanner.nextDouble();

        System.out.println("Ingrese el peso de la esfera B:");
        double pesoB = scanner.nextDouble();

        System.out.println("Ingrese el peso de la esfera C:");
        double pesoC = scanner.nextDouble();

        System.out.println("Ingrese el peso de la esfera D:");
        double pesoD = scanner.nextDouble();

        // Comparar el peso de las esferas dos a dos
        char esferaDiferente = ' ';
        double pesoDiferente = 0.0;

        if (pesoA == pesoB) {
            esferaDiferente = 'C';
            pesoDiferente = pesoC;
        } else if (pesoA == pesoC) {
            esferaDiferente = 'B';
            pesoDiferente = pesoB;
        } else if (pesoA == pesoD) {
            esferaDiferente = 'C';
            pesoDiferente = pesoC;
        } else if (pesoB == pesoC) {
            esferaDiferente = 'A';
            pesoDiferente = pesoA;
        } else if (pesoB == pesoD) {
            esferaDiferente = 'A';
            pesoDiferente = pesoA;
        } else if (pesoC == pesoD) {
            esferaDiferente = 'A';
            pesoDiferente = pesoA;
        }

        // Determinar si es más pesada o más liviana
        String mensaje = "La esfera " + esferaDiferente + " es diferente y ";

        if (pesoDiferente > Math.min(Math.min(pesoA, pesoB), Math.min(pesoC, pesoD))) {
            mensaje += "es más pesada que las otras tres.";
        } else {
            mensaje += "es más liviana que las otras tres.";
        }

        System.out.println(mensaje);

    }
}
