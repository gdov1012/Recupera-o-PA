
import javax.swing.*;


public class Rec_18 {
     public static void main(String[] args){
        int op18 = Integer.parseInt(JOptionPane.showInputDialog("1-Km para m\n2-m para cm\n3-cm para mm"));
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor:"));
        switch (op18) {
            case 1 -> JOptionPane.showMessageDialog(null, valor + " km = " + (valor * 1000) + " m");
            case 2 -> JOptionPane.showMessageDialog(null, valor + " m = " + (valor * 100) + " cm");
            case 3 -> JOptionPane.showMessageDialog(null, valor + " cm = " + (valor * 10) + " mm");
            default -> JOptionPane.showMessageDialog(null, "Opção inválida.");
        }
    }
}
