/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema_04;
import java.util.Scanner;
/**
 *
 * @author Usuarioo
 */
public class Problema_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner cost_parts = new Scanner(System.in);
    
    String name_own;
    Double cpu;
    Double teclado;
    Double raton;
    Double pantalla;
    
    System.out.println("ingrese el nombre del cliente");
     name_own = cost_parts.nextLine();
     
    System.out.println("ingrese el precio de la CPU");
     cpu = cost_parts.nextDouble();
     
    System.out.println("ingrese el precio del teclado");
     teclado = cost_parts.nextDouble();
     
    System.out.println("ingrese el precio del raton");
     raton = cost_parts.nextDouble();
     
    System.out.println("ingrese el precio de la pantalla");
    pantalla = cost_parts.nextDouble();
    
    double total = cpu+teclado+raton+pantalla;
        System.out.printf("Reporte: \nNombres del cliente: %s\nValores "
                         + "iniciales:"
                         + "\nCPU:  $ %.0f\nTeclado:  $ %.0f\nRatón:  $ %.0f\n"
                         + "pantalla:  $ %.0f\n\n\nValor a cancelar: $%.0f",                        
                            name_own,
                            cpu,
                            teclado,
                            raton, 
                            pantalla,
                            total);
    
    }
    
}
