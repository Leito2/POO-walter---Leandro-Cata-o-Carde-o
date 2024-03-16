package ejercicio.pkg18.poo;

public class Empleado {
    int horas, codigo;
    double porcentaje_retencion, valor_por_hora, salario_bruto, salario_neto;
    String nombres;
    public Empleado(int horas,int codigo, double porcentaje_retencion, double valor_por_hora, String nombres) {
        this.horas = horas;
        this.codigo = codigo;
        this.porcentaje_retencion = porcentaje_retencion;
        this.valor_por_hora = valor_por_hora;
        this.salario_bruto = salario_bruto;
        this.salario_neto = salario_neto;
        this.nombres = nombres;
    }
    
    public int getCodigo() {
        return codigo;
    }
    public String getNombres() {
        return nombres;
    }
    public double getSalarioBruto() {
        salario_bruto = horas*valor_por_hora;
        return salario_bruto;
    }
    public double getSalarioNeto() {
        salario_neto = salario_bruto - salario_bruto/100*porcentaje_retencion;
        return salario_neto;
    }
}
