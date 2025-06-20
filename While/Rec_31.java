
import javax.swing.JOptionPane;



public class Rec_31 {
     public static void main(String[] args) {
        int soma = 0;
int num;
do {
    num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número (0 para sair):"));
    soma += num;
} while (num != 0);
JOptionPane.showMessageDialog(null, "Soma: " + soma);

    }

}
