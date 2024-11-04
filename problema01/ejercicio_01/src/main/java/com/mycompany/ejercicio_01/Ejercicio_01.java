/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_01;

import java.util.Scanner;

/**
 *
 * @author Usuarioo
 */
public class Ejercicio_01 {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        int base;
        int altura;
        
        
        System.out.println("Ingrese la base del triangulo");
         base = Integer.parseInt(entrada.nextLine());
       
        
        System.out.println("Ingrese la altura del triangulo");
         altura = Integer.parseInt(entrada.nextLine());
        
        int resultado = (base * altura)/2;
        
        System.out.println("el area del triangulo es:"+resultado);
        
   
    }
}
