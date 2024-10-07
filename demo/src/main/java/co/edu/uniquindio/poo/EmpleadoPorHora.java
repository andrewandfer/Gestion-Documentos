package co.edu.uniquindio.poo;

public class EmpleadoPorHora extends Empleado {
   private double SalarioHora;
   private double horasTrabajadas;

   public EmpleadoPorHora(double SalarioHora, String nombre, String identificacion) {
      super(nombre, identificacion);
      this.SalarioHora = SalarioHora;
      this.horasTrabajadas = 0.0;
   }

   public double getSalarioHora() {
      return this.SalarioHora;
   }

   public void setSalarioHora(double salarioHora) {
      this.SalarioHora = salarioHora;
   }

   public double getHorasTrabajadas() {
      return this.horasTrabajadas;
   }

   public void setHorasTrabajadas(double horasTrabajadas) {
      this.horasTrabajadas = horasTrabajadas;
   }

   public String toString() {
      double var10000 = this.SalarioHora;
      return "EmpleadoPorHora [SalarioHora=" + var10000 + "horasTrabajadas=" + this.horasTrabajadas + super.toString() + "]";
   }

   public double calcularSalario() {
      return this.SalarioHora * this.horasTrabajadas;
   }
}
