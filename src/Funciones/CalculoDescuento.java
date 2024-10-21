package Funciones;
import java.util.Scanner;

public class CalculoDescuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número de productos: ");
        int numeroProductos = scanner.nextInt();
        double[] preciosOriginales = new double[numeroProductos];

        for (int i = 0; i < preciosOriginales.length; i++) {
            System.out.print("Ingresa el precio original del producto " + (i + 1) + ": ");
            preciosOriginales[i] = scanner.nextDouble();
        }

        double[] preciosFinales = calcularPrecioFinal(preciosOriginales);

        System.out.println("\nPrecios finales de los productos con el descuento del 10% aplicado:");
        for (double precio : preciosFinales) {
            System.out.printf("%.2f\n", precio);
        }

        System.out.println();
        scanner.close();
    }

    public static double[] calcularPrecioFinal(double[] preciosOriginales) {
        double[] preciosFinales = new double[preciosOriginales.length];
        for (int i = 0; i < preciosOriginales.length; i++) {
            preciosFinales[i] = preciosOriginales[i] - (preciosOriginales[i] * 0.10);
        }
        return preciosFinales;
    }
}