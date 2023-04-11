/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nuevapracticaconjava;

import java.util.Scanner;

/**
 *
 * @author disenoydesarrollo
 */
public class Nuevapracticaconjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner objread=new Scanner(System.in);
       int num1=0,num2=1,num3,n;
       //leer la cantidad de elementos de la serie
        System.out.println("¿Cuantos elementos tiene la serie? ");
        n=objread.nextInt();
        System.out.println("\n Elementos de la serie \n");
        System.out.println(num1 + "  " + num2 + "  ");
        for (int i = 3; i <= n; i++) {
            num3=num1 + num2;
            System.out.print(num3 + "  ");
            num1=num2;
            num2=num3;
            
        }
        
    }
    
}
