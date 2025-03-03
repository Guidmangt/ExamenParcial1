
package mipatito;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PasswordGenerator {
    private static final SecureRandom ALEATORIO = new SecureRandom();
    private static  final String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    private static final String MAYUSCULAS = MINUSCULAS.toUpperCase();
    private static final String NUMEROS = "0123456789";
    private static final String ESPECIALES= "!@#$%^&*()_+-=[]{}|;:,.<>?";
    
    public static String generatePassword(int longitud){ // 12
        if(longitud < 8){
            throw  new IllegalArgumentException ("La contraseña debe tener 8 caracteres por lo menos  ");
        }
        
        List<Character> passwordChars = new ArrayList<>();
        
        //añadir al menos un caracter cada categoria
        passwordChars.add(getUnCaracterAleatorio(MINUSCULAS));
        passwordChars.add(getUnCaracterAleatorio(MAYUSCULAS));
        passwordChars.add(getUnCaracterAleatorio(NUMEROS));
        passwordChars.add(getUnCaracterAleatorio(ESPECIALES));
        
        // Caracteres restantes de cualquier categoría requerida
        String todosLosCaracteres = MINUSCULAS+MAYUSCULAS+NUMEROS+ESPECIALES;
        for(int i = 0; i<longitud - 4;i++){ // 12 -4= 8
            passwordChars.add(getUnCaracterAleatorio(todosLosCaracteres));
        }
        
        // Mezclar los caracters para evitar patrones predecibles
        Collections.shuffle(passwordChars);
        
        // Construir la cadena de la contraseña
        StringBuilder password = new StringBuilder();
        for(char c : passwordChars){
            password.append(c);
        }
    
        // Convertir StringBuilder a String y mostrar la contraseña  
    
        return password.toString();
    
    }

    private static Character getUnCaracterAleatorio(String chars) {
       return chars.charAt(ALEATORIO.nextInt(chars.length()));
    }
    
}
