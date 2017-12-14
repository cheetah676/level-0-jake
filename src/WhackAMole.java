import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton a = new JButton();
	JButton b = new JButton();
	JButton c = new JButton();
	JButton d = new JButton();
	JButton y = new JButton();
	JButton f = new JButton();
	JButton g = new JButton();
	JButton h = new JButton();
	JButton i = new JButton();
	JButton j = new JButton();
	Random ran = new Random();
	int mole = ran.nextInt(11) + 1;

	public static void main(String[] args) {
		WhackAMole wam = new WhackAMole();
		wam.run();
	}

	void run() {
		frame.add(panel);
		frame.setVisible(true);
		panel.add(a);
		panel.add(b);
		panel.add(c);
		panel.add(d);
		panel.add(y);
		panel.add(f);
		panel.add(g);
		panel.add(h);
		panel.add(i);
		panel.add(j);
		a.addActionListener(this);
		b.addActionListener(this);
		c.addActionListener(this);
		d.addActionListener(this);
		y.addActionListener(this);
		f.addActionListener(this);
		g.addActionListener(this);
		h.addActionListener(this);
		i.addActionListener(this);
		j.addActionListener(this);
		frame.setSize(200, 200);
		if (mole == 1) {
			a.setText("MOLE");
		}
		if (mole == 2) {
			b.setText("MOLE");
		}
		if (mole == 3) {
			c.setText("MOLE");
		}
		if (mole == 4) {
			d.setText("MOLE");
		}
		if (mole == 5) {
			y.setText("MOLE");
		}
		if (mole == 6) {
			f.setText("MOLE");
		}
		if (mole == 7) {
			g.setText("MOLE");
		}
		if (mole == 8) {
			h.setText("MOLE");
		}
		if (mole == 9) {
			i.setText("MOLE");
		}
		if (mole == 10) {
			j.setText("MOLE");
		}

	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == a && mole != 1) {
			speak("You are a dork");
		} else if (e.getSource() == b && mole != 2) {
			speak("You are a dork");
		} else if (e.getSource() == c && mole != 3) {
			speak("You are a dork");
		} else if (e.getSource() == d && mole != 4) {
			speak("You are a dork");
		} else if (e.getSource() == y && mole != 5) {
			speak("You are a dork");
		} else if (e.getSource() == f && mole != 6) {
			speak("You are a dork");
		} else if (e.getSource() == g && mole != 7) {
			speak("You are a dork");
		} else if (e.getSource() == h && mole != 8) {
			speak("You are a dork");
		} else if (e.getSource() == i && mole != 9) {
			speak("You are a dork");
		} else if (e.getSource() == j && mole != 10) {
			speak("You are a dork");
		} else {
			playSound("whack.wav");
		}
	}
}