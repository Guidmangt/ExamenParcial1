package mipatito_2;

import dominio.PoliticaDeContrasenas;

public class Imprimir {

    public static void main(String[] args) {
        // ejemplo de politica de contraseñas
        PoliticaDeContrasenas politica = new PoliticaDeContrasenas(
                true, 1, // Al menos 2 dígitos
                true, 1, //Al menos 1 mayúscula
                true, 1, // Al menos 1 minúscula
                true, 1, // Al menos 1 carácter especial
                8); // Longitud mínima de 8 caracteres
        
        // Generar y mostrar la contraseña
        System.out.println("Contraseña generada: " + PasswordGenerator.generatePassword(politica));
    }
}
