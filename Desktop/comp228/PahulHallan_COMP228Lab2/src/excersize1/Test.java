package excersize1;


import java.util.Random;

import javax.swing.JOptionPane;

public class Test {

	Random randomObject;//create random object to be used in generate msg 
	
	public static int rightAnswer = 0;


	//Method for Getting input and calling methods
	public static void inputAnswer(String[] question,int[] correctAnswer)
	{
		int answer = 0;
		
		//Creating loop for questions
		for(int ques = 0;ques<5;ques++)
		{
			do
			{
			answer = Integer.parseInt(JOptionPane.showInputDialog(simulateQuestion(ques,question)));
		
			}
		while(answer!=1 &&answer!=2 &&answer!=3 && answer!=4);
			checkAnswer(ques,answer,correctAnswer );
		}
		percentage();
	}
		
		//create questions
	public static String simulateQuestion(int number, String[] ques)
	{
 return ques[number];
		
	}
	//check answers
	public static int checkAnswer(int questionNumber, int answers,int[] correctAnswer)
	{
	
		boolean response = true;
		if(answers == correctAnswer[questionNumber]){
			JOptionPane.showMessageDialog(null,generateMessage(response));
		rightAnswer++;	
		
		}
		else{
			response = false;
			JOptionPane.showMessageDialog(null,generateMessage(response));
		}
		
	
		return correctAnswer[questionNumber];
	}
	//Method to generate messages
	public static String generateMessage(boolean response)
	{

		Random correctResponse = new Random();
		if (response == true)
		{
		switch (correctResponse.nextInt( 4 ))
				{
			case 0: 
			return "Good Job";
				
			case 1: 
				return "Nicely Done!";
				
			case 2:
				return "Keep up the good work!";
				
			case 3: 
				return "Excellent!";
			
			default: 
				return null;
				
				}
		}
		else
		{
			switch (correctResponse.nextInt( 4 ))
			{
		case 0: 
			return "No. Please try again";
			
			
		case 1: 
			return "Wrong. Try once more";
			
		case 2:
			return "Don't give up!";
			
		case 3: 
			return "No. Keep trying!";
			
		default: 
			return null;
			
			}
		}
		
		
	}
	public static void percentage(){//show percentage{
		
		JOptionPane.showMessageDialog(null,"You have answered " + rightAnswer + " Right Answers" +
											"\n Your percentage is " + (rightAnswer*100/5)+"%");
		}
		
}

	

	


