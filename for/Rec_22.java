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
public class Rec_22 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner (System.in);
         int soma = 0; //armazenamento
         
         for (int i = 0; i<5; i++){//repeticao
             System.out.println("Digite um numero inteiro: ");
             soma += scanner.nextInt(); //Le e soma
         }
         System.out.println("A soma eh: " +soma);
         
}}
