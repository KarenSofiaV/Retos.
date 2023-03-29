import java.util.Scanner;

public class Reto3 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        
        String nombreJugador, cara, sello;
        int edad, sComputadora, sUsuario ;

        System.out.println("Ingrese el nombre del Jugador");
        nombreJugador=lectura.next();
        System.out.println("Ingrese su edad");
        edad=lectura.nextInt();
        if (edad > 18 && edad <100) {
            // Si edad es mayor a 18 si puede jugar ...
            System.out.println("empiece a jugar ");
        } else if (edad < 18 || edad > 100) {
            // Si edad es menor que 18 o mayor de 100 años no puede jugar
            System.out.println("Usted no puede jugar");
            return;
        }

        System.out.println("¡Bienvenido al juego de Cara o Sello!");

        System.out.print("Por favor, elija cara (0) o sello (1): ");
         sUsuario = lectura.nextInt();
        sComputadora = lectura.nextInt();

        System.out.println("Usted eligió: " + (sUsuario == 0 ? "cara" : "sello"));
        System.out.println("La computadora eligió: " + (sComputadora == 0 ? "cara" : "sello"));

        if (sUsuario == sComputadora) {
            System.out.println("¡Empate!");
        } else if (sUsuario == 0 && sComputadora == 1) {
            System.out.println("¡Usted ganó! La moneda cayó en cara.");
        } else if (sUsuario == 1 && sComputadora == 0) {
            System.out.println("¡Usted ganó! La moneda cayó en sello.");
        } else {
            System.out.println("¡La computadora ganó! Lo siento, intente de nuevo.");
        }
    }
}