import javax.swing.*;

public class Rec_12 {
      public static void main(String[] args){
    String num = JOptionPane.showInputDialog("Digite um numero de 1 a 7");

        switch (num){
        case "1" -> JOptionPane.showMessageDialog(null, "Domingo");

        case "2" -> JOptionPane.showMessageDialog(null, " Segunda");

        case "3" -> JOptionPane.showMessageDialog(null, "Terça");

        case "4" -> JOptionPane.showMessageDialog(null, "Quarta");

        case "5" -> JOptionPane.showMessageDialog(null, "Quinta");

        case "6" -> JOptionPane.showMessageDialog(null, "Sexta");

        case "7" -> JOptionPane.showMessageDialog(null, "Sabado");

        default -> JOptionPane.showMessageDialog(null, "Opçao invaçida");
    }
}}
