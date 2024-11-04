/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema_02;
import java.util.Scanner;
/**
 *
 * @author Usuarioo
 */
public class Problema_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner gastos = new Scanner(System.in); 
        
    double gastos_hijo1;
    double gastos_hijo2;
    double gastos_hijo3;
    String hijo1;
    String hijo2;
    String hijo3;
    
    
        System.out.println("ingrese el noombre del hijo 1");
        hijo1 = gastos.nextLine();
        
        System.out.println("ingrese los gastos del hijo 1");
        gastos_hijo1 = gastos.nextDouble();
        
        System.out.println("ingrese el nombre del hijo 2");
        gastos.nextLine();
        hijo2 = gastos.nextLine();
        
        System.out.println("ingrese los gastos del hijo 2");
        gastos_hijo2 = gastos.nextDouble();
        
        System.out.println("ingrese el nombre del hijo 3");
        gastos.nextLine();
        hijo3 = gastos.nextLine();
        
        System.out.println("ingrese los gastos del hijo 3");
        gastos_hijo3 = gastos.nextDouble();
    
    double gastos_total = (gastos_hijo1 + gastos_hijo2 + gastos_hijo3);
        System.out.println("los gastos de:\n\t"+hijo1+":" +gastos_hijo1);
        System.out.println("los gastos de:\n\t"+hijo2+":" +gastos_hijo2);
        System.out.println("los gastos de:\n\t"+hijo3+":" +gastos_hijo3);
        System.out.println("los gastos totales del padre son:\n\t" 
                           +gastos_total);
        
        
        
        
         
    }
    
}
