import java.util.Scanner;

public class SistemaCalificaciones {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        final double MINIMO_APROBATORIO = 70;
        final double MINIMO_UNIDAD = 60;

        double calificacion1;
        double calificacion2;
        double calificacion3;
        double promedio;

        System.out.print("Ingresa la calificación de la unidad 1: ");
        calificacion1 = teclado.nextDouble();

        System.out.print("Ingresa la calificación de la unidad 2: ");
        calificacion2 = teclado.nextDouble();

        System.out.print("Ingresa la calificación de la unidad 3: ");
        calificacion3 = teclado.nextDouble();

        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Calificación 1: " + calificacion1);
        System.out.println("Calificación 2: " + calificacion2);
        System.out.println("Calificación 3: " + calificacion3);
        System.out.println("Promedio: " + promedio);

        if (promedio >= MINIMO_APROBATORIO) {
            System.out.println("Resultado: Alumno aprobado.");
        } else {
            System.out.println("Resultado: Alumno reprobado.");
        }

        if (calificacion1 < MINIMO_UNIDAD) {
            System.out.println("Debe presentar recuperación de la unidad 1.");
        }

        if (calificacion2 < MINIMO_UNIDAD) {
            System.out.println("Debe presentar recuperación de la unidad 2.");
        }

        if (calificacion3 < MINIMO_UNIDAD) {
            System.out.println("Debe presentar recuperación de la unidad 3.");
        }

        teclado.close();
    }
}