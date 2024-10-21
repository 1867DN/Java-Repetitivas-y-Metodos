package Funciones;
import java.util.Scanner;

public class PromedioSatisfaccion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número de clientes: ");
        int numeroClientes = scanner.nextInt();
        int[] calificaciones = new int[numeroClientes];

        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Ingresa la calificación de satisfacción del cliente " + (i + 1) + " (1 a 5): ");
            calificaciones[i] = scanner.nextInt();
        }

        double promedioSatisfaccion = calcularPromedioSatisfaccion(calificaciones);

        System.out.printf("El promedio de satisfacción del cliente es: %.2f\n", promedioSatisfaccion);

        System.out.println();
        scanner.close();
    }

    public static double calcularPromedioSatisfaccion(int[] calificaciones) {
        int total = 0;
        for (int calificacion : calificaciones) {
            total += calificacion;
        }
        return (double) total / calificaciones.length;
    }
}
