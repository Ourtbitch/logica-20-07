import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la clase Cadenas
        Cadenas cadenas = new Cadenas("brrr grrrt text hello");

        // Llamar al método para contar palabras válidas y mostrar el resultado
        int resultado = cadenas.contarPalabrasValidas();
        System.out.println("Número de palabras válidas: " + resultado);
    }
}

