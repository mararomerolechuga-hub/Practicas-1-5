import java.util.Scanner;

public class TiendaDescuentos {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        final double DESCUENTO_NORMAL = 0.00;
        final double DESCUENTO_FRECUENTE = 0.10;
        final double DESCUENTO_VIP = 0.20;
        final double DESCUENTO_ADICIONAL = 0.05;
        final double COMPRA_MINIMA = 2000;

        String nombreCliente;
        double montoCompra;
        double porcentajeDescuento = 0;
        double descuento;
        double descuentoAdicional = 0;
        double totalPagar;
        int tipoCliente;

        System.out.print("Ingresa el nombre del cliente: ");
        nombreCliente = teclado.nextLine();

        System.out.print("Ingresa el monto de la compra: ");
        montoCompra = teclado.nextDouble();

        System.out.println("\nTipo de cliente:");
        System.out.println("1. Cliente normal");
        System.out.println("2. Cliente frecuente");
        System.out.println("3. Cliente VIP");

        System.out.print("Selecciona el tipo de cliente: ");
        tipoCliente = teclado.nextInt();

        if (tipoCliente == 1) {
            porcentajeDescuento = DESCUENTO_NORMAL;
        } else if (tipoCliente == 2) {
            porcentajeDescuento = DESCUENTO_FRECUENTE;
        } else if (tipoCliente == 3) {
            porcentajeDescuento = DESCUENTO_VIP;
        } else {
            System.out.println("Tipo de cliente no válido.");
        }

        descuento = montoCompra * porcentajeDescuento;

        if (montoCompra > COMPRA_MINIMA) {
            descuentoAdicional = montoCompra * DESCUENTO_ADICIONAL;
        }

        totalPagar = montoCompra - descuento - descuentoAdicional;

        System.out.println("\n--- RESUMEN DE COMPRA ---");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Monto original: $" + montoCompra);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Descuento adicional: $" + descuentoAdicional);
        System.out.println("Total a pagar: $" + totalPagar);

        teclado.close();
    }
}