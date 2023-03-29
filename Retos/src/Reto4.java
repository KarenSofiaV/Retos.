import java.util.Random;
import java.util.Scanner;

public class Reto4 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Random rand = new Random();

        String nombreJugador;
        int edad, sComputadora, sUsuario;

        System.out.println("Ingrese el nombre del Jugador");
        nombreJugador = lectura.next();
        System.out.println("Ingrese su edad");
        edad = lectura.nextInt();
        if (edad > 18 && edad <100) {
            // Si edad es mayor a 18 si puede jugar ...
            System.out.println("empiece a jugar ");
        } else if (edad < 18 || edad > 100) {
            // Si edad es menor que 18 o mayor de 100 años no puede jugar
            System.out.println("Usted no puede jugar");
            return;
        }
        System.out.println("¡Bienvenido al juego de Piedra Papel y Tijera!");

        System.out.print("Por favor, elija piedra (0) o papel (1) o tijera(2): ");
        sUsuario = lectura.nextInt();

        // La computadora elige aleatoriamente
        sComputadora = rand.nextInt(3);

        System.out.println("Usted eligió: " + sUsuario);
        System.out.println("La computadora eligió: " + sComputadora);

        if (sUsuario == sComputadora) {
            System.out.println("¡Empate!");
        } else if (sUsuario == 0 && sComputadora == 1) {
            System.out.println("¡La computadora ganó! Lo siento, intente de nuevo.");
        } else if (sUsuario == 1 && sComputadora == 0) {
            System.out.println("¡Usted ganó! usted eligio papel.");
        } else if (sUsuario == 2 && sComputadora == 0) {
            System.out.println("¡La computadora ganó! Lo siento, intente de nuevo.");
        } else if (sUsuario == 0 && sComputadora == 2) {
            System.out.println("¡Usted ganó! usted eligio piedra.");
        } else if (sUsuario == 1 && sComputadora == 2) {
            System.out.println("¡La computadora ganó! Lo siento, intente de nuevo.");
        } else if (sUsuario == 2 && sComputadora == 1) {
            System.out.println("¡Usted ganó! usted eligio tijera.");
        } else {
            System.out.println("Opción inválida. Intente de nuevo.");
        }
        lectura.close();
    }
}
