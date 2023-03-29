import java.util.Scanner;

public class Reto7 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        boolean quiereFormulario = true;
        String nombre,correo, respuesta;
        int edad;

        while (quiereFormulario) {
            System.out.println("Bienvenido al formulario.");
            System.out.print("Ingrese su nombre: ");
            nombre = lectura.nextLine();

            System.out.print("Ingrese su edad: ");
            edad = lectura.nextInt();
            lectura.nextLine(); 

            System.out.print("Ingrese su correo electrónico: ");
            correo = lectura.nextLine();

            System.out.println("Gracias por completar el formulario.");
            System.out.print("¿Desea hacer otro formulario? (s/n): ");
            respuesta = lectura.nextLine();

            if (!respuesta.equalsIgnoreCase("s")) {
                quiereFormulario = false;
            }
        }

        System.out.println("Gracias por usar nuestro servicio de formularios.");
    }
}