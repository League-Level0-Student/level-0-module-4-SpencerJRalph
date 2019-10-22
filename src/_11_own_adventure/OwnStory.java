package _11_own_adventure;

import javax.swing.JOptionPane;

public class OwnStory {
	public static void main(String[] args) {
		String path = JOptionPane.showInputDialog(
				"You were walking in a forest and see 3 different paths. One has danger do not enter, another has welcome we have fresh food, and the last one says 'trust us we are in a white van with candy' which one should you choose, 1, 2, or 3");
		if (path.equalsIgnoreCase("1")) {
			JOptionPane.showMessageDialog(null,
					"You choose the first path, You head into the danger do not enter path and instantly falls 30 feet until u meet his death");
		} else if (path.equalsIgnoreCase("2")) {
			String twoPaths = JOptionPane.showInputDialog(
					"Ah ha! You chose the second path and see 2 more paths. One that leads to a dense forest that says food over here and one that leads into an ocean. Which one do you choose, first or second?");
			if (twoPaths.equalsIgnoreCase("first")) {
				JOptionPane.showMessageDialog(null,
						"It was a tough, long journy through the dense forest. You struggled to find water and food. You felt deranged but made it to a small village in china and have plentyful amounts of food. You are safe");
			} else if (twoPaths.equalsIgnoreCase("second")
					) {
				JOptionPane.showMessageDialog(null,
						"You see the bright, beutiful ocean but you fall into quicksand on your way and sufficate.");
			}
		} else if (path.equalsIgnoreCase("3")) {
			JOptionPane.showInputDialog(
					"You chose the path to the white van, In what it seems like red paint, u slowly pace yourself twords the white van. The closer you came to the vehicle the more it towred over you. You knock then u see the kazoo kid and he throws his kazoo into your heart then eats everything except for your eyes which he left for dogs");
		}
	}
}
