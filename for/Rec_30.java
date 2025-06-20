
import javax.swing.JOptionPane;


public class Rec_30 {
    public static void main(String[] args) {
    int n = Integer.parseInt(JOptionPane.showInputDialog("Quantos números de Fibonacci?"));
int a = 0, b = 1;
String seq = a + "\n" + b + "\n";
for (int i = 2; i < n; i++) {
    int c = a + b;
    seq += c + "\n";
    a = b;
    b = c;
}
JOptionPane.showMessageDialog(null, seq);

}
}
