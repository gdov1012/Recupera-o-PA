
import javax.swing.JOptionPane;


public class Rec_45 {
    public static void main(String[] args) {
    
    double total = 0;
int opcao;
do {
    double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da compra:"));
    total += valor;
    opcao = JOptionPane.showConfirmDialog(null, "Deseja adicionar outra compra?", "Continuar", JOptionPane.YES_NO_OPTION);
} while (opcao == JOptionPane.YES_OPTION);
JOptionPane.showMessageDialog(null, "Total das compras: R$ " + total);

}
}
