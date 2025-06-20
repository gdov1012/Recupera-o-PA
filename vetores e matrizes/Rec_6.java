

import java.util.Scanner;


public class Rec_6 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int maior10 = 0;
        System.out.println("Digite 9 valores:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();
                if (matriz[i][j] > 10) maior10++;
            }
        System.out.println("Valores maiores que 10: " + maior10);
    }
}
