package excercise3;

import javax.swing.JOptionPane;

public class OverloadMethodDemoTest {

	public static void main(String[] args) {
		OverloadMethodDemo object=new OverloadMethodDemo();
		int number1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the number "));
		int number2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number, you want to add "));
		int number3 = Integer.parseInt(JOptionPane.showInputDialog("Enter the third number, you want to add  "));
		object.sum(number1);//using 1 argument
		object.sum(number1,number2);//using 2 argument
		object.sum(number1,number2,number3);//using 3 argument
	}

}
