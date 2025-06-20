

public class Rec_33 {
      public static void main(String[] args) {
        String senha;
do {
    senha = JOptionPane.showInputDialog("Digite a senha:");
} while (!senha.equals("1234"));
JOptionPane.showMessageDialog(null, "Acesso permitido!");

    }
}
