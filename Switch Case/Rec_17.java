import javax.swing.*;


public class Rec_17 {
     public static void main(String[] args){
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
        char op = JOptionPane.showInputDialog("Digite o operador (+ - * /):").charAt(0);
        switch (op) {
            case '+' -> JOptionPane.showMessageDialog(null, "Resultado: " + (n1 + n2));
            case '-' -> JOptionPane.showMessageDialog(null, "Resultado: " + (n1 - n2));
            case '*' -> JOptionPane.showMessageDialog(null, "Resultado: " + (n1 * n2));
            case '/' -> {
                if (n2 != 0)
                    JOptionPane.showMessageDialog(null, "Resultado: " + (n1 / n2));
                else
                    JOptionPane.showMessageDialog(null, "Divisão por zero!");
            }
            default -> JOptionPane.showMessageDialog(null, "Operador inválido.");
        }
    }
}
