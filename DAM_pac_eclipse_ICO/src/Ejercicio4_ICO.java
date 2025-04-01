import java.util.*;
public class Ejercicio4_ICO {
	public class LigaFutbol {
	    static String[] nombres = new String[20];
	    static int[] puntuaciones = new int[20];
	    static Scanner sc = new Scanner(System.in);
	    static Random rand = new Random();

	    public static void ingresarNombres() {
	        System.out.println("\nIntroduce los nombres de los 20 equipos:");
	        for (int i = 0; i < 20; i++) {
	            System.out.print("Equipo " + (i + 1) + ": ");
	            nombres[i] = sc.nextLine();
	            puntuaciones[i] = rand.nextInt(66) + 35; // Número entre 35 y 100
	        }
	    }

	    public static void equipoGanador() {
	        int maxPuntos = puntuaciones[0];
	        int indice = 0;
	        for (int i = 1; i < 20; i++) {
	            if (puntuaciones[i] > maxPuntos) {
	                maxPuntos = puntuaciones[i];
	                indice = i;
	            }
	        }
	        System.out.println("\nEquipo ganador: " + nombres[indice] + " con " + maxPuntos + " puntos.");
	    }

	    public static void equipoUltimo() {
	        int minPuntos = puntuaciones[0];
	        int indice = 0;
	        for (int i = 1; i < 20; i++) {
	            if (puntuaciones[i] < minPuntos) {
	                minPuntos = puntuaciones[i];
	                indice = i;
	            }
	        }
	        System.out.println("\nÚltimo clasificado: " + nombres[indice] + " con " + minPuntos + " puntos.");
	    }

	    public static void puntuacionMedia() {
	        int suma = 0;
	        for (int puntos : puntuaciones) {
	            suma += puntos;
	        }
	        double media = (double) suma / puntuaciones.length;
	        System.out.printf("\nPuntuación media: %.2f puntos.\n", media);
	    }

	    public static void main(String[] args) {
	        while (true) {
	            System.out.println("\nMenú:");
	            System.out.println("1. Ingresar nombres de los equipos");
	            System.out.println("2. Mostrar equipo ganador");
	            System.out.println("3. Mostrar último clasificado");
	            System.out.println("4. Mostrar puntuación media");
	            System.out.println("5. Salir");
	            System.out.print("Elige una opción: ");
	            
	            int opcion = sc.nextInt();
	            sc.nextLine();  // Limpiar buffer

	            switch (opcion) {
	                case 1:
	                    ingresarNombres();
	                    break;
	                case 2:
	                    equipoGanador();
	                    break;
	                case 3:
	                    equipoUltimo();
	                    break;
	                case 4:
	                    puntuacionMedia();
	                    break;
	                case 5:
	                    System.out.println("Saliendo del programa...");
	                    return;
	                default:
	                    System.out.println("Opción inválida, intenta de nuevo.");
	            }
	        }
	    }
	}
}
