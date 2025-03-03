package mipatito_2;

import dominio.PoliticaDeContrasenas;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PasswordGenerator {
 //atributos
    private static final String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    private static final String MAYUSCULAS = MINUSCULAS.toUpperCase();
    private static final String NUMEROS = "0123456789";
    private static final String ESPECIALES = "!@#$%^&*()_+-=[]{}|;:,.<>?";
    private static final SecureRandom ALEATORIO = new SecureRandom();

    // Método para generar la contraseña 
    public static String generatePassword(PoliticaDeContrasenas politica) {
        //Validar la longitud mínima
        if (politica.getMinLength() < 8) {
            throw new IllegalArgumentException("La longitud mínima de la contraseña debe ser al menos 8 caracteres");
        }
        

         // Crear una lista de caracteres para la contraseña  
        List<Character> passwordChars = new ArrayList<>();

        // añadir caracteres según las politicas
        if (politica.isRestrictMinDigits()) { // Restricción de mínimo de dígitos
            agregarCaracteresObligatorios(passwordChars, politica.getMinDigits(), NUMEROS);
        } else {
            passwordChars.add(getUnCaracterAleatorio(NUMEROS)); // Versión 1: Al menos un número
        }

        if (politica.isRestrictMinUpperCaseLetters()) { // Restricción de mínimo de letras mayúsculas
            agregarCaracteresObligatorios(passwordChars, politica.getMinUpperCaseLetters(), MAYUSCULAS);
        } else {
            passwordChars.add(getUnCaracterAleatorio(MAYUSCULAS)); // Versión 1: Al menos una mayúscula
        }

        if (politica.isRestrictMinLowerCaseLetters()) { // Restricción mínima de letras minúsculas
            agregarCaracteresObligatorios(passwordChars, politica.getMinLowerCaseLetters(), MINUSCULAS);
        } else {
            passwordChars.add(getUnCaracterAleatorio(MINUSCULAS)); // Versión 1: Al menos una minúscula
        }

        if (politica.isRestrictMinNonAlphanumericCharacters()) { //Restricción de mínimo de caracteres no alfanuméricos
            agregarCaracteresObligatorios(passwordChars, politica.getMinNonAlphanumericCharacters(), ESPECIALES);
        } else {
            passwordChars.add(getUnCaracterAleatorio(ESPECIALES)); // Versión 1: Al menos un carácter especial
        }

        // Añadir caracteres adicionales para cumplir con la longitud mínima
        String todosLosCaracteres = MINUSCULAS + MAYUSCULAS + NUMEROS + ESPECIALES;
        while (passwordChars.size() < politica.getMinLength()) {
            passwordChars.add(getUnCaracterAleatorio(todosLosCaracteres));
        }

        // Mezclar los caracteres para evitar patrones predecibles
        Collections.shuffle(passwordChars);

        // Construir la contraseña
        StringBuilder password = new StringBuilder();
        for (char c : passwordChars) {
            password.append(c);
        }

        return password.toString();
    }
    

    // Método para añadir caracteres requeridos
    private static void agregarCaracteresObligatorios(List<Character> passwordChars, int count, String charSet) {
        for (int i = 0; i < count; i++) {
            passwordChars.add(getUnCaracterAleatorio(charSet));
        }
    }
    // Método para obtener un carácter aleatorio de un conjunto

    private static char getUnCaracterAleatorio(String charSet) {
        return charSet.charAt(ALEATORIO.nextInt(charSet.length()));
    }

}
