
import java.util.Scanner;

public class Rec_9 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int maior = Integer.MIN_VALUE, linhaMaior = 0, colunaMaior = 0;
        System.out.println("Digite os valores da matriz:");
        for (int i = 0; i < 5; i++)
            for (int a = 0; a < 5; a++) {
                matriz[i][a] = scanner.nextInt();
                if (matriz[i][a] > maior) {
                    maior = matriz[i][a];
                    linhaMaior = i;
                    colunaMaior = a;
                }
            }
        System.out.println("Maior valor: " + maior + " na posicao [" + linhaMaior + "][" + colunaMaior + "]");
    }
}
