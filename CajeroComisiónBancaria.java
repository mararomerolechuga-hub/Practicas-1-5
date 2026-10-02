import java.util.Scanner;

public class CajeroComisiónBancaria {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        final double COMISION = 10;
        final double LIMITE_RETIRO = 5000;

        double saldo;
        double retiro;

        System.out.print("Ingresa el saldo disponible: ");
        saldo = teclado.nextDouble();

        System.out.print("Ingresa la cantidad que deseas retirar: ");
        retiro = teclado.nextDouble();

        if (retiro > 0 && retiro <= LIMITE_RETIRO && saldo >= retiro + COMISION) {

            // Estas variables se declaran dentro del bloque
            double montoComision;
            double saldoFinal;

            montoComision = COMISION;
            saldoFinal = saldo - retiro - montoComision;

            System.out.println("\n--- RETIRO AUTORIZADO ---");
            System.out.println("Monto retirado: $" + retiro);
            System.out.println("Comisión bancaria: $" + montoComision);
            System.out.println("Saldo final: $" + saldoFinal);

        } else {
            System.out.println("\nRetiro no autorizado.");

            if (retiro <= 0) {
                System.out.println("La cantidad a retirar debe ser mayor que cero.");
            }

            if (retiro > LIMITE_RETIRO) {
                System.out.println("El retiro supera el límite de $5000.");
            }

            if (saldo < retiro + COMISION) {
                System.out.println("No tienes saldo suficiente para cubrir el retiro y la comisión.");
            }
        }

        teclado.close();
    }
}