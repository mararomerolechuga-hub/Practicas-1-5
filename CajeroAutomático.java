import java.util.Scanner;

public class CajeroAutomático {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        final double LIMITE_RETIRO = 5000;

        double saldo;
        double retiro;
        double nuevoSaldo;

        System.out.print("Ingresa el saldo disponible: ");
        saldo = teclado.nextDouble();

        System.out.print("Ingresa la cantidad que deseas retirar: ");
        retiro = teclado.nextDouble();

        if (retiro > 0 && retiro <= LIMITE_RETIRO && retiro <= saldo) {

            nuevoSaldo = saldo - retiro;

            System.out.println("Retiro autorizado.");
            System.out.println("Efectivo entregado: $" + retiro);
            System.out.println("Saldo restante: $" + nuevoSaldo);

            if (nuevoSaldo < 500) {
                System.out.println("Advertencia: tu saldo restante es menor a $500.");
            }

        } else {
            System.out.println("Retiro no autorizado.");

            if (retiro <= 0) {
                System.out.println("La cantidad a retirar debe ser mayor que cero.");
            }

            if (retiro > LIMITE_RETIRO) {
                System.out.println("La cantidad supera el límite de retiro de $5000.");
            }

            if (retiro > saldo) {
                System.out.println("No tienes saldo suficiente.");
            }
        }

        teclado.close();
    }
}