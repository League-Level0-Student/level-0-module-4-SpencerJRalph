package _07_sleepy_head;
//    Copyright (c) The League of Amazing Programmers 2013-2017

//    Level 0

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

        	int hi =	JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
		boolean isWeekday, isVacation;

		/* You MUST use the above boolean variables in your code */

		/*
		 * Ask the user for these values using a confirm dialog like the one below
		 * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head",
		 * JOptionPane.YES_NO_OPTION);
		 */
		int hi = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
		int vacay = JOptionPane.showConfirmDialog(null, "Is it a vacation?");
		System.out.println(hi);
		System.out.println(vacay);
		isWeekday = (hi == 0);
		isVacation = (vacay == 0);

		if (isWeekday && isVacation) {
			JOptionPane.showMessageDialog(null, "Sleep in");
		} else if (isWeekday && !isVacation) {
			JOptionPane.showMessageDialog(null, " get up");
		} else if (!isWeekday && isVacation) {
			JOptionPane.showMessageDialog(null, "Sleep in");
		} else if (!isWeekday && !isVacation) {
			JOptionPane.showMessageDialog(null, "Sleep in");
		}
		/*
		 * Print “sleep in�? if it is a vacation or a weekend. If it’s a weekday, print
		 * “get up lazybones!�? If it is a weekday, and we are on vacation, print “sleep
		 * in�?.
		 */
	}
}
