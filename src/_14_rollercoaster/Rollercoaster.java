package _14_rollercoaster;

import javax.swing.JOptionPane;

public class Rollercoaster {
public static void main(String[] args) {
String quantity = JOptionPane.showInputDialog("How tall are you");
 int num = Integer.parseInt(quantity);
 if (num>1001) {JOptionPane.showMessageDialog(null,"I guess your tall enaugh? You must be a giant");}
 else {JOptionPane.showMessageDialog(null,"YOU ARE TOO SHORT GET OUT AND NEVER COME BACK");}

}
}