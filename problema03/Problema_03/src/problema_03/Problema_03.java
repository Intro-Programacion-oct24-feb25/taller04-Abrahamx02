/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema_03;
import java.util.Scanner;
/**
 *
 * @author Usuarioo
 */
public class Problema_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner datos = new Scanner(System.in);
    
    String name_own;
    String direction;
    Double cost_min;
    Double min_mounth;
    
      System.out.println("ingrese el nombre del dueño");
      name_own = datos.nextLine();
    
      System.out.println("ingrese la direccion del domicilio");
      direction = datos.nextLine();
    
      System.out.println("ingrese el costo por minuto");
      cost_min = datos.nextDouble();
    
      System.out.println("ingrese el numero de minutos consumidos en el mes");
      min_mounth = datos.nextDouble();
    
    double calculo = cost_min*min_mounth;
    
      System.out.printf("Reporte:\nNombres completos: %s\n  Direccion: %s\n"
                + "Costo por minuto: $%.2f\n  Número de minutos consumidos: %."
                + "2f\n"
                + "    Valor a cancelar: $%.2f",
                name_own,
                direction,
                cost_min,
                min_mounth,
                calculo);
    
    }
    
}
