

import java.util.Scanner;


public class Rec_8 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int Pares = 0;
        System.out.println("Digite os valores:");
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = scanner.nextInt();
                if (matriz[i][j] % 2 == 0) Pares++;
            }
        System.out.println("Quantidade de pares: " + Pares);
    }
}

