import javax.swing.JOptionPane;

public class IfCheck {
	

	public static void main(String[] args) {
	String age=JOptionPane.showInputDialog("What is your age?");
	int ages=Integer.parseInt(age);
	if (ages<20){
		System.out.println("It is great being young!");
	}
	else{
	System.out.println("You are an old man!!!!");	
		
	}
	}
		
		
	
	}

