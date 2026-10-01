import java.util.Scanner;

public class FitGymControl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de socios a procesar (N): ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        
        double recaudoTotal = 0;
        int cantidadVipBlack = 0;
        
        for (int i = 1; i <= n; i++) {
            System.out.println("\n--- Registro del Socio " + i + " ---");
            System.out.print("Nombre del socio: ");
            String nombre = scanner.nextLine();
            
            System.out.println("Seleccione el plan: 1. Básico, 2. VIP, 3. Black");
            int plan = scanner.nextInt();
            
            System.out.print("Ingrese la cantidad de meses: ");
            int meses = scanner.nextInt();
            
            System.out.print("¿Incluye entrenador? (1: Sí, 2: No): ");
            int opcionEntrenador = scanner.nextInt();
            boolean incluyeEntrenador = (opcionEntrenador == 1);
            scanner.nextLine(); 
            
          
        }
        
        scanner.close();
    }
}



