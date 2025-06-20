

import java.util.Scanner;

public class Recuperacao_1 {

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
