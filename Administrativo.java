public class Administrativo extends Empleado {
    private double salarioBasico;
    private int diasVacaciones;

    public Administrativo(String cedula, String nombre, String dependencia,
                          double salarioBasico) {
        super(cedula, nombre, dependencia);
        this.salarioBasico = salarioBasico;
        this.diasVacaciones = 15;
    }

    public boolean tomarVacaciones(int dias) {
        if (dias <= 0) {
            System.out.println("Rechazado: los dias deben ser mayores a cero.");
            return false;
        }
        if (dias > diasVacaciones) {
            System.out.println("Rechazado: solicita " + dias + " dias y solo le quedan "
                    + diasVacaciones + ".");
            return false;
        }
        diasVacaciones -= dias;
        System.out.println("Aprobado: toma " + dias + " dias. Le quedan " + diasVacaciones + ".");
        return true;
    }

    @Override
    public double calcularPagoMensual() {
        return salarioBasico;
    }

    @Override
    public String resumen() {
        return super.resumen() + " | Salario basico: $" + String.format("%,.0f", salarioBasico)
                + " | Dias de vacaciones disponibles: " + diasVacaciones;
    }
}