
import javax.swing.JOptionPane;


public class Rec_50 {
     public static void main(String[] args) {
        double saldo = 2000.0;
int opcao;
do {
    opcao = Integer.parseInt(JOptionPane.showInputDialog("Menu Bancário:\n1 - Saldo\n2 - Saque\n3 - Depósito\n0 - Sair"));
    switch (opcao) {
        case 1 -> JOptionPane.showMessageDialog(null, "Saldo atual: R$ " + saldo);
        case 2 -> {
            double saque = Double.parseDouble(JOptionPane.showInputDialog("Valor do saque:"));
            if (saque <= saldo) {
                saldo -= saque;
                JOptionPane.showMessageDialog(null, "Saque realizado. Novo saldo: R$ " + saldo);
            } else {
                JOptionPane.showMessageDialog(null, "Saldo insuficiente.");
            }   }
        case 3 -> {
            double deposito = Double.parseDouble(JOptionPane.showInputDialog("Valor do depósito:"));
            saldo += deposito;
            JOptionPane.showMessageDialog(null, "Depósito realizado. Novo saldo: R$ " + saldo);
                }
        case 0 -> JOptionPane.showMessageDialog(null, "Saindo...");
        default -> JOptionPane.showMessageDialog(null, "Opção inválida.");
    }
} while (opcao != 0);

    }

}
