import javax.swing.*;

public class Rec_11 {
     public static void main(String[] args){
        String num = JOptionPane.showInputDialog("Digete um numero de 1 a 3:");

        switch (num) {
            case "1" -> JOptionPane.showMessageDialog(null, "Verde");
            case "2" -> JOptionPane.showMessageDialog(null, "Amarelo");
            case "3" -> JOptionPane.showMessageDialog(null, "Roxo");

            default -> JOptionPane.showMessageDialog(null, "Opcao invalida");
        }
    }
}
