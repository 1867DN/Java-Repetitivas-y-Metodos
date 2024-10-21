package Iterativas;
import java.util.Scanner;

public class TiempoActividades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] actividades = {"estudiar", "hacer ejercicios", "leer", "tiempo libre"};
        int[] horas = new int[4];
        int totalHoras = 0;
        int i = 0;

        while (i < actividades.length) {
            System.out.print("Ingresa las horas dedicadas a " + actividades[i] + ": ");
            horas[i] = scanner.nextInt();
            totalHoras += horas[i];
            i++;
        }

        System.out.println("El tiempo total dedicado a tus actividades es: " + totalHoras + " horas.");
        System.out.println();

        scanner.close();
    }
}