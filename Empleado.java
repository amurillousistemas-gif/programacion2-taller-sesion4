public class Empleado {
    protected String cedula;
    protected String nombre;
    protected String dependencia;

    public Empleado(String cedula, String nombre, String dependencia) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.dependencia = dependencia;
    }

    public String resumen() {
        return "Cedula: " + cedula + " | Nombre: " + nombre + " | Dependencia: " + dependencia;
    }

    public double calcularPagoMensual() {
        return 0;
    }
}