
import javax.swing.JOptionPane;


public class Rec_24 {
      public static void main(String[] args) {
        String nomes = "";
for (int i = 0; i < 10; i++) {
    nomes += JOptionPane.showInputDialog("Digite o nome " + (i+1)) + "\n";
}

JOptionPane.showMessageDialog(null, nomes);

    }

}
