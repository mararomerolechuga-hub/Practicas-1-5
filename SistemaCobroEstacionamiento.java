import java.util.Scanner;

public class SistemaCobroEstacionamiento {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        final double TARIFA_MOTOCICLETA = 10;
        final double TARIFA_AUTOMOVIL = 20;
        final double TARIFA_CAMIONETA = 30;

        final double DESCUENTO_MAS_DE_5_HORAS = 0.10;
        final double DESCUENTO_MAS_DE_10_HORAS = 0.20;

        int tipoVehiculo;
        double horas;
        double tarifa = 0;
        double subtotal;
        double descuento = 0;
        double totalPagar;

        System.out.println("=== ESTACIONAMIENTO ===");
        System.out.println("1. Motocicleta");
        System.out.println("2. Automóvil");
        System.out.println("3. Camioneta");

        System.out.print("Selecciona el tipo de vehículo: ");
        tipoVehiculo = teclado.nextInt();

        System.out.print("Ingresa el número de horas: ");
        horas = teclado.nextDouble();

        if (horas <= 0) {

            System.out.println("La cantidad de horas no es válida.");

        } else {

            if (tipoVehiculo == 1) {
                tarifa = TARIFA_MOTOCICLETA;
            } else if (tipoVehiculo == 2) {
                tarifa = TARIFA_AUTOMOVIL;
            } else if (tipoVehiculo == 3) {
                tarifa = TARIFA_CAMIONETA;
            } else {
                System.out.println("Tipo de vehículo no válido.");
            }

            if (tipoVehiculo == 1 || tipoVehiculo == 2 || tipoVehiculo == 3) {

                subtotal = horas * tarifa;

                if (horas > 10) {
                    descuento = subtotal * DESCUENTO_MAS_DE_10_HORAS;
                } else if (horas > 5) {
                    descuento = subtotal * DESCUENTO_MAS_DE_5_HORAS;
                }

                totalPagar = subtotal - descuento;

                System.out.println("\n--- COBRO DE ESTACIONAMIENTO ---");
                System.out.println("Tipo de vehículo: " + tipoVehiculo);
                System.out.println("Horas: " + horas);
                System.out.println("Tarifa por hora: $" + tarifa);
                System.out.println("Subtotal: $" + subtotal);
                System.out.println("Descuento: $" + descuento);
                System.out.println("Total a pagar: $" + totalPagar);
            }
        }

        teclado.close();
    }
}