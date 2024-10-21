package Funciones;
import java.util.Scanner;

public class ControlHorasTrabajadas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] empleados = {"José Alonso", "Federico Pacheco", "Nelson Pereira", "Osvaldo Tejada", "Gastón Garcia"};

        int[] horasTrabajadas = new int[empleados.length];

        for (int i = 0; i < empleados.length; i++) {
            System.out.print("Ingresa las horas trabajadas por " + empleados[i] + ": ");
            horasTrabajadas[i] = scanner.nextInt();
        }

        calcularPagoSemanal(empleados, horasTrabajadas);

        System.out.println();
        scanner.close();
    }

    public static void calcularPagoSemanal(String[] empleados, int[] horasTrabajadas) {
        final int TARIFA_POR_HORA = 15;
        System.out.println("\nPago semanal de los empleados:");
        for (int i = 0; i < empleados.length; i++) {
            int pagoSemanal = horasTrabajadas[i] * TARIFA_POR_HORA;
            System.out.println(empleados[i] + ": $" + pagoSemanal);
        }
    }
}