import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String letrasDisponibles = generarLetras(random, 16);
        Set<Character> letrasUsadas = new HashSet<>();

        List<String> palabrasJugador1 = new ArrayList<>();
        List<String> palabrasJugador2 = new ArrayList<>();
        boolean turnoJugador1 = true;

        System.out.println("Letras disponibles: " + letrasDisponibles);

        while (true) {
            System.out.println("Turno del jugador " + (turnoJugador1 ? "1" : "2"));
            String palabra = scanner.nextLine();

            if (esPalabraValida(palabra, letrasDisponibles, letrasUsadas)) {
                if (turnoJugador1) {
                    palabrasJugador1.add(palabra);
                } else {
                    palabrasJugador2.add(palabra);
                }
                for (char c : palabra.toCharArray()) {
                    letrasUsadas.add(c);
                }
            } else {
                System.out.println("Palabra no válida o ya usada.");
            }

            if (letrasDisponibles.length() - letrasUsadas.size() < 2) {
                break;
            }
            turnoJugador1 = !turnoJugador1;
        }

        System.out.println("Jugador 1: " + palabrasJugador1);
        System.out.println("Jugador 2: " + palabrasJugador2);

        if (palabrasJugador1.size() > palabrasJugador2.size()) {
            System.out.println("Ganador: Jugador 1");
        } else if (palabrasJugador2.size() > palabrasJugador1.size()) {
            System.out.println("Ganador: Jugador 2");
        } else {
            System.out.println("Empate");
        }
    }

    private static String generarLetras(Random random, int longitud) {
        StringBuilder letras = new StringBuilder();
        for (int i = 0; i < longitud; i++) {
            char letra = (char) ('a' + random.nextInt(26));
            letras.append(letra);
        }
        return letras.toString();
    }

    private static boolean esPalabraValida(String palabra, String letrasDisponibles, Set<Character> letrasUsadas) {
        for (char c : palabra.toCharArray()) {
            if (letrasUsadas.contains(c) || letrasDisponibles.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}
