import java.util.Scanner;
public class Reto1 {
    public static void main(String[] args) {
        double centigrados = 350;
        double fahrenheit = centigrados * 9/5 + 32 +100;
        double kelvin = centigrados + 273.15 +100;

        System.out.println(centigrados + " Si su horno esta en grados Fahrenheit esta es la temperatura" + fahrenheit + " °F");
        System.out.println(centigrados + " Si su horno esta en grados Kelvin esta es la temperatura " + kelvin + " K");
    }
}