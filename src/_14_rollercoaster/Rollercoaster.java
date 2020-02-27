package _14_rollercoaster;

import javax.swing.JOptionPane;

public class Rollercoaster {
public static void main(String[] args) {
String quantity = JOptionPane.showInputDialog("How old are you");
 int num = Integer.parseInt(quantity);
 if (num>200) {JOptionPane.showMessageDialog(null,"YOU ARE TOO YOUNG GET OUT AND NEVER COME BACK");}
 else {JOptionPane.showMessageDialog(null,"I guess your old enaugh? You must be a super senior");}

}
}