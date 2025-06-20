
import javax.swing.JOptionPane;


public class Rec_25 {
       public static void main(String[] args) {
        int maior = Integer.MIN_VALUE;
for (int i = 0; i < 10; i++) {
    int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
    if (num > maior) maior = num;
}
JOptionPane.showMessageDialog(null, "Maior número: " + maior);
    }
}
