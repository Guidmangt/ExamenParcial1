package Serie_I.POO.Eje1;
// Sobrecarga de Métodos
public class Imprimir {

    public static void main(String[] args) {
        System.out.print("\n***Ejemplos***\n");


        Persona persona1 = new Persona();
        System.out.println(persona1.persona("Carlos", "Enrique")); 
        System.out.println(persona1.persona("Manuel", "Mejía", 20));
        System.out.println(persona1.persona("Manuel", "Mejía", 20, "Guatemala"));  
        persona1.persona();

    }
}