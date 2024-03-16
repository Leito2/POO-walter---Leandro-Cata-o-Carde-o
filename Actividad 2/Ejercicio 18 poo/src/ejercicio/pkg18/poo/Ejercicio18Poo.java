package ejercicio.pkg18.poo;

public class Ejercicio18Poo {

    public static void main(String[] args) {
        Empleado mi_empleado = new Empleado(100, 17284, 25, 2000, "Leandro Catano Cardeno");
        System.out.println(mi_empleado.getCodigo());
        System.out.println(mi_empleado.getNombres());
        System.out.println(mi_empleado.getSalarioBruto());
        System.out.println(mi_empleado.getSalarioNeto());

    }
    
}
