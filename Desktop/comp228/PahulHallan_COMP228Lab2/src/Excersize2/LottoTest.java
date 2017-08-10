package Excersize2;

import javax.swing.JOptionPane;

public class LottoTest {

	public static void main(String[] args) {
		
		 int number = Integer.parseInt(JOptionPane.showInputDialog("choose a number between 3 and 27"));
			Lotto lotto=new Lotto();
			 lotto.startGame(number);
	      } 
	

}
