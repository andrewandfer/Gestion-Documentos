package co.edu.uniquindio.poo;

public class EmpleadoTiempoCompleto extends Empleado{
    private double SalarioMensual;

public EmpleadoTiempoCompleto(double SalarioMensual,String nombre,String identificacion){
    super(nombre,identificacion);
    this.SalarioMensual=SalarioMensual;
}

public double getSalarioMensual() {
    return SalarioMensual;
}

public void setSalarioMensual(double salarioMensual) {
    SalarioMensual = salarioMensual;
}
public double calcularSalario(){
    return SalarioMensual;
}
@Override
public String toString() {
    return "EmpleadoTiempoCompleto [SalarioMensual=" + SalarioMensual+super.toString()+ "]";
}


}