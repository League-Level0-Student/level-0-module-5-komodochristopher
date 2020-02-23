import java.util.Random;

import javax.swing.JOptionPane;

public class skillpracticeworksheet {
	public static void main(String[] args) {

		skillpracticeworksheet skills = new skillpracticeworksheet();
		skills.skill1();
		skills.skill2();
		skills.skill3();
		skills.skill4();
		skills.skill5();
	}

	void skill1() {
		// Use pop-ups for the following.
		// Ask the user how many dimes they have
		// String i = JOptionPane.showInputDialog("how many dimes do you have? ");
		// Tell them how many cents they have (hint multiply by 10)
//int dimes = Integer.parseInt(i);

//JOptionPane.showMessageDialog(null,dimes*10);

// Ask the user how tall they are (inches)
		// String y = JOptionPane.showInputDialog("how tall are you in inches");

		// int whale =Integer.parseInt(y);

		// if(whale<36) {
		// JOptionPane.showMessageDialog( null,"Eat more of your wheaties, bud");

	}

	// If they are shorter than 36 inches, tell them to eat their Wheaties

	// }

	void skill2() { // Write a loop to print every third number between 1 and 30 to the console
		//for (int i = 1; i < 31; i += 3) {
			//System.out.println(i);
			// if() {

		//}
	}

	void skill3() { // Get a random number that is less than 20 and print it to the console
	 int y = new Random().nextInt(20);
	 System.out.println(y);
	 int v =new Random().nextInt(20);
	 System.out.println(v);
		// Get another random number that is less than 10 and print it to the console

		// Using a pop-up, tell the user the difference between the numbers // Hint: use
		// subtraction
	 
JOptionPane.showMessageDialog(null, y-v);

	}

	void skill4() {
	}// In a pop-up, ask the user for the city they live in
	
//String click =JOptionPane.showInputDialog("What City do you live in?");
		// If they answered "San Diego", tell them they live in America's Finest City

//if(click.equals("sandiego")) {
		// JOptionPane.showMessageDialog(null, "You live in Americas Finest City");
//}

//else {
		// JOptionPane.showMessageDialog(null, "Move to San diego ");
//}
		// Otherwise, tell them to move to San Diego

		// Create a variable - cars - and initialize it to the number of cars your
		// family has. // If there are 0 cars, use a pop-up to display, "I bet you use
// public transportation."
		//int cars = Integer.parseInt(JOptionPane.showInputDialog("How Many cars do you have?"));
		// If there is 1 car, use a pop-up to display the make/model of the car
		//if (cars == 1) {
			//JOptionPane.showMessageDialog(null, "You have a Toyota jeep");

		//} else {
			//if (cars > 1) {
				//JOptionPane.showMessageDialog(null, "your car has 4 sportsy wheels");
			//}
			//if (cars == 0) {
				//JOptionPane.showMessageDialog(null, "YOU must use the the public transportation"); // If there is more
																									// than 1 car, use a
																									// pop-up to display
																									// how many wheels
																									// the //
			//}
			// cars have between them.
		//}
	//}

	void skill5() { // In a pop-up, ask the user for the name of their school
//String k =JOptionPane.showInputDialog("Whats your school named");
		// In another pop-up, tell the user, that their school is a fantastic school. //
//JOptionPane.showMessageDialog(null, k+ " is a fantastic school");
		// You must include the name of the school in the message.
	}
}