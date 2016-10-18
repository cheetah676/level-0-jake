
	// Copyright The League of Amazing Programmers 2014
	import javax.swing.JOptionPane;

	/*
	 * I have a pocket full of change. I hate doing math. Make me a program that
	 * will calculate how much money I have without me having to use my brain. Then
	 * make me a sandwich.
	 */
	public class jake {

		public static void main(String[] args) {

			// Ask the user how many nickels they have
			String numberOfNickles=JOptionPane.showInputDialog("How many nickles do you have?");
			// Convert their answer to an int using Integer.parseInt()
			int nickles=Integer.parseInt(numberOfNickles);
			// Ask the user how many dimes they have, and convert their answer
			String numberOfDimes=JOptionPane.showInputDialog("How many dimes do you have?");
			int dimes=Integer.parseInt(numberOfDimes);
			// Ask the user how many quarters they have, and convert their answer
			String numberOfQuarters=JOptionPane.showInputDialog("How many quarters do you have?");
			int quarters=Integer.parseInt(numberOfQuarters);
			String numberOfDollars=JOptionPane.showInputDialog("How many dollars do you have?");
			int dollars=Integer.parseInt(numberOfDollars);
			String numberOfPennies=JOptionPane.showInputDialog("How many pennies do you have?");
			int pennies=Integer.parseInt(numberOfPennies);
			// Calculate how much money the user has and save it in a double variable 
			double money= nickles*0.05+ dimes*0.10+ quarters*0.25+ dollars*1.00+ pennies*0.01;
			// Tell the user how much money they have
			JOptionPane.showConfirmDialog(null, "You have $" + money);
			String sandwich=JOptionPane.showConfirmDialog(parentComponent, message),JOptionPane.YES_NO_OPTION);
			if (money> 50 && sandwich.equals(JOptionPane.YES_OPTION));
				
		}
	}



