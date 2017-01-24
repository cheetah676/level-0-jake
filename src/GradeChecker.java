import javax.swing.JOptionPane;

public class GradeChecker {
public static void main(String[]args){
grading();
	
}
static void grading(){
String grade=JOptionPane.showInputDialog("Wat is yor grade in yor speling test.  i am yor supor computor that grades yor papors and nevor spels anysing rong.");
int grades=Integer.parseInt(grade);
if(grades >=90 && grades <=100){
	JOptionPane.showConfirmDialog(null, "A");
}
else if(grades >=80 && grades <= 89){
	JOptionPane.showConfirmDialog(null, "B");
}
else if(grades >=70 && grades <= 79){
	JOptionPane.showConfirmDialog(null, "C");
}
else if(grades >=60 && grades <=69){
	JOptionPane.showConfirmDialog(null, "D");
}
	else if(grades >=0 && grades <=59){
		JOptionPane.showConfirmDialog(null, "F yo stupid");
}
else{
	JOptionPane.showConfirmDialog(null, "Error");
	grading();
}
		}	
	}

