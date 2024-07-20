public class Cadenas {

    private String texto;

    public Cadenas(String texto) {
        this.texto = texto;
    }

    // Método para contar palabras que cumplen con las condiciones
    public int contarPalabrasValidas() {
        // Dividir el texto en palabras usando espacio como delimitador
        String[] palabras = texto.split("\\s+");
        int conteo = 0;

        // Iterar sobre cada palabra
        for (String palabra : palabras) {
            if (esPalabraValida(palabra)) {
                conteo++;
            }
        }

        return conteo;
    }

    // Método para validar si una palabra cumple con las condiciones
    private boolean esPalabraValida(String palabra) {
        // Verificar si la palabra tiene más de 3 caracteres
        if (palabra.length() <= 3) {
            return false;
        }

        // Verificar si la palabra no contiene vocales
        for (char c : palabra.toCharArray()) {
            if (esVocal(c)) {
                return false;
            }
        }

        return true;
    }

    // Método auxiliar para verificar si un carácter es una vocal
    private boolean esVocal(char c) {
        // Convertir el carácter a minúscula y verificar si es una vocal
        return "aeiou".indexOf(Character.toLowerCase(c)) != -1;
    }   
}