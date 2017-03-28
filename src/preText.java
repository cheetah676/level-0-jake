import javax.swing.JOptionPane;

public class preText {
	public static void main(String[] args) {
		for (int i = 0; i > 10; i++) {
			String j = JOptionPane.showInputDialog("Name a number!");
			int num = Integer.parseInt(j);
			if (num % 7 == 0) {

			}
		}
	}
}
