

public class Rec_40 {
        public static void main(String[] args) {
        int opcao;
do {
    opcao = Integer.parseInt(JOptionPane.showInputDialog(
        "Calculadora:\n1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir\n0 - Sair"));
    if (opcao >= 1 && opcao <= 4) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1º número:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2º número:"));
        double r = 0;
        switch (opcao) {
            case 1: r = a + b; break;
            case 2: r = a - b; break;
            case 3: r = a * b; break;
            case 4: r = (b != 0) ? a / b : 0; break;
        }
        JOptionPane.showMessageDialog(null, "Resultado: " + r);
    } else if (opcao != 0) {
        JOptionPane.showMessageDialog(null, "Opção inválida");
    }
} while (opcao != 0);

    }
}
