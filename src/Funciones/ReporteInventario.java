package Funciones;
import java.util.Scanner;

public class ReporteInventario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] productos = {"Laptop", "Teléfono", "Tablet", "Monitor", "Teclado", "Ratón", "Impresora", "Cámara", "Auriculares", "Altavoces"};

        int[] stocks = new int[10];

        for (int i = 0; i < productos.length; i++) {
            System.out.print("Ingresa la cantidad de stock del producto " + productos[i] + ": ");
            stocks[i] = scanner.nextInt();
        }

        generarReporteBajoStock(productos, stocks);

        System.out.println();
        scanner.close();
    }

    public static void generarReporteBajoStock(String[] productos, int[] stocks) {
        System.out.println("\nReporte de productos con menos de 5 unidades en stock:");
        boolean hayBajoStock = false;
        for (int i = 0; i < productos.length; i++) {
            if (stocks[i] < 5) {
                System.out.println(productos[i] + " tiene " + stocks[i] + " unidades en stock.");
                hayBajoStock = true;
            }
        }
        if (!hayBajoStock) {
            System.out.println("No hay productos con menos de 5 unidades en stock.");
        }
    }
}