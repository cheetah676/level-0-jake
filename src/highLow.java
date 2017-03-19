import java.util.Random;

import javax.swing.JOptionPane;

public class highLow {
	public static void main(String[]args){
		Random dumpTrump = new Random();
		int x = dumpTrump.nextInt(100);
		for (int j = 0; j <7; j++) {
			
		String i=JOptionPane.showInputDialog("Try to guess the code!");
		int guess=Integer.parseInt(i);
		if (guess==x){
			JOptionPane.showConfirmDialog(null, "You got it!");
			j += 1;
			JOptionPane.showConfirmDialog(null, "It took you "+ j + " tries");
			break;
			}
		else if(guess>x){
			JOptionPane.showConfirmDialog(null, "HIGH");
		}
		else if(j==7){
			JOptionPane.showConfirmDialog(null, "The code was "+dumpTrump);
		}
		else{
			JOptionPane.showConfirmDialog(null, "LOW");
		}
	}
	}
}
