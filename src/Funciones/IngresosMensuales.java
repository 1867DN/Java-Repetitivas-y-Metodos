package Funciones;
import java.util.Scanner;

public class IngresosMensuales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] ventas = new double[30];

        for (int i = 0; i < ventas.length; i++) {
            System.out.print("Ingresa las ventas del día " + (i + 1) + ": ");
            ventas[i] = scanner.nextDouble();
        }

        double totalIngresos = calcularIngresosMensuales(ventas);

        System.out.println("El total de ingresos mensuales es: $" + totalIngresos);

        System.out.println();
        scanner.close();
    }

    public static double calcularIngresosMensuales(double[] ventas) {
        double total = 0;
        for (double venta : ventas) {
            total += venta;
        }
        return total;
    }
}