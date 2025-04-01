import java.util.*;
public class Ejercicio2_ICO {
	    public static boolean procesoSeleccion() {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Ingrese su edad: ");
	        int edad = scanner.nextInt();
	        
	        if (edad > 40) {
	            System.out.println("Queda descartado del proceso de selección.");
	            return false;
	        }
	        
	        scanner.nextLine(); // Limpiar buffer
	        System.out.print("Ingrese su nombre: ");
	        String nombre = scanner.nextLine();
	        
	        System.out.print("Ingrese los años trabajados: ");
	        int anosTrabajados = scanner.nextInt();
	        
	        System.out.print("Ingrese su sueldo bruto anual anterior: ");
	        double sueldoBrutoAnterior = scanner.nextDouble();
	        
	        if (sueldoBrutoAnterior > 30000) {
	            System.out.println("Queda descartado del proceso de selección.");
	            return false;
	        }
	        
	        double sumaNominas = 0;
	        for (int i = 1; i <= 5; i++) {
	            System.out.print("Ingrese el importe de la nómina " + i + ": ");
	            sumaNominas += scanner.nextDouble();
	        }
	        
	        double mediaNominas = sumaNominas / 5;
	        double incremento;
	        
	        if (mediaNominas > 2500) {
	            incremento = mediaNominas * 0.05;
	            System.out.println("Se le sube el sueldo en un 5%. Nuevo sueldo: " + (mediaNominas + incremento));
	        } else {
	            incremento = mediaNominas * 0.10;
	            System.out.println("Se le sube el sueldo en un 10%. Nuevo sueldo: " + (mediaNominas + incremento));
	        }
	        
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int opcion;
	        
	        do {
	            System.out.println("1. Iniciar proceso de selección");
	            System.out.println("2. Salir");
	            System.out.print("Seleccione una opción: ");
	            opcion = scanner.nextInt();
	            
	            if (opcion == 1) {
	                procesoSeleccion();
	            }
	        } while (opcion != 2);
	        
	        System.out.println("Programa finalizado.");
	    }
	}
