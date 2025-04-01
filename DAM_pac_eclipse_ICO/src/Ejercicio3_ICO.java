import java.util.*;
public class Ejercicio3_ICO {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos iniciales
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        System.out.print("Ingrese su peso (kg): ");
        double peso = scanner.nextDouble();
        System.out.print("Ingrese su altura (m): ");
        double altura = scanner.nextDouble();
        scanner.nextLine(); // Limpiar buffer
        System.out.print("Ingrese su sexo (M/F): ");
        String sexo = scanner.nextLine();
        System.out.print("Ingrese su velocidad inicial (km/h): ");
        double velocidadInicial = scanner.nextDouble();
        System.out.print("Ingrese su distancia inicial (km): ");
        double distanciaInicial = scanner.nextDouble();
        System.out.print("Ingrese sus calorías quemadas iniciales: ");
        double caloriasIniciales = scanner.nextDouble();

        // Calcular IMC
        double imc = peso / (altura * altura);

        // Variables para acumular datos
        double sumaVelocidad = 0, sumaDistancia = 0, sumaCalorias = 0;
        double maxDistancia = 0, maxCalorias = 0;

        // Registrar 10 sesiones
        for (int i = 1; i <= 10; i++) {
            System.out.println("\nSesión " + i + ":");
            System.out.print("Ingrese la velocidad (km/h): ");
            double velocidad = scanner.nextDouble();
            System.out.print("Ingrese la distancia recorrida (km): ");
            double distancia = scanner.nextDouble();
            System.out.print("Ingrese las calorías quemadas: ");
            double calorias = scanner.nextDouble();

            sumaVelocidad += velocidad;
            sumaDistancia += distancia;
            sumaCalorias += calorias;

            if (distancia > maxDistancia) {
                maxDistancia = distancia;
            }
            if (calorias > maxCalorias) {
                maxCalorias = calorias;
            }
        }

        // Calcular promedios
        double mediaVelocidad = sumaVelocidad / 10;
        double mediaDistancia = sumaDistancia / 10;
        double mediaCalorias = sumaCalorias / 10;

        // Mostrar ficha de seguimiento
        System.out.println("\nHola " + nombre + ", te presentamos la ficha de seguimiento de entrenamiento:");
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
        System.out.println("Sexo: " + sexo);
        System.out.println("Índice de masa corporal: " + imc);
        System.out.println("\nLa media del entrenamiento en 10 sesiones es:");
        System.out.println("Velocidad: " + mediaVelocidad + " km/h");
        System.out.println("Distancia recorrida: " + mediaDistancia + " km");
        System.out.println("Calorías quemadas: " + mediaCalorias);
        System.out.println("Máxima distancia recorrida: " + maxDistancia + " km");
        System.out.println("Máximo número de calorías quemadas en una sesión: " + maxCalorias);

        // Evaluar mejoras
        boolean mejora = false;
        if (mediaVelocidad > velocidadInicial) {
            System.out.println("¡Enhorabuena! Has mejorado tu velocidad media.");
            mejora = true;
        }
        if (mediaDistancia > distanciaInicial) {
            System.out.println("¡Enhorabuena! Has mejorado tu distancia media.");
            mejora = true;
        }
        if (mediaCalorias > caloriasIniciales) {
            System.out.println("¡Enhorabuena! Has mejorado tu quema de calorías media.");
            mejora = true;
        }
        if (!mejora) {
            System.out.println("Sigue entrenando para mejorar tus resultados.");
        }

        scanner.close();
    }
}
