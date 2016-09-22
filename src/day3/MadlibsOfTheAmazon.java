package day3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...

		// Get the user to enter an adjective
String adj = JOptionPane.showInputDialog("Enter Adjective");
		// Get the user to enter a type of liquid
String liq = JOptionPane.showInputDialog("Enter Liquid");
		// Get the user to enter a body part
String bpa = JOptionPane.showInputDialog("Enter Body Part");
		// Get the user to enter a verb
String ver = JOptionPane.showInputDialog("Enter Verb");
		// Get the user to enter a place
String pla = JOptionPane.showInputDialog("Enter Place");
		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [Enter Adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [Enter Liquid] and will most
		// likely take a bite out of your [Enter Body Part] if you [Enter Verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [Enter Place]. Good luck!
		JOptionPane.showMessageDialog(null,
				 "Piranhas are more "+adj+" during the day , so cross the river at night. Piranhas are attracted to fresh "+liq+" and will most likely take a bite out of your "+bpa+
				 " if you "+ver+". Whatever you do, if you have an open wound, try to find another way to get back to the "+pla+". Good luck!");
		// Make a pop-up for the final story. You can use \n to go to the next line.
		

	}
}

