package clase02;

public class Empleado {
    private int nroLegajo;
    private String nombre;
    private String apellido;
    private double sueldoBasico;
    
    // el IDE factorice el BEAN 

    public Empleado(int nroLegajo, String nombre, String apellido, double sueldoBasico) {
        this.nroLegajo = nroLegajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico = sueldoBasico;
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nroLegajo=" + nroLegajo + ", nombre=" + nombre + ", apellido=" + apellido + ", sueldoBasico=" + sueldoBasico + '}';
    }

    
}
