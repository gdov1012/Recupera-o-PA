
import javax.swing.JOptionPane;


public class Rec_28 {
     public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
int fat = 1;
for (int i = num; i >= 1; i--) {
    fat *= i;
}
    JOptionPane.showMessageDialog(null, "Fatorial: " + fat);

    }
}
