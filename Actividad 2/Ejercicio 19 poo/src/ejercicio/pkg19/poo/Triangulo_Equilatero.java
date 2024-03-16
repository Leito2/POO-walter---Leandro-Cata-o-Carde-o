package ejercicio.pkg19.poo;

public class Triangulo_Equilatero {
    double lado;
    
    Triangulo_Equilatero(double lado) {
        this.lado = lado;
    }
    double calcualarPerimetro() {
        return lado*3;
    }
    double calcualarAltura() {
        return lado*Math.sqrt(3)/2;
    }
    double calcualarArea() {
        return Math.pow(lado, 2)*Math.sqrt(3)/4;
    }
    
}
