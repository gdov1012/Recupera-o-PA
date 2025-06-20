

public class Rec_38 {
     public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para contagem regressiva:"));
String resultado = "";
while (num >= 0) {
    resultado += num + "\n";
    num--;
}
JOptionPane.showMessageDialog(null, resultado);

    }
}
