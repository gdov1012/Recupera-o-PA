
import java.util.Scanner;



public class Rec_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] v1 = new int[5], v2 = new int[5], soma = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Posicao " + i + ": ");
            v1[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("Posicao " + i + ": ");
            v2[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++) soma[i] = v1[i] + v2[i];
        System.out.print("Vetor soma: ");
        for (int num : soma) System.out.print(num + " ");
        System.out.println();
    }
 
}
