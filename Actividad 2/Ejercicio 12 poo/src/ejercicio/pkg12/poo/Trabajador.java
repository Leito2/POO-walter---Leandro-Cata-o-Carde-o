package ejercicio.pkg12.poo;

import java.util.Scanner;

public class Trabajador {
    String nombres;
    int horasTrabajadas;
    double valorHoraNormal;

    // Constructor
    public Trabajador(String nombres, int horasTrabajadas, double valorHoraNormal) {
        this.nombres = nombres;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHoraNormal = valorHoraNormal;
    }

    // salario del trabajador (metodo)
    public double calcularSalario() {
        double salario = 0;

        if (horasTrabajadas <= 40) {
            salario = horasTrabajadas * valorHoraNormal;
        } else {
            int horasNormales = 40;
            int horasExtras = horasTrabajadas - horasNormales;

            if (horasExtras <= 8) {
                salario = horasNormales * valorHoraNormal + horasExtras * valorHoraNormal * 2;
            } else {
                int horasExtrasDobles = 8;
                int horasExtrasTriples = horasExtras - horasExtrasDobles;

                salario = horasNormales * valorHoraNormal
                        + horasExtrasDobles * valorHoraNormal * 2
                        + horasExtrasTriples * valorHoraNormal * 3;
            }
        }

        return salario;
    }
    
    public String getNombres() {
        return this.nombres;
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresar nombres del trabajador: ");
        String nombres = scanner.nextLine();
        System.out.println("Ingresar numero de horas: ");
        int horas = scanner.nextInt();
        System.out.println("Ingresar valor por hora trabajada: ");
        double valorPorHora = scanner.nextDouble();
        
        Trabajador trabajador = new Trabajador(nombres, horas, valorPorHora);
        
        System.out.println("Nombres del empleado" + trabajador.getNombres());
        System.out.println("Salario: " + trabajador.calcularSalario());
    }
}
