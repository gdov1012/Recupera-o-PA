
import javax.swing.*;

public class Rec_13 {
    
  public static void main(String[] args) {
        char letra = JOptionPane.showInputDialog("Digite uma letra:").toLowerCase().charAt(0);
        switch (letra) {
            case 'a' -> JOptionPane.showMessageDialog(null, "Vogal");
            case 'e' -> JOptionPane.showMessageDialog(null, "Vogal");
            case 'i' -> JOptionPane.showMessageDialog(null, "Vogal");
            case 'o' -> JOptionPane.showMessageDialog(null, "Vogal");
            case 'u' -> JOptionPane.showMessageDialog(null, "Vogal");

            default -> JOptionPane.showMessageDialog(null, "Consoante");
        }
    }}
