

import java.util.Scanner;


public class Rec_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas5 = new double[10];
        double soma = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a nota: ");
            notas5[i] = scanner.nextDouble();
            soma += notas5[i];
        }
        System.out.println("Media: " + (soma / 10));
    }
}
