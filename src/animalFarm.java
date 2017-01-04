import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class animalFarm {

	animalFarm() {
		/*
		 * 1. Ask the user which animal they want, then play the sound of that
		 * animal.
		 */
		for (int j = 0; j < 15; j++) {
			
		
		String i = JOptionPane.showInputDialog("Do you want a cow, duck, dog, llama, or all?");
		/* 2. Make it so that the user can keep entering new animals. */

		if (i.equals("cow")) {
			playMoo();
		}
		else if(i.equals("duck")){
			playQuack();
		}
		else if(i.equals("dog")){
			playWoof();
		}
		else if(i.equals("llama")){
		playSpit();	
		}
		else if(i.equals("all")){
			playMoo();
			playQuack();
			playWoof();
			playSpit();
		}
		else{
			JOptionPane.showMessageDialog(null, "Not an optoin.");
		}
	}
	}
	void playMoo() {
		playNoise(mooFile);
	}

	

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}
	void playSpit(){
		playNoise(llamaFile);
	}
	String quackFile = "/Users/League/Google Drive/league-sounds/quack.wav";
	String mooFile = "/Users/League/Google Drive/league-sounds/moo.wav";
	String woofFile = "/Users/League/Google Drive/league-sounds/woof.wav";
	String meowFile = "/Users/League/Google Drive/league-sounds/meow.wav";
	String llamaFile = "/Users/League/Google Drive/league-sounds/llama.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFile));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new animalFarm();
	}
	
}
