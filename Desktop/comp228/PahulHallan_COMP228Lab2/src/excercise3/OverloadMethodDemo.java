package excercise3;

import javax.swing.JOptionPane;

public class OverloadMethodDemo {

int sum;
	 public  void sum(int number2)//using 1 argument
	   {
	     sum = number2;
	      JOptionPane.showMessageDialog(null,sum);
	   }
	 public  void sum(int number2,int number3)//using 2 argument
	   {
	     sum = number2+number3;
	      
	      JOptionPane.showMessageDialog(null,sum);
	   }
	 public  void sum(int number2,int number3,int number4)//using 3 argument
	   {
	     sum = number2+number3+number4;
	     
	      JOptionPane.showMessageDialog(null,sum);
	   }
	 public OverloadMethodDemo()
	 {//default constructor}
	 
}
}