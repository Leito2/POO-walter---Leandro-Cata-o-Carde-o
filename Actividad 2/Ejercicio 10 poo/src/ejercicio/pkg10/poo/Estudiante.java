package ejercicio.pkg10.poo;

import java.util.Scanner;

public class Estudiante {
    int numeroInscripcion;
    String nombres;
    double patrimonio;
    int estratoSocial;

    public Estudiante(int numeroInscripcion, String nombres, double patrimonio, int estratoSocial) {
        this.numeroInscripcion = numeroInscripcion;
        this.nombres = nombres;
        this.patrimonio = patrimonio;
        this.estratoSocial = estratoSocial;
    }

    public double calcularPagoMatricula() {
        double pagoBase = 50000;
        double incremento = 0;

        // incremento del 3%
        if (patrimonio > 2000000 && estratoSocial > 3) {
            incremento = patrimonio * 0.03;
        }

        return pagoBase + incremento;
    }

    public void mostrarDatosYPagoMatricula() {
        System.out.println("Numero de inscripcion: " + numeroInscripcion);
        System.out.println("Nombres: " + nombres);
        System.out.println("Pago de matricula: $" + calcularPagoMatricula());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // datos del estudiante
        System.out.print("Ingrese el numero de inscripcion: ");
        int numeroInscripcion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente
        System.out.print("Ingrese los nombres del estudiante: ");
        String nombres = scanner.nextLine();
        System.out.print("Ingrese el patrimonio del estudiante: ");
        double patrimonio = scanner.nextDouble();
        System.out.print("Ingrese el estrato social del estudiante: ");
        int estratoSocial = scanner.nextInt();

        Estudiante estudiante = new Estudiante(numeroInscripcion, nombres, patrimonio, estratoSocial);

        // Mostrar datos
        estudiante.mostrarDatosYPagoMatricula();
    }
}
