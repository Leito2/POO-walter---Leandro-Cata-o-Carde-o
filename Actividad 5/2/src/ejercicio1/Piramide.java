package Figuras;

public class Piramide extends FiguraGeometrica {
    private double base;
    private double altura;
    private double apotema;

    public Piramide(double base, double altura, double apotema) {
        this.base = base;
        this.altura = altura;
        this.apotema = apotema;
    }

    @Override
    public double calcularVolumen() {
        return (1.0 / 3) * Math.pow(base, 2) * altura;
    }

    @Override
    public double calcularSuperficie() {
        return Math.pow(base, 2) + 2 * base * apotema;
    }
}
