import java.util.Scanner;

public class Entradas {
    public static void main(String[] args) {
        Scanner pepito = new Scanner (System.in);
        System.out.println("¿Cuál es tu nombre?");
        String nombre = pepito.nextLine();
        System.out.println("¿Cuál es tu edad?");
        int edad = pepito.nextInt();
        System.out.println("¿Cuál es tu peso?");
        double peso = pepito.nextDouble();
        System.out.println("Tu nombre es " +nombre+ " tienes " +edad+ " y pesas " +peso+ " kg");
    }
}
