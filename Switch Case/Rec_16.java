
import javax.swing.*;


public class Rec_16 {
 
       public static void main(String[] args){
        String produto = JOptionPane.showInputDialog("Digite o nome do produto:").toLowerCase();
        switch (produto) {
            case "maçã", "banana", "uva" -> JOptionPane.showMessageDialog(null, "Categoria: Fruta");
            case "cenoura", "batata", "beterraba" -> JOptionPane.showMessageDialog(null, "Categoria: Legume");
            case "leite", "iogurte", "queijo" -> JOptionPane.showMessageDialog(null, "Categoria: Laticínio");
            default -> JOptionPane.showMessageDialog(null, "Categoria desconhecida.");
        }
    }}

