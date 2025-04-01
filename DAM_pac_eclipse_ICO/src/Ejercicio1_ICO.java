import java.util.*;
public class Ejercicio1_ICO {

    public static boolean auditoriaEmpresa(
            double salarioJefe,
            double salarioEncargado,
            double salarioOficinistas,
            int numeroOficinistas,
            boolean proyectosTerminados,
            double presupuestoEmpresa) {

        if (!proyectosTerminados) {
            System.out.println("No ha pasado la auditoría ya que no ha terminado los proyectos acordados");
            return false;
        }

        double gastoPersonal = salarioJefe + salarioEncargado + (salarioOficinistas * numeroOficinistas);

        if (gastoPersonal > 20000) {
            System.out.println("No ha pasado la auditoría ya que el gasto en personal es de " + gastoPersonal + " y excede el límite mensual de 20.000 euros");
            return false;
        }

        if (presupuestoEmpresa > 100000) {
            System.out.println("No ha pasado la auditoría ya que el presupuesto asignado de " + presupuestoEmpresa + " excede el límite establecido en 100.000 euros");
            return false;
        }

        System.out.println("Enhorabuena!! Ha pasado la auditoría, nos vemos el año que viene");
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Menú de opciones
            System.out.println("1. Realizar auditoría");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                // Solicitar los datos al usuario
                System.out.print("Ingrese el salario del Jefe: ");
                double salarioJefe = scanner.nextDouble();

                System.out.print("Ingrese el salario del Encargado: ");
                double salarioEncargado = scanner.nextDouble();

                System.out.print("Ingrese el salario de los Oficinistas: ");
                double salarioOficinistas = scanner.nextDouble();

                System.out.print("Ingrese el número de Oficinistas: ");
                int numeroOficinistas = scanner.nextInt();

                System.out.print("¿Han terminado los proyectos? (true/false): ");
                boolean proyectosTerminados = scanner.nextBoolean();

                System.out.print("Ingrese el presupuesto de la empresa: ");
                double presupuestoEmpresa = scanner.nextDouble();

                // Llamar al método de auditoría
                boolean resultado = auditoriaEmpresa(salarioJefe, salarioEncargado, salarioOficinistas, numeroOficinistas, proyectosTerminados, presupuestoEmpresa);
                System.out.println("Resultado de la auditoría: " + (resultado ? "Apto" : "No apto"));
            } else if (opcion != 2) {
                System.out.println("Opción no válida. Intente nuevamente.");
            }

        } while (opcion != 2);

        System.out.println("Saliendo...");
        scanner.close();
    }
}
