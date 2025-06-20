
import javax.swing.*;


public class Rec_15 {
       public static void main(String[] args){
        double saldo = 2000.0;
        int op15 = Integer.parseInt(JOptionPane.showInputDialog("1-Sacar\n2-Depositar\n3-Ver Saldo"));
        switch (op15) {
            case 1 -> {
                double saque = Double.parseDouble(JOptionPane.showInputDialog("Valor do saque:"));
                if (saque <= saldo) {
                    saldo -= saque;
                    JOptionPane.showMessageDialog(null, "Saque realizado. Novo saldo: " + saldo);
                } else {
                    JOptionPane.showMessageDialog(null, "Saldo insuficiente.");
                }
            }
            case 2 -> {
                double dep = Double.parseDouble(JOptionPane.showInputDialog("Valor do depósito:"));
                saldo += dep;
                JOptionPane.showMessageDialog(null, "Depósito feito. Novo saldo: " + saldo);
            }
            case 3 -> JOptionPane.showMessageDialog(null, "Saldo atual: " + saldo);
            default -> JOptionPane.showMessageDialog(null, "Opção inválida.");
        }
    }
}
