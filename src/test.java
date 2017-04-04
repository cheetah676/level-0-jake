import javax.swing.JOptionPane;

public class test {
	public static void main(String[] args) {
		String score = JOptionPane.showInputDialog("What is your highest bowling score?");
		int i = Integer.parseInt(score);
		if (i >= 0 && i < 100) {
			JOptionPane.showConfirmDialog(null, "You need to practice more.");
		} else if (i >= 100 && i < 200) {
			JOptionPane.showConfirmDialog(null, "You are good.");
		} else if (i >= 200 && i <= 300) {
			JOptionPane.showConfirmDialog(null, "GO PRO");
		} else {
			JOptionPane.showConfirmDialog(null, "That's impossible!");
		}
	}
}
