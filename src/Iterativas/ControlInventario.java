package Iterativas;
import java.util.Scanner;

public class ControlInventario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número de productos: ");
        int numeroProductos = scanner.nextInt();
        boolean necesitaPedido = false;

        for (int i = 0; i < numeroProductos; i++) {
            System.out.print("Ingresa la cantidad disponible del producto " + (i + 1) + ": ");
            int cantidadDisponible = scanner.nextInt();

            if (cantidadDisponible < 5) {
                System.out.println("El producto " + (i + 1) + " tiene menos de 5 unidades. Es necesario realizar un pedido.");
                necesitaPedido = true;
            }
        }

        if (!necesitaPedido) {
            System.out.println("No se necesita hacer pedidos para ningún producto.");
        }

        System.out.println();
        scanner.close();
    }
}