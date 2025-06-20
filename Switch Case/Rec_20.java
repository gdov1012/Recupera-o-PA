
import javax.swing.*;

public class Rec_20 {
  public static void main(String[] args){
        int[] votos = new int[3]; 
        int voto;
        do {
            voto = Integer.parseInt(JOptionPane.showInputDialog("Vote:\n1 - Candidato 1\n2 - Candidato 2\n3 - Candidato 3\n0 - Fim"));
            if (voto >= 1 && voto <= 3)
                votos[voto - 1]++;
        } while (voto != 0);
        JOptionPane.showMessageDialog(null,"Resultado da votação:\n" + "Candidato 1: " + votos[0] + "\nCandidato 2: " + votos[1] + "\nCandidato 3: " + votos[2]);
    }  
}
