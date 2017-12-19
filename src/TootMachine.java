import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TootMachine implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();

	public static void main(String[] args) {
		TootMachine TM = new TootMachine();
		TM.run();
	}

	void run() {
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		frame.setVisible(true);
		button1.setText("Normal Fart");
		button2.setText("Long Fart");
		button3.setText("Short Fart");
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		frame.pack();
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == button1) {
			playSound("regularFart.wav");
		} else if (buttonPressed == button2) {
			playSound("longFart.wav");
		} else if (buttonPressed == button3) {
			playSound("shortFart.wav");

		}

	}

}
