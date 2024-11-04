/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema_05;
import java.util.Scanner;
/**
 *
 * @author Usuarioo
 */
public class Problema_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner cost_services = new Scanner (System.in);
       
      double cost_netflix;
      double cost_youtubePremium;
      double cost_dropbox;
      double cost_spotify;
      
        System.out.println("ingrese el costo mensual de netflix");
         cost_netflix = cost_services.nextDouble();
         
        System.out.println("ingrese el costo mensual de youtube premium");
         cost_youtubePremium = cost_services.nextDouble();
        
        System.out.println("ingrese el costo mensual de dropbox");
         cost_dropbox = cost_services.nextDouble();
         
        System.out.println("ingrese el costo mensual de spotify");
         cost_spotify = cost_services.nextDouble();
         
      double subtotal = cost_netflix+cost_youtubePremium+cost_dropbox+
                       cost_spotify;
      
      double descuentoN = cost_netflix*0.77;
  
      double descuentoY = cost_youtubePremium*0.77;
              
      double descuentoDb = cost_dropbox*0.55;
     
      double calculo = descuentoN+descuentoY+descuentoDb+cost_spotify;
      
        System.out.printf("-Reporte sobre el total mensual de los servicios "
                + "digitales-\nSubtotal: $%.2f\nDescuentos: \n\tNetflix 23%%: $"
                + "%.2f\n\tYoutube Premium 23%%: $%.2f\n\tDropbox 45%%: $%.2f\n"
                + "Sin descuento: \n\tSpotify: $%.2f\nTotal: $%.2f"
                + "\n__________________________________________________________"
                + "__\n",
                  subtotal,
                  descuentoN,
                  descuentoY,
                  descuentoDb,
                  cost_spotify,
                  calculo);
        
    }
    
}
