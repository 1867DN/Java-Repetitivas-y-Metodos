package Iterativas;
import java.util.Scanner;

public class SalariosSemanales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int TARIFA_POR_HORA = 15;

        System.out.print("Ingresa la cantidad de empleados: ");
        int cantidadEmpleados = scanner.nextInt();
        int i = 0;

        while (i < cantidadEmpleados) {
            System.out.print("Ingresa las horas trabajadas por el empleado " + (i + 1) + ": ");
            int horasTrabajadas = scanner.nextInt();
            int salarioSemanal = horasTrabajadas * TARIFA_POR_HORA;
            System.out.println("El salario semanal del empleado " + (i + 1) + " es: $" + salarioSemanal);
            i++;
        }

        System.out.println();
        scanner.close();
    }
}