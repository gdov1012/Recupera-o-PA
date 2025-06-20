

public class Rec_39 {
    public static void main(String[] args) {
        String login, senha;
do {
    login = JOptionPane.showInputDialog("Login:");
    senha = JOptionPane.showInputDialog("Senha:");
} while (!login.equals("admin") || !senha.equals("1234"));
JOptionPane.showMessageDialog(null, "Acesso liberado!");

    }
}
