import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        
        String nombreBebe, nombreMedico, nombreVacuna, nombreEps;
        int dosis=0, pesoBebe, mesesBebe;

        System.out.println("Ingrese el nombre del bebe");
        nombreBebe= lectura.next();
        System.out.println("Ingrese el nombre del Medico");
        nombreMedico=lectura.next();
        System.out.println("Ingrese el nombre del Medico");
        nombreVacuna=lectura.next();
        System.out.println("Ingrese el nombre de la EPS");
        nombreEps=lectura.next();
        System.out.println("Ingrese el peso del bebe");
        pesoBebe=lectura.nextInt();
        System.out.println("Ingrese la edad en meses del bebe");
        mesesBebe=lectura.nextInt();




        dosis = (pesoBebe + 15)/(mesesBebe + 10) * 10;
        System.out.println("El nombre del bebe es:" +nombreBebe);
        System.out.println("El nombre del bebe es:" +nombreMedico);
        System.out.println("El nombre del bebe es:" +nombreVacuna);
        System.out.println("El nombre del bebe es:" +nombreEps);
        System.out.println("La dosis recomendada es de %.2f ml." +dosis);
        lectura.close();
    }
}
