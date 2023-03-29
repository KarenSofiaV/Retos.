import java.util.Scanner;

public class Reto6 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        boolean quiereJugar = true;
        int vidas = 3;
            String respuesta, palabra;
            int numPalabras;

        while (quiereJugar) {
            System.out.print("¿Cuántas frutas quieres descubrir? solo puedes descubrir hasta 5 palabras: ");
            numPalabras = lectura.nextInt();
            if (numPalabras > 5) {
                System.out.println("Error: solo puedes descubrir hasta 5 palabras.");
                continue;
            }
            
            while (numPalabras > 0 && vidas > 0) {
                System.out.print("Ingresa una palabra: ");
                 palabra = lectura.next();

                if (palabra.equalsIgnoreCase("mango")) {
                    System.out.println("¡Felicidades, has descubierto la palabra!");
                    numPalabras--;
                }else  if (palabra.equalsIgnoreCase("fresa")) {
                        System.out.println("¡Felicidades, has descubierto la palabra!");
                        numPalabras--;
                    }else  if (palabra.equalsIgnoreCase("mora")) {
                        System.out.println("¡Felicidades, has descubierto la palabra!");
                        numPalabras--;
                    }else  if (palabra.equalsIgnoreCase("lulo")) {
                        System.out.println("¡Felicidades, has descubierto la palabra!");
                        numPalabras--;
                    }else  if (palabra.equalsIgnoreCase("banano")) {
                        System.out.println("¡Felicidades, has descubierto la palabra!");
                        numPalabras--;
                    }else  if (palabra.equalsIgnoreCase("papaya")) {
                        System.out.println("¡Felicidades, has descubierto la palabra!");
                        numPalabras--;
                } else {
                    System.out.println("Palabra incorrecta. Pierdes una vida.");
                    vidas--;
                }
            }

            if (vidas == 0) {
                System.out.println("Game over. Te has quedado sin vidas.");
            } else {
                System.out.println("¡Ganaste! Has descubierto todas las palabras.");
            }

            System.out.print("¿Quieres volver a jugar? (s/n): ");
             respuesta = lectura.next();

            if (!respuesta.equalsIgnoreCase("s")) {
                quiereJugar = false;
            }
        }

        System.out.println("Gracias por jugar.");
        
    }
}