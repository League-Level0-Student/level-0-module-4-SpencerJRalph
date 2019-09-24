package _06_test_scores;

import javax.swing.JOptionPane;

public class testScores {
	public static void main(String[] args) {
		String test = JOptionPane.showInputDialog("what is your test score?");
		Double tests = Double.parseDouble(test);
		double score = 0.0;
		score = score + tests;
		if (score > 89.5 && score <= 100) {
			JOptionPane.showMessageDialog(null, "Nice Job! You must have studied really hard. You got an A");
		} 
		else if (score < 89.5 && score >= 79.5) {
			JOptionPane.showMessageDialog(null, "You might wanna hit the books, but you still got a B!!");
		}
		else if (score < 79.5 && score >= 69.5) {
			JOptionPane.showMessageDialog(null, "Oof, you might wanna study a lot harder dummy, you got a C");
		}
		else if (score < 69.5 && score >= 0) {
			JOptionPane.showMessageDialog(null, "Dang your really dumb if you got a FFFFFFFFFFFFFF");
		}
	}

	

}
