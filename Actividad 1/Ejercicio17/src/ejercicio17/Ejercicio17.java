package ejercicio17;
import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        double radio, area, perimetro;
        System.out.println("Dar una longitud para el radio del circulo:");
        Scanner entrada = new Scanner(System.in);
        radio = entrada.nextDouble();
        area = Math.PI * Math.pow(radio, 2);
        perimetro = 2 * Math.PI * radio;
        System.out.println("El area del circulo es: " + area);
        System.out.println("La longitud de la circunferencia es: " + perimetro);
    }
}
