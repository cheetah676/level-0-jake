
	import javax.swing.JOptionPane;

	public class HappyPet {
		// 2. Create a happinessLevel variable to store the pet's happiness number.
		//    Initialize to zero.
		static int level=0;
		 static String pet;
		 static String h="notSnooze";
		public static void main(String[] args) {
			// 1. Ask the user what kind of pet they want to buy, and store in variable
			 pet=JOptionPane.showInputDialog("What pet do you want?");
			// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
			for (int i = 0; i < 10; i++) {
				
			
				// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
				//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
				//    Make sure to customize the title and question too.
				int task = JOptionPane.showOptionDialog(null, "What do you want to do with your "+pet, "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
						new String[] { "cuddle", "groom", "wash" }, null);

				// 5. Use user input to call the appropriate method created in step 4.
				if(task==0){
				cuddle();	
				}
				else if(task==1){
					groom();
				}
				else if(task==2){
					wash();
				}
				else{
					JOptionPane.showConfirmDialog(null, "ERROR");
				}
				// 6. If you determine the happiness level is large enough, tell the
				//    user that he loves his pet and use break; to exit for loop.
				if(level==100){
					JOptionPane.showConfirmDialog(null, "You love your "+pet);
					break;
				}
			}
		}

		// 4. Create methods to handle each of your user selections.
		//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
		//    and INCREMENT the pet's happiness Level.
		static void cuddle(){
			
			JOptionPane.showConfirmDialog(null, "Your "+pet+" snoozes in your arms.");
			h="snooze";
			level+=30;
			JOptionPane.showConfirmDialog(null, "Your pet is at a "+level+" level of happiness");
		}
		static void groom(){
			JOptionPane.showConfirmDialog(null, "Your pet lies down and yawns");
			level+=10;
			h="notSnooze";
			JOptionPane.showConfirmDialog(null, "Your pet is at a "+level+" level of happiness");
		}
		static void wash(){
			if(h.equals("snooze")){
				JOptionPane.showConfirmDialog(null, "Your pet wakes up.  It is angry.");
				level-=30;
			JOptionPane.showConfirmDialog(null, "Your pet has a "+level+" level of happiness.");
			h="notSnooze";
			}
			else{
				JOptionPane.showConfirmDialog(null, "Your "+pet+" swims in the tub");
				level+=20;
				JOptionPane.showConfirmDialog(null, "Your pet has a "+level+" level of happiness.");
				
			}
		}
	}
