package Funciones;
public class GestionClientes {
    public static void main(String[] args) {
        String[] clientes = {"Rodolfo Fernandez", "Los Pollos Hnos", "Andrea Pereira", "Multimarca Repuestos", "Luis Peric"};

        double[] facturasPendientes = {300.0, 750.0, 450.0, 1200.0, 500.0};

        enviarFacturas(clientes, facturasPendientes);
    }

    public static void enviarFacturas(String[] clientes, double[] facturasPendientes) {
        System.out.println("Clientes con facturas mayores a $500:");
        for (int i = 0; i < clientes.length; i++) {
            if (facturasPendientes[i] > 500) {
                System.out.println(clientes[i]);
            }
        }
    System.out.println();
    }
}