package ejercicio.pkg19.poo;

import java.util.Scanner;

public class Ejercicio19Poo {
    public static void main(String[] args) {
        
        System.out.println("Ingrese el valor del lado del triangulo equilatero:");
        Scanner entrada = new Scanner(System.in);
        
        double lado, altura, perimetro, area;
        lado = entrada.nextDouble();
        
        Triangulo_Equilatero triangulo = new Triangulo_Equilatero(lado);
        altura = triangulo.calcualarAltura();
        perimetro = triangulo.calcualarPerimetro();
        area = triangulo.calcualarArea();
        
        System.out.println("El lado del triangulo equilatero es: " + lado + "y su altura es: " + altura);
        System.out.println("El perimetro del triangulo equilatero es: " + perimetro);
        System.out.println("El Area del triangulo equilatero es: " + area);
        
    }
}
