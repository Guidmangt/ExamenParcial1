package Serie_I.POO.Eje2.test;
import java.sql.*;
import Serie_I.POO.Eje2.*;

// Concepto de Herencia

public class Test {
public static void main(String[] args) {
    // Crear intancia de la clase Empleado
    Empleado empleado1 = new Empleado("Mario", 234);
    //imprimir los datos
    System.out.println(empleado1.toString());

    // Crear instancia de la clase Cliente
   Cliente cliente1 = new Cliente(new Date(1), true, "Luis", 'M',
     34, "Guatemala");
    // Imprimir
    System.out.println("\n"+cliente1.toString());
    
}

}
