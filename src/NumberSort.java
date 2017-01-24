import javax.swing.JOptionPane;

public class NumberSort {
public static void main(String[]args){
	String a =JOptionPane.showInputDialog("Pick a number");
	String b =JOptionPane.showInputDialog("Pick a number");
	String c =JOptionPane.showInputDialog("Pick a number");
	int d=Integer.parseInt(a);
	int e=Integer.parseInt(b);
	int f=Integer.parseInt(c);
	if (d<e && d<f && f>e){
		int high=f;
		int medium=e;
		int low=d;
		JOptionPane.showConfirmDialog(null, high + ", "+medium +", "+ low+".");
	}
	else if (d<e && d<f && f<e){
		int high=e;
		int medium=f;
		int low=d;
	}
	else if (d<e && d>f){
		int high=e;
		int medium=d;
		int low=f;
		JOptionPane.showConfirmDialog(null, high + ", "+medium +", "+ low+".");
	}
	else{
		int high=d;
		int medium=f;
		int low=e;
		JOptionPane.showConfirmDialog(null, high + ", "+medium +", "+ low+".");		
	}
}
}
