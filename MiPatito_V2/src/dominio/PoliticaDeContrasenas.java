package dominio;

public class PoliticaDeContrasenas {

    private boolean restrictMinDigits; //Restringir dígitos mínimos
    private int minDigits; //Minimo de dígitos
    private boolean restrictMinUpperCaseLetters; // Restringir el mínimo de letras mayúsculas
    private int minUpperCaseLetters; // Mínimo de letras mayúsculas
    private boolean restrictMinLowerCaseLetters; //restringir en letras minúsculas
    private int minLowerCaseLetters; //minimo Letras Minúsculas
    private boolean restrictMinNonAlphanumericCharacters; // Restringir el mínimo de caracteres no alfanuméricos
    private int minNonAlphanumericCharacters; // mínimo Caracteres no alfanuméricos
    private int minLength; // Longitud mínima

    public PoliticaDeContrasenas(boolean restrictMinDigits, int minDigits, boolean restrictMinUpperCaseLetters,
            int minUpperCaseLetters, boolean restrictMinLowerCaseLetters, int minLowerCaseLetters,
            boolean restrictMinNonAlphanumericCharacters, int minNonAlphanumericCharacters, int minLength) {

        this.restrictMinDigits = restrictMinDigits;
        this.minDigits = minDigits;
        this.restrictMinUpperCaseLetters = restrictMinUpperCaseLetters;
        this.minUpperCaseLetters = minUpperCaseLetters;
        this.restrictMinLowerCaseLetters = restrictMinLowerCaseLetters;
        this.minLowerCaseLetters = minLowerCaseLetters;
        this.restrictMinNonAlphanumericCharacters = restrictMinNonAlphanumericCharacters;
        this.minNonAlphanumericCharacters = minNonAlphanumericCharacters;
        this.minLength = minLength;

    }

    public boolean isRestrictMinDigits() {
        return this.restrictMinDigits;
    }

    public int getMinDigits() {
        return this.minDigits;
    }

    public boolean isRestrictMinUpperCaseLetters() {
        return restrictMinUpperCaseLetters;
    }

    public int getMinUpperCaseLetters() {
        return minUpperCaseLetters;
    }

    public boolean isRestrictMinLowerCaseLetters() {
        return restrictMinLowerCaseLetters;
    }

    public int getMinLowerCaseLetters() {
        return minLowerCaseLetters;
    }

    public boolean isRestrictMinNonAlphanumericCharacters() {
        return restrictMinNonAlphanumericCharacters;
    }

    public int getMinNonAlphanumericCharacters() {
        return minNonAlphanumericCharacters;
    }

    public int getMinLength() {
        return minLength;
    }

}
