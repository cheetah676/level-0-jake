import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Science{

public static void main(String[] args) {
	Science fault=new Science();
	fault.run();
}


   void run(){
	   JFrame frame = new JFrame();
	   JPanel panel=new JPanel();
	   JButton button1 = new JButton();
	   JButton button2 = new JButton();
	   JButton button3 = new JButton();
	   frame.setVisible(true);
	   frame.setSize(700,700);
	   panel.add(button1);
	   panel.add(button2);
	   panel.add(button3);
	   frame.add(panel);
   } 
   }