package ejercicio.pkg21.poo;

public class Triangulo {
    double lado1;
    double lado2;
    double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double calcularSemiperimetro() {
        return (lado1 + lado2 + lado3) / 2;
    }

    public double calcularArea() {
        double sp = calcularSemiperimetro();
        return Math.sqrt(sp * (sp - lado1) * (sp - lado2) * (sp - lado3));
    }

    public double calcularAltura() {
        double area = calcularArea();
        return (2 * area) / lado1; // Altura desde el lado 1
    }

    public static void main(String[] args) {
        double lado1 = 4.0;
        double lado2 = 3.0;
        double lado3 = 5.0;

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

        System.out.println("Semiperimetro: " + triangulo.calcularSemiperimetro());
        System.out.println("Altura: " + triangulo.calcularAltura());
        System.out.println("area: " + triangulo.calcularArea());
    }
}
