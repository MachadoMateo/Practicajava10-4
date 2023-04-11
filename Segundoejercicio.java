/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package segundoejercicio;

import java.util.Scanner;

/**
 *
 * @author disenoydesarrollo
 */
public class Segundoejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definicion de objetos y variables
        Scanner objread=new Scanner(System.in);
        double fact=1;
        int n;
        //Lectura numero para factorial
        System.out.print("Digite numero entero positivo ");
        n=objread.nextInt();
        //generar factorial
        for (int i = 2; i<=n; i++){
            fact*=i;
        }
        System.out.println("\n El factorial de " + n + " es " + fact );
                
    }
    
}
