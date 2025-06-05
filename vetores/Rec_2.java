/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperacao_1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Rec_2 {
      public static void main(String[] args) {
        // TODO code application logic here
       Scanner scanner = new Scanner (System.in);
       int n [][]  = new int [2] [2]; //matriz
       
       System.out.println("Digite um numero inteiro:");
       for (int i = 0; i < n.length;i++){//linha
           for (int a = 0; a< n[i].length; a++){//coluna
               System.out.println("Posicao: ["+ i + " ]["+ a +"]"); //localizacao
               n [i][a] = scanner.nextInt();//leitura 
           }
       }
       System.out.println("Numeros fornecidos:");
       for (int i = 0; i < n.length;i++){//linha
           for (int a = 0; a< n[i].length; a++){//coluna
           System.out.print(n[i][a] + "\t");
           }
           System.out.println();//fechamento for
       }
        scanner.close();//fechamento scanner
           }}
       
