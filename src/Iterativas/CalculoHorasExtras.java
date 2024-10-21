package Iterativas;
import java.util.Scanner;

public class CalculoHorasExtras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número de empleados: ");
        int numeroEmpleados = scanner.nextInt();
        int i = 0;

        do {
            System.out.print("Ingresa las horas trabajadas por el empleado " + (i + 1) + ": ");
            int horasTrabajadas = scanner.nextInt();

            if (horasTrabajadas > 40) {
                int horasExtras = horasTrabajadas - 40;
                System.out.println("El empleado " + (i + 1) + " tiene " + horasExtras + " horas extras.");
            } else {
                System.out.println("El empleado " + (i + 1) + " no tiene horas extras.");
            }

            i++;
        } while (i < numeroEmpleados);

        System.out.println();
        scanner.close();
    }
}
