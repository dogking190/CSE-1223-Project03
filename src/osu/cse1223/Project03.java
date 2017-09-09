/*
 * Project03.java
 * This project will generate random numbers are quiz you on them
 * and grades you.
 * 
 * @author Paul M Onderisin
 * @verison 1.0.0
 */
package osu.cse1223;

import java.util.Scanner;

public class Project03 {
	
	//Stores the correct and total answers
	static int _correct = 0;
	static double _total = 0;

	public static void main(String[] args) {
		
		//Starts the scanner
		Scanner scan = new Scanner(System.in);
		
		//Gets the user name
		p("Enter your name: ", false);
		
		//Stores the user's name
		String _name = scan.nextLine();
		
		//Displays a welcoming message
		p("Welcome " + _name + "! Please answer the following questions:", true);
		
		//Generates a random number 1
		int _num1 = (int) (20 * Math.random()) + 1;
		
		//Generates the second number
		int _num2 = (int) (20 * Math.random()) + 1;
		
		//Starts a blank line
		p("",true);
		
		/*************************************** Start of Math Part ******************************************/
		
		//Shows the addition method
		p(_num1 + " + " + _num2 + " = ", false);
		
		//the user input
		int _userAdditionAnswer = scan.nextInt();
		
		//gets the new line
		scan.nextLine();
		
		//the actual answer
		int _additionUserAnswer = _num1 + _num2;
		
		//Compares and answers and decide if correct
		CorrectAnswers(_userAdditionAnswer, _additionUserAnswer);
		
		/*************************************** End of Math Part ******************************************/
		
		//Starts a blank line
		p("",true);
		
		/*************************************** Start of Multi Part ******************************************/
		//Does the multi question
		p(_num1 + " * " + _num2 + " = ", false);
		
		//gets the user input
		int _multiUserAnswer = scan.nextInt();
		
		//gets the next line
		scan.nextLine();
		
		//the actual answer
		int _multiActualAnswer = _num1 * _num2;
		
		//Compares the answers
		CorrectAnswers(_multiUserAnswer, _multiActualAnswer);
		
		/*************************************** End of Multi Part ******************************************/
		
		//Starts a blank line
		p("",true);
				
		/*************************************** Start of Division Part ******************************************/
		
		//Does the division question
		p(_num1 + " / " + _num2 + " = ", false);
				
		//gets the user input
		int _divisionUserAnswer = scan.nextInt();
				
		//gets the next line
		scan.nextLine();
				
		//the actual answer
		int _divisionActualAnswer = _num1 / _num2;
				
		//Compares the answers
		CorrectAnswers(_divisionUserAnswer, _divisionActualAnswer);
		
		/*************************************** End of Division Part ******************************************/		
		
		//Starts a blank line
		p("",true);
		
		/*************************************** Start of Mod Part ******************************************/
		
		//Does the division question
		p(_num1 + " % " + _num2 + " = ", false);
				
		//gets the user input
		int _modUserAnswer = scan.nextInt();
				
		//gets the next line
		scan.nextLine();
				
		//the actual answer
		int _modActualAnswer = _num1 % _num2;
				
		//Compares the answers
		CorrectAnswers(_modUserAnswer, _modActualAnswer);
		
		/*************************************** End of Mod Part ******************************************/		

		//Starts a blank line
		p("",true);
		
		//Percentage that were correct
		double _percentCorrect = (_correct/_total) * 100;
		
		//Displays the number correct and your percentagePaul
		p("You got " + _correct + " correct answers", true);
		p("That's " + _percentCorrect + "%!", true);
		
		//Closes the scanner
		scan.close();
		
	}
	
	//Starts the display method
	public static void p(String message, boolean bool) 
	{
		
		if(bool)
		{
			//if Bool is truee then adds a new line
			System.out.println(message);
		}
		else
		{
			// If bool is false then no new line is added
			System.out.print(message);
		}
	}
	
	//Compares the answers and decides if the answer is correct and if so add a point.
	public static void CorrectAnswers(int user, int actual)
	{
		
		//Adds one to the total answers
		_total = _total + 1;
		
		//if the user got the correct answer
		if(user == actual)
		{
			p("Correct!", true);
			_correct = _correct + 1;
		}
		else
		{
			p("Wrong!", true);
			p("The correct answer is " + actual, true);
		}
	}

}
