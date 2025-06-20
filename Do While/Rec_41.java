
import javax.swing.JOptionPane;


public class Rec_41 {
public static void main(String[] args) {
    int i = 1;
String resultado = "";
do {
    resultado += i + "\n";
    i++;
} while (i <= 10);
JOptionPane.showMessageDialog(null, resultado);

}    
}
