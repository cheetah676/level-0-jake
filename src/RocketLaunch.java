import javax.swing.JOptionPane;

public class RocketLaunch {
	public static void main(String[] args) {
		String potatoe = JOptionPane.showInputDialog("What is Trump?");

		for (int j = 0; j < 4; j++) {

			for (int i = 1; i < 9; i++) {
				if (i == 1) {
					System.out.print(i + potatoe);
				} else if (i == 8) {
					System.out.println("MORE!!!");

				} else if (i == 4) {
					System.out.print(4 + ",");
				}

				else {
					System.out.print(i + potatoe);
				}

			}

		}
		System.out.println();
	}
}
