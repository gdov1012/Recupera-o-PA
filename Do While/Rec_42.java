
import javax.swing.JOptionPane;


public class Rec_42 {
    public static void main(String[] args) {
    int cont = 0;
int num;
do {
    num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
    if (num >= 0) cont++;
} while (num >= 0);
JOptionPane.showMessageDialog(null, "Quantidade de números positivos: " + cont);

}
}
