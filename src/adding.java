import javax.swing.JOptionPane;

public class adding {
public static void main(String[] args){
	String num1=JOptionPane.showInputDialog("Enter a number");
	int number1=Integer.parseInt(num1);
	String num2=JOptionPane.showInputDialog("Enter another number");
	int number2=Integer.parseInt(num2);
	int i=number1+number2;
	JOptionPane.showConfirmDialog(null, number1 + " + " + number2 + " = " + i);
}
}
