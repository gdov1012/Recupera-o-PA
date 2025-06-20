
import javax.swing.*;


public class Rec_19 {
       public static void main(String[] args){
        String[] nomes = new String[5];
        int pos = 0;
        while (true) {
            int op19 = Integer.parseInt(JOptionPane.showInputDialog("""
                    1 - Adicionar cliente
                    2 - Listar clientes
                    3 - Editar cliente
                    4 - Excluir cliente
                    0 - Sair"""));
            if (op19 == 0) break;
            switch (op19) {
                case 1 -> {
                    if (pos < nomes.length) {
                        nomes[pos] = JOptionPane.showInputDialog("Digite o nome:");
                        pos++;
                    } else {
                        JOptionPane.showMessageDialog(null, "Cadastro cheio.");
                    }
                }
                case 2 -> {
                    String lista = "Clientes:\n";
                    for (int i = 0; i < pos; i++) {
                        lista += (i + 1) + ": " + nomes[i] + "\n";
                    }
                    JOptionPane.showMessageDialog(null, lista);
                }
                case 3 -> {
                    int ed = Integer.parseInt(JOptionPane.showInputDialog("Qual índice editar (1 a " + pos + ")?")) - 1;
                    if (ed >= 0 && ed < pos)
                        nomes[ed] = JOptionPane.showInputDialog("Novo nome:");
                }
                case 4 -> {
                    int ex = Integer.parseInt(JOptionPane.showInputDialog("Qual índice excluir (1 a " + pos + ")?")) - 1;
                    if (ex >= 0 && ex < pos) {
                        for (int i = ex; i < pos - 1; i++) nomes[i] = nomes[i + 1];
                        pos--;
                    }
                }
                default -> JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }

    }
}
