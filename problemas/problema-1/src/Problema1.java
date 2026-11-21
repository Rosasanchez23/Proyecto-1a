/**
 * Propósito: Calcular el impuesto y costo final de un equipo informático 
 * aplicando reglas de lógica proposicional (conjunción, XOR y negación) 
 * según si el comprador es estudiante acreditado y si el equipo es de catálogo educativo.
 * 
 * Entradas: 
 * - precioBase (double): Precio base del equipo informático en pesos.
 * - inputP (int): 1 si es estudiante acreditado, 0 si no lo es.
 * - inputQ (int): 1 si el equipo es de catálogo educativo, 0 si no lo es.
 * 
 * Salidas: 
 * - Valores booleanos de las proposiciones p y q.
 * - Política fiscal aplicada (0%, 8% o 16%).
 * - Desglose del precio base, monto de impuesto y costo final formateados a 2 decimales.
 */
import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args) {
        Scanner owo = new Scanner(System.in);
        System.out.println("=== MÓDULO FINANCIERO-LÓGICO DE IMPUESTOS ==="); 
        
        // 1. Entrada de datos: Precio base del equipo
        System.out.print("Precio base del equipo informático ($): ");
        double precioBase = owo.nextDouble();
        
        // 2. Entrada de las proposiciones atómicas (1 = Verdadero, 0 = Falso)
        System.out.print("¿Es estudiante acreditado? (1 = Sí / 0 = No): ");
        int inputP = owo.nextInt();
        System.out.print("¿El equipo es de catálogo educativo? (1 = Sí / 0 = No): ");
        int inputQ = owo.nextInt();

        // Validación básica de entradas (0 o 1)  
        if ((inputP != 0 && inputP != 1) || (inputQ != 0 && inputQ != 1)) {
            System.out.println("\nError: Debe ingresar solo 1 (Verdadero) o 0 (Falso).");
            owo.close();
            return;
        }

        // Conversión de valores enteros (1/0) a valores booleanos (true/false)
        boolean p = (inputP == 1); // p: El comprador es estudiante acreditado
        boolean q = (inputQ == 1); // q: El equipo adquirido es de catálogo educativo

        double tasaImpuesto = 0.0;
        String reglaAplicada = "";

        // 3. Evaluación de las Reglas de Negocio / Políticas Fiscales 
        if (p && q) {
            // Regla 1: Exención Total (p ∧ q) -> Tasa 0% 
            tasaImpuesto = 0.00;
            reglaAplicada = "Total de Impuesto (p ∧ q) - Tasa 0%";
        } else if (p ^ q) { 
            // Regla 2: Impuesto Subvencionado (p ⊕ q) -> Tasa 8%
            // Nota: En Java, el operador '^' evalúa el XOR (O exclusivo)
            tasaImpuesto = 0.08;
            reglaAplicada = "Impuesto Reducido (p ⊕ q) - Tasa 8%";
        } else if (!p && !q) {
            // Regla 3: Impuesto General Standard (¬p ∧ ¬q) -> Tasa 16%
            tasaImpuesto = 0.16;
            reglaAplicada = "Impuesto Total (¬p ∧ ¬q) - Tasa 16%";
        }

        // 4. Cálculo del monto de impuesto y costo final
        double montoImpuesto = precioBase * tasaImpuesto;
        double costoFinal = precioBase + montoImpuesto;

        // 5. Mostrar resultados en consola
        System.out.println("\n--- RESULTADO ---");
        System.out.println("Proposición p (Estudiante): " + (p ? "Verdadero (1)" : "Falso (0)"));
        System.out.println("Proposición q (Catálogo educativo): " + (q ? "Verdadero (1)" : "Falso (0)"));
        System.out.println("Política aplicada: " + reglaAplicada);
        System.out.printf("Precio base:     $%.2f%n", precioBase);
        System.out.printf("Impuesto (%.0f%%):  $%.2f%n", (tasaImpuesto * 100), montoImpuesto);
        System.out.printf("Costo final:     $%.2f%n", costoFinal);

       
    }
}