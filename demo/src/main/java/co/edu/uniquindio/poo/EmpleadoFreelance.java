package co.edu.uniquindio.poo;

public class EmpleadoFreelance extends Empleado {
    private  int proyectoscompletados;
    private double pagoPorProyecto;

    public EmpleadoFreelance(int proyectoscompletados, double pagoPorProyecto, String nombre, String identificacion) {
        super(nombre, identificacion);
        this.proyectoscompletados=proyectoscompletados;
        this.pagoPorProyecto=pagoPorProyecto;
    }

    public int getProyectoscompletados() {
        return proyectoscompletados;
    }
    public double getPagoPorProyecto() {
        return pagoPorProyecto;
    }   
    public void setProyectoscompletados(int proyectoscompletados) {
        this.proyectoscompletados = proyectoscompletados;
    }
    public void setPagoPorProyecto(double pagoPorProyecto) {
        this.pagoPorProyecto = pagoPorProyecto;
    }

    public double calcularSalario() {
        return pagoPorProyecto * proyectoscompletados;
    }

    @Override
    public String toString() {
        return "EmpleadoFreelance [proyectoscompletados=" + proyectoscompletados + "pagoPorProyecto=" + pagoPorProyecto +"salario="+calcularSalario()+ super.toString() + "]";
    }

}