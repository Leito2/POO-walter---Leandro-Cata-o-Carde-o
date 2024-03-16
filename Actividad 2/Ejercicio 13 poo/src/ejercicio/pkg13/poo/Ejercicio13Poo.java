package ejercicio.pkg13.poo;

import java.util.Scanner;

public class Ejercicio13Poo {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el valor de la compra
        System.out.print("Ingrese el valor de la compra: ");
        double valorCompra = scanner.nextDouble();

        System.out.print("Ingrese el color de la bolita: ");
        String colorBolita = scanner.next();

        // Calcular descuento
        double descuento = 0;
        switch (colorBolita) {
            case "v":
                descuento = 0.1;
                break;
            case "am":
                descuento = 0.25;
                break;
            case "az":
                descuento = 0.5;
                break;
            case "r":
                descuento = 1.0;
                break;
            default:
                // Descuento queda como 0
                break;
        }

        double valorPagar = valorCompra * (1 - descuento);

        System.out.println("Valor de pago: $" + valorPagar);
    }
}
