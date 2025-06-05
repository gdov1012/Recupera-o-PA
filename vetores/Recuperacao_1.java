/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recuperacao_1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Recuperacao_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner scanner = new Scanner (System.in);
        int [] numero = new int [5]; //vetor
        
        for (int n = 0; n < numero.length; n++){ //Laco de repeticao
            System.out.println("Informe um numero inteiro:");
            numero[n] = scanner.nextInt(); //leitura e armazenamento
        }
        scanner.close(); //fechamento
        
        System.out.println("Os numeros sao:  " );
        for (int num : numero){
            System.out.println(num + " ");
        }
    }
    
}
