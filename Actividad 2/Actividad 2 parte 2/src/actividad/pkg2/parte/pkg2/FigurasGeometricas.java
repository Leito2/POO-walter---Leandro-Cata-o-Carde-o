package actividad.pkg2.parte.pkg2;

import java.util.Scanner;


class Circulo {
    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}


class Rectangulo {
    double base;
    double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    
    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return (base + altura) * 2;
    }
}


class Cuadrado {
    double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }


    public double calcularArea() {
        return lado * lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }
}

// Clase TriánguloRectangulo
class TrianguloRectangulo {
    double base;
    double altura;

    public TrianguloRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }


    public double calcularArea() {
        return (base * altura) / 2;
    }
    
    public double calcularHipotenusa() {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }

    public double calcularPerimetro() {
        double hipotenusa = calcularHipotenusa();
        return base + altura + hipotenusa;
    }

    public String determinarTipoTriangulo() {
        if (base == altura && altura == calcularHipotenusa()) {
            return "El triangulo no puede ser equilatero y rectangulo al mismo tiempo.";
        } else if (base == altura) {
            return "Isosceles";
        } else {
            return "Escaleno";
        }
    }
}

public class FigurasGeometricas {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Radio de circulo: ");
        double radio = scanner.nextDouble();
        System.out.println("Base del rectangulo: ");
        double baseR = scanner.nextDouble();
        System.out.println("Altura del rectangulo: ");
        double alturaR = scanner.nextDouble();
        System.out.println("Lado del cuadrado: ");
        double lado = scanner.nextDouble();
        System.out.println("Base del triangulo: ");
        double baseT = scanner.nextDouble();
        System.out.println("Altura del triangulo: ");
        double alturaT = scanner.nextDouble();

        
        Circulo circulo = new Circulo(radio);
        Rectangulo rectangulo = new Rectangulo(baseR, alturaR);
        Cuadrado cuadrado = new Cuadrado(lado);
        TrianguloRectangulo triangulo = new TrianguloRectangulo(baseT,alturaT);

        // Mostrar resultados
        System.out.println("Area del circulo: " + circulo.calcularArea());
        System.out.println("Perimetro del circulo: " + circulo.calcularPerimetro());

        System.out.println("Area del rectangulo: " + rectangulo.calcularArea());
        System.out.println("Perimetro del rectangulo: " + rectangulo.calcularPerimetro());

        System.out.println("Area del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Perimetro del cuadrado: " + cuadrado.calcularPerimetro());

        System.out.println("Area del triangulo: " + triangulo.calcularArea());
        System.out.println("Perimetro del triangulo: " + triangulo.calcularPerimetro());
        System.out.println("Hipotenusa del triangulo: " + triangulo.calcularHipotenusa());
        System.out.println("Tipo de triangulo: " + triangulo.determinarTipoTriangulo());
    }
}
