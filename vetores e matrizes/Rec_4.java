

import java.util.Scanner;

public class Rec_4 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz4 = new int[3][3];
        System.out.println("Digite os valores:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                matriz4[i][j] = scanner.nextInt();
        System.out.println("Diagonal principal:");
        for (int i = 0; i < 3; i++)
            System.out.println(matriz4[i][i]);
    }
}
