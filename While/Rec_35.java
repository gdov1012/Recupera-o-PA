

public class Rec_35 {
        public static void main(String[] args) {
        int soma = 0, cont = 0;
int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade (-1 para sair):"));
while (idade != -1) {
    soma += idade;
    cont++;
    idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade (-1 para sair):"));
}
double media = (cont > 0) ? (double)soma / cont : 0;
JOptionPane.showMessageDialog(null, "Média das idades: " + media);

    }
}
