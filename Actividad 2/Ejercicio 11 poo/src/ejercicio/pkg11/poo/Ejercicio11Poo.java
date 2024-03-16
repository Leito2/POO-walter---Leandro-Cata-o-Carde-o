package ejercicio.pkg11.poo;

import java.util.Scanner;

public class Ejercicio11Poo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        double num2 = scanner.nextDouble();
        System.out.print("Ingrese el tercer numero: ");
        double num3 = scanner.nextDouble();

        // mayor de los tres números
        double mayor = num1;

        if (num2 > mayor) {
            mayor = num2;
        }

        if (num3 > mayor) {
            mayor = num3;
        }

        System.out.println("El mayor de los tres numeros es: " + mayor);
    }
}

