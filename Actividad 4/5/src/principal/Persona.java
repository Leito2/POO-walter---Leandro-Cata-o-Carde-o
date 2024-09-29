package principal;

public class Persona {
    private String nombre;
    private String apellidos;
    private String teléfono;
    private String dirección;

    public Persona(String nombre, String apellidos, String teléfono, String dirección) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.teléfono = teléfono;
        this.dirección = dirección;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getTeléfono() {
        return teléfono;
    }

    public String getDirección() {
        return dirección;
    }
}
