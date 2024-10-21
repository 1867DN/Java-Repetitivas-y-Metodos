package Funciones;
import java.util.Scanner;

public class DescuentoComprasGrandes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número de compras: ");
        int numeroCompras = scanner.nextInt();
        double[] compras = new double[numeroCompras];

        for (int i = 0; i < compras.length; i++) {
            System.out.print("Ingresa el monto de la compra " + (i + 1) + ": ");
            compras[i] = scanner.nextDouble();
        }

        aplicarDescuento(compras);

        System.out.println("\nMontos de las compras con el descuento del 15% aplicado:");
        for (double compra : compras) {
            System.out.printf("%.2f\n", compra);
        }

        System.out.println();
        scanner.close();
    }

    public static void aplicarDescuento(double[] compras) {
        for (int i = 0; i < compras.length; i++) {
            if (compras[i] > 500) {
                compras[i] -= compras[i] * 0.15;
            }
        }
    }
}