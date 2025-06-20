
import javax.swing.*;

public class Rec_14 {
     public static void main(String[] args) {
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 12:"));

        switch (mes) {
            case 1 -> JOptionPane.showMessageDialog(null, "Janeiro");
            case 2 -> JOptionPane.showMessageDialog(null, "Fevereiro");
            case 3 -> JOptionPane.showMessageDialog(null, "Marco");
            case 4 -> JOptionPane.showMessageDialog(null, "Abriu");
            case 5 -> JOptionPane.showMessageDialog(null, "Maio");
            case 6 -> JOptionPane.showMessageDialog(null, "Junho");
            case 7 -> JOptionPane.showMessageDialog(null, "Julho");
            case 8 -> JOptionPane.showMessageDialog(null, "Agosto");
            case 9 -> JOptionPane.showMessageDialog(null, "Setembro");
            case 10 -> JOptionPane.showMessageDialog(null, "Outubro");
            case 11 -> JOptionPane.showMessageDialog(null, "Novembro");
            case 12 -> JOptionPane.showMessageDialog(null, "Dezembro");
            default -> JOptionPane.showMessageDialog(null, "Opcao Invalida");
        }

    }
}
