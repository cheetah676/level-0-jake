import java.util.Random;

import javax.swing.JOptionPane;

public class user {
	public static void main(String[] args) {
		String i =JOptionPane.showInputDialog(null, "Type in a number.");
		int j=Integer.parseInt(i);
		Random rand=new Random();
		for (int j21 = 0; j21<=1000;j21++) {
		int j2=rand.nextInt(100)+1;
		if (j2==j){
			JOptionPane.showMessageDialog(null, j21);
			break;
		}
		}
	}
}
