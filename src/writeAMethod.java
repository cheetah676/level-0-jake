import javax.swing.JOptionPane;

public class writeAMethod {
public static void main(String[] args){
	iRock();
	age(11);	
	repeatString("HI", 6);
	multiply(7, 12);
	}
	static void iRock(){
	String name=JOptionPane.showInputDialog("What is your name?");
	JOptionPane.showConfirmDialog(null, name+" rocks");
}
	static void age(int i){
		JOptionPane.showConfirmDialog(null, 2017-i);
		
	}
	static void repeatString(String t, int f){
		for (int i = 1; i <=f; i++) {
			JOptionPane.showConfirmDialog(null, t);	
		}
	}
	static void multiply(int k, int y){
		JOptionPane.showConfirmDialog(null, k*y);
	}
}
