
import javax.swing.JOptionPane;


public class Rec_49 {
    public static void main(String[] args) {
        String login, senha;
int tentativas = 0;
boolean autenticado = false;
do {
    login = JOptionPane.showInputDialog("Login:");
    senha = JOptionPane.showInputDialog("Senha:");
    tentativas++;
    if (login.equals("admin") && senha.equals("1234")) {
        autenticado = true;
    } else {
        JOptionPane.showMessageDialog(null, "Login ou senha inválidos");
    }
} while (!autenticado && tentativas < 3);

if (autenticado) {
    JOptionPane.showMessageDialog(null, "Bem-vindo!");
} else {
    JOptionPane.showMessageDialog(null, "Acesso negado");
}

    }
}
