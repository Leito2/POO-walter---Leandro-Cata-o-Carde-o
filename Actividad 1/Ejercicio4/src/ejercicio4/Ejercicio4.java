package ejercicio4;

public class Ejercicio4 {
    public static void main(String[] args) {
        int edad_juan = 9;
        int edad_alberto, edad_ana, edad_mama;
        edad_alberto = (2*edad_juan)/3;
        edad_ana = (4*edad_alberto)/3;
        edad_mama = edad_juan + edad_alberto + edad_ana;
        
        System.out.println("Edad de Juan: " + edad_juan);
        System.out.println("Edad de Alberto: " + edad_alberto);
        System.out.println("Edad de Ana: " + edad_ana);
        System.out.println("Edad de Mama: " + edad_mama);
    }
}

