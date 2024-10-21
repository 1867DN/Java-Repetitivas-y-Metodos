package Funciones;
import java.util.Scanner;

public class CalculoImpuestos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número de facturas: ");
        int numeroFacturas = scanner.nextInt();
        double[] facturas = new double[numeroFacturas];

        for (int i = 0; i < facturas.length; i++) {
            System.out.print("Ingresa el monto de la factura " + (i + 1) + ": ");
            facturas[i] = scanner.nextDouble();
        }

        calcularImpuesto(facturas);

        System.out.println("\nMontos de las facturas con el impuesto del 21% aplicado:");
        for (double factura : facturas) {
            System.out.printf("%.2f\n", factura);
        }

        System.out.println();
        scanner.close();
    }

    public static void calcularImpuesto(double[] facturas) {
        for (int i = 0; i < facturas.length; i++) {
            facturas[i] += facturas[i] * 0.21;
        }
    }
}