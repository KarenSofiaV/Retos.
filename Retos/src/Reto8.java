import java.util.Scanner;

public class Reto8 {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        boolean quiereJugar= true;

        while (quiereJugar) {
            String jugarDeNuevo = "si";
            int jugador1,jugador2;

            System.out.println("¡Bienvenido al juego de dados!");

            System.out.print("Jugador 1, ingresa un número del 1 al 6: ");
            jugador1 = lectura.nextInt();

            System.out.print("Jugador 2, ingresa un número del 1 al 6: ");
            jugador2 = lectura.nextInt();

            System.out.println("Jugador 1: " + jugador1);
            System.out.println("Jugador 2: " + jugador2);

            if(jugador1 > jugador2) {
                System.out.println("¡El jugador 1 ha ganado!");
            } else if (jugador2 > jugador1) {
                System.out.println("¡El jugador 2 ha ganado!");
            } else {
                System.out.println("¡Empate!");
            }

            System.out.print("¿Quieres volver a jugar? (s/n): ");
            jugarDeNuevo = lectura.next();

            if (!jugarDeNuevo.equalsIgnoreCase("s")) {
                quiereJugar = false;
            }
        }
        System.out.println("¡Gracias por jugar!");
    }

    public static int lanzarDado() {
        return (int)(Math.random() * 6 + 1);
    }
}