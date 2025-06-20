
import javax.swing.JOptionPane;


public class Rec_27 {
     public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
    String nome = JOptionPane.showInputDialog("Nome do aluno:");
    double n1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1:"));
    double n2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2:"));
    double media = (n1 + n2) / 2;
    JOptionPane.showMessageDialog(null, nome + " - Média: " + media);
}

    }
}
