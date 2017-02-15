import javax.swing.JOptionPane;

public class teamProject {
	public static void main(String[] args) {
		for (int i = 10; i > 0; i++) {
			String choice = JOptionPane.showInputDialog("Would you like to 'add two numbers', 'calculate change', 'print a message', or 'exit'?");
			if (choice.equals("add two numbers")) {
				add();
			} else if (choice.equals("calculate change")) {
				changeCalculator();
			} else if (choice.equals("print a message")) {
				message();
			} else if (choice.equals("exit")) {
				System.exit(0);
			} else {
				JOptionPane.showConfirmDialog(null, "Like Trump, you are an error to humanity");
			}
		}
	}

	static void add() {
		String x1 = JOptionPane.showInputDialog("Name one of the numbers");
		String x2 = JOptionPane.showInputDialog("Name the other number");
		int add1 = Integer.parseInt(x1);
		int add2 = Integer.parseInt(x2);
		int sum = add1 + add2;
		JOptionPane.showConfirmDialog(null, "The sum is " + sum);
	}

	static void changeCalculator() {
		String x1 = JOptionPane.showInputDialog("How much was the price?");
		String x2 = JOptionPane.showInputDialog("How much did you pay?");
		double price = Double.parseDouble(x1);
		double payed = Double.parseDouble(x2);
		if (payed >= price) {
			double change = payed - price;
			JOptionPane.showConfirmDialog(null, "Your change is $" + change);
		} else {
			JOptionPane.showConfirmDialog(null, "ERROR");
		}
	}

	static void message() {
		String message = JOptionPane.showInputDialog("Write your message");
		JOptionPane.showConfirmDialog(null, message);
	}
}
