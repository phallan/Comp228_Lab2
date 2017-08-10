package excersize1;

public class TestDriver {

	public static void main(String[] args) {//questions to be asked
		String question1="Which of them is a reference type element?\n1. Char\n2. Double\n3. string\n4. Boolean";

		String question2="Which is not a numeric type?\n1. float \n2. double \n3. long \n4. string";

		String question3="Which of them is the largest datatype?\n1. Char\n2. Double\n3. int\n4. float";

		String question4="Which one package is used for user input: \n1. javax.swing, \n2. java.sql, \n3. java.util.Scanner, \n4. javax.xml ";

		String question5="Which of them initialize data?\n1. Constructor\n2. field \n3. method \n4. properties";

		String[] QuestionArray = new String[]{question1,question2,question3,question4,question5};
Test.simulateQuestion((QuestionArray.length - 1),QuestionArray);
Test.inputAnswer(QuestionArray,correctAnswer);
	}
	static int  correctAnswer[] = {3,4,2,3,1};//array for correct answers

}
