
import javax.swing.JOptionPane;


public class Rec_47 {
     public static void main(String[] args) {
        String senha;
int tentativas = 0;
boolean acesso = false;
do {
    senha = JOptionPane.showInputDialog("Digite a senha:");
    tentativas++;
    if (senha.equals("1234")) {
        acesso = true;
    } else {
        JOptionPane.showMessageDialog(null, "Senha incorreta");
    }
} while (!acesso && tentativas < 3);

if (acesso) {
    JOptionPane.showMessageDialog(null, "Acesso permitido");
} else {
    JOptionPane.showMessageDialog(null, "Acesso bloqueado");
}

    }
}
