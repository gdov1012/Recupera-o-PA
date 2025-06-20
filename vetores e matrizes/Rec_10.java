
import java.util.Scanner;




public class Rec_10 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz10 = new int[3][3];
        boolean simetrica = true;
        System.out.println("Digite os valores:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                matriz10[i][j] = scanner.nextInt();
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (matriz10[i][j] != matriz10[j][i]) simetrica = false;
        System.out.println("A matriz eh simetrica? " + (simetrica ? "Sim" : "Nao"));
    }
}
