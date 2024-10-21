package Iterativas;
import java.util.Scanner;

public class RegistroVentasDiarias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalVentasSemana = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Ingresa las ventas del día " + i + ": ");
            int ventasDiarias = scanner.nextInt();
            totalVentasSemana += ventasDiarias;
        }

        System.out.println("El total de ventas de la semana es: $" + totalVentasSemana);
        System.out.println();

        scanner.close();
    }
}