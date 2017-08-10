package Excersize2;

import java.util.Random;

import javax.swing.JOptionPane; 
public class Lotto {
	
	Random Random=new Random();
private int[] lottery = new int[]{
		   Random.nextInt(9),
		    Random.nextInt(9),
		   Random.nextInt(9)
	};
			
			
		

			public void startGame(int number) {
		    	
		    	int lottoNumbers=lottery[0]+ lottery[1]+lottery[2];
		    		
		do{
			for(int i=0;i<5;i++)
		    	
		    {
		    		JOptionPane.showMessageDialog(null,"You didn't won this time.lets try again");
		    		}
		}
		
		    	while(number != lottoNumbers);
		    		System.exit(0);
		    	
		    	
		    
		    	
		    		JOptionPane.showMessageDialog(null,"Computer won the game");}
		    	
		    }
		    

		
