
import javax.swing.JOptionPane;


public class Rec_26 {
     public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
String tabuada = "";
for (int i = 1; i <= 10; i++) {
    tabuada += n + " x " + i + " = " + (n*i) + "\n";
}
JOptionPane.showMessageDialog(null, tabuada);

    }
}
