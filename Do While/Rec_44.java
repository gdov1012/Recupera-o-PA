
import javax.swing.JOptionPane;


public class Rec_44 {
    public static void main(String[] args) {
    String nome;
String todos = "";
do {
    nome = JOptionPane.showInputDialog("Digite um nome (ou 'fim' para encerrar):");
    if (!nome.equalsIgnoreCase("fim")) {
        todos += nome + "\n";
    }
} while (!nome.equalsIgnoreCase("fim"));
JOptionPane.showMessageDialog(null, "Nomes digitados:\n" + todos);


 }
}
