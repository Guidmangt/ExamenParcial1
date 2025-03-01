package Serie_I.POO.Eje2;

public class Empleado extends Persona {
    private int idEmpleado;
    private double sueldo;
    private static  int contadorEmpleado;

      public Empleado(String nombre, double sueldo){
        super(nombre);
        this.idEmpleado=++Empleado.contadorEmpleado;
        this.sueldo=sueldo;
    }

    
    public int getIdEmpleado() {
        return idEmpleado;
    }

     public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }


    @Override
    public String toString() {
    return "idEmpleado=" + idEmpleado+", Empleado [" + super.nombre+ 
          ", sueldo=" +sueldo+ "]";

        // return "idEmpleado=" + idEmpleado+", Empleado [nombre=" + nombre  + 
        //     ", sueldo=" +sueldo+ "]";
    }

    

}
