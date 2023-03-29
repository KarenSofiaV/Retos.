import java.util.Random;
import java.util.Scanner;

public class Reto5 {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Random rand = new Random();
        int vidas = 3, jugador, computadora;
        String respuesta;

        System.out.println("Bienvenido al juego de Piedra, Papel y Tijera!");
        System.out.println("Tienes 3 vidas. ¡Buena suerte!\n");

        while (vidas > 0) {
            System.out.print("Ingresa tu jugada (1 = piedra, 2 = papel, 3 = tijera): ");
            jugador = lectura.nextInt();

             computadora = rand.nextInt(3) + 1;

            System.out.println("La computadora eligió: " + getJugada(computadora));

            if (jugador == computadora) {
                System.out.println("¡Empate!");
            } else if ((jugador == 1 && computadora == 3) || (jugador == 2 && computadora == 1)
                    || (jugador == 3 && computadora == 2)) {
                System.out.println("¡Ganaste esta ronda!");
            } else {
                System.out.println("¡Perdiste esta ronda!");
                vidas--;
                if (vidas == 0) {
                    System.out.println("Game over. ¡Gracias por jugar!");
                    System.out.print("\n¿Quieres jugar de nuevo? (s/n): ");
            respuesta = lectura.next();
            if (respuesta.equals("n")) {
                
            } else if (respuesta.equals("s")) {
                System.out.println("Recargando vidas...");
                vidas = 3;
            } else {
                System.out.println("Respuesta inválida. Saliendo del programa.");
            
            }
                    
                } else {
                    System.out.println("Te quedan " + vidas + " vidas.");
                }
            }

            

        }

        lectura.close();
    }

    public static String getJugada(int jugada) {
        if (jugada == 1) {
            return "piedra";
        } else if (jugada == 2) {
            return "papel";
        } else {
            return "tijera";
        }
    }
}
