package Serie_I.POO.Eje1;

public class Persona {

    public String persona(String nombre, String apellido){
        return "Nombre: "+nombre+" Apellido: "+apellido;
    }

   public String persona(String nombre, String apellido, int edad){
        return  "Nombre: "+nombre+" Apellido: "+apellido+" Edad: "+edad;
   }

   public String persona(String nombre, String apellido, int edad, String nacionalidad){
        return  "Nombre: "+nombre+" Apellido: "+apellido+" Edad: "+edad+" País: "+nacionalidad;
   }

   public void persona(){
        String nombre = "Otto";
        System.out.println(nombre);
   }


}