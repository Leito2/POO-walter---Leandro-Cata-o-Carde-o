package ejercicio12;

public class Ejercicio12 {
    public static void main(String[] args) {
        int horas, salario_bruto;
        double salario_neto, retencion;
        horas = 48;
        salario_bruto = horas * 5000;
        retencion = salario_bruto * 1 / 8;
        salario_neto = salario_bruto - retencion;
        System.out.println("Salario en bruto: " + salario_bruto);
        System.out.println("Retencion en la fuente: " + retencion);
        System.out.println("Salario Neto: " + salario_neto);        
    }  
}
