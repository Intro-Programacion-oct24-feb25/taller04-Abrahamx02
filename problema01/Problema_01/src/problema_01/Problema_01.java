/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema_01;
 import java.util.Scanner;   
/**
 *
 * @author Usuarioo
 */
public class Problema_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner area = new Scanner(System.in);
        
        double base;
        double altura;
        double area_t;
        
        System.out.println("Ingrese la base del triangulo: ");
        base = area.nextDouble();
        System.out.println("Ingrese la altura del triangulo: ");
        altura = area.nextDouble();
        
        area_t = (base * altura)/2;
        
        System.out.println("El area del triangulo es: "+area_t);
        
    }
    
}