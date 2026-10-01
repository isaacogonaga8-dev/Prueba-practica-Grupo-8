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
            
            System.out.println("Seleccione el plan:");
            System.out.println("1. Básico ($30/mes)");
            System.out.println("2. VIP ($50/mes)");
            System.out.println("3. Black ($80/mes)");
            System.out.print("Opción (1-3): ");
            int plan = scanner.nextInt();
            
            System.out.print("Ingrese la cantidad de meses: ");
            int meses = scanner.nextInt();
            
            System.out.print("¿Incluye entrenador personal? (1: Sí, 2: No): ");
            int opcionEntrenador = scanner.nextInt();
            boolean incluyeEntrenador = (opcionEntrenador == 1);
            scanner.nextLine(); 
            
            
            double tarifaBaseMes = 0;
            switch (plan) {
                case 1:
                    tarifaBaseMes = 30.0;
                    break;
                case 2:
                    tarifaBaseMes = 50.0;
                    cantidadVipBlack++; 
                    break;
                case 3:
                    tarifaBaseMes = 80.0;
                    cantidadVipBlack++; 
                    break;
                default:
                    System.out.println("Plan no válido. Se asignará Básico por defecto.");
                    tarifaBaseMes = 30.0;
                    plan = 1;
                    break;
            }
            
            double subtotal = tarifaBaseMes * meses;
            
          
            double descuento = 0;
            if (meses >= 12) {
                descuento = subtotal * 0.20;
            } else if (meses >= 6) {
                descuento = subtotal * 0.10; 
            }
            
           
            double costoEntrenador = 0;
            if (incluyeEntrenador) {
                costoEntrenador = 15.0 * meses;
            }
            
            double totalSocio = (subtotal - descuento) + costoEntrenador;
            recaudoTotal += totalSocio; 
            
            System.out.println("--> Total a pagar por " + nombre + ": $" + totalSocio);
        }
        
        
        double promedioPagado = (n > 0) ? (recaudoTotal / n) : 0;
        
        
        System.out.println("\n========================================");
        System.out.println("      REPORTE FINAL - FITGYM CONTROL    ");
        System.out.println("========================================");
        System.out.println("Recaudo total del gimnasio: $" + recaudoTotal);
        System.out.println("Cantidad de planes VIP/Black: " + cantidadVipBlack);
        System.out.println("Promedio pagado por socio: $" + promedioPagado);
        
        scanner.close();
    }
}
