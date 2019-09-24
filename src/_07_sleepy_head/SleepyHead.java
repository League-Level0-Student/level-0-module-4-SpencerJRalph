package _07_sleepy_head;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        /* You MUST use the above boolean variables in your code */
        
        /*
         * Ask the user for these values using a confirm dialog like the one below
         * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         */
        	int hi =	JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
System.out.println(hi);
isWeekday = (hi ==0);
isVacation = (hi ==1);
if(isWeekday) {
	JOptionPane.showMessageDialog(null, "GET UP U L:ITTLE LAZYB OENOEDGH SUDOH GOUDSH G:UDSH FVIADU GFIUEDGF IUEH FIUER GIURGHHKAFH IPUSDG FIY SDGH IPYRWG PYIG IHFVBIPYASHFVOU");
}
else if(isVacation) {
	JOptionPane.showMessageDialog(null, " s     l     e     p         i     n     !     !    !    !    !    !                HI WAHT IS YOUR NAME SINDF OUISHOUHZ;KLSJDBG IKJ SGDHIGGIH UHEDI  FAIU H REI GFAYSRGFVUOWAHF BSDVBVJKHB OU HIYwgeio hiuhwarh guygix hiydgy t87qy 4ihxcb");
}
        /*
         * Print “sleep in�? if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!�? If it is a weekday, and we are on vacation,
         * print “sleep in�?.
         */
    }
}
