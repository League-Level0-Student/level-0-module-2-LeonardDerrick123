package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public static void main(String[] args) {
	Random random = new Random();
	int r1 = random.nextInt(9);
	int r2 = random.nextInt(9);
	int r3 = random.nextInt(9);
	int r4 = random.nextInt(9);
	int r5 = random.nextInt(9);
	JOptionPane.showMessageDialog(null, "Lottery Ticket "+r1+r2+r3+r4+r5);
}};
