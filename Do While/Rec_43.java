
import javax.swing.JOptionPane;


public class Rec_43 {
    public static void main(String[] args) {
    int opcao;
do {
    opcao = Integer.parseInt(JOptionPane.showInputDialog("Menu:\n1 - Cadastro\n2 - Listagem\n3 - Edição\n0 - Sair"));
    switch (opcao) {
        case 1: JOptionPane.showMessageDialog(null, "Cadastrando..."); break;
        case 2: JOptionPane.showMessageDialog(null, "Listando..."); break;
        case 3: JOptionPane.showMessageDialog(null, "Editando..."); break;
        case 0: JOptionPane.showMessageDialog(null, "Saindo..."); break;
        default: JOptionPane.showMessageDialog(null, "Opção inválida");
    }
} while (opcao != 0);


}
}
