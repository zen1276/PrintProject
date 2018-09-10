package controller;

import java.util.Scanner; // required ^^^^^^^^^ for when you use an input method

public class PrinterController 
{
	public void start()
	{
		//System.out.println("I made this program myself.");
		//System.out.println("and it can say stuff");
		//System.out.print("and it can say stuff");
		//System.out.println(" on the same line");
		
		practiceQuestions();
		moreInput();
		questions();
	}
	
	
	private void questions()
	{
		System.out.println("What is your favorite color, or the meaning of life?");
		Scanner inputScanner = new Scanner(System.in);
		
		String answer = inputScanner.nextLine();
	/*	if (answer.equals("zen") || answer.equals("cade")) 
		{
			System.out.println("New phone who dis????");
		} 
		else 
		{ */
			System.out.println("that sounds pretty cool.");
		//}	
		//System.out.println(answer + " is a cool color!"); 	// this stuff takes in whatever you type, then prints it out on the next line
		
		System.out.println("what's your favorite food?");
		answer = inputScanner.nextLine();
/*		if (answer.equals("waddup") || answer.equals("heyy"))
		{int counter;
		counter = 0; 
		for (counter < 5) 
		{
			
		}   */
		System.out.println("ooh " + answer + " sounds very yummy!");
		
		
		inputScanner.close(); // this closes ^^ the data stream, so it is now more secure.
	}
	
	
	private void moreInput()
	{
		Scanner anotherInputScanner;		
		anotherInputScanner = new Scanner(System.in);
		
		System.out.println("What is the meaning of Life, the universe and everything?");
		int answer = anotherInputScanner.nextInt();
		
		System.out.println("You typed: " + answer);
		anotherInputScanner.nextLine(); //Used to consume the enter key press, ignoring the returned String value.
		System.out.println("Words to get rid of error? Type in Something");
		String secondAnswer = anotherInputScanner.nextLine();

		//double holds real numbers, AKA numbers with decimal point
		double magicNumber;
		
		System.out.println("Type in your favorite fractional number. (use a decimal)");
		magicNumber = anotherInputScanner.nextDouble();
		anotherInputScanner.nextDouble();
		
		System.out.println(magicNumber);
		
		//		anotherInputScanner.close();
	}	

	
	private void practiceQuestions()
	{
		System.out.println("Input an integer for us.");
		Scanner thirdInputScanner = new Scanner(System.in); // sets up another Scanner
		int responceInteger = thirdInputScanner.nextInt();
		System.out.println("Your integer is: " + responceInteger);
		System.out.println();
		
		System.out.println("Allright dude, now put in a number with a decimal place.");
		double responceDouble = thirdInputScanner.nextDouble();
		System.out.println("Okay, so the decimal you put in was: " + responceDouble);
		System.out.println();
		
		System.out.println("Now it's time to just type whatever.");
		String responceString = thirdInputScanner.nextLine();
		System.out.println("It's official, you're messed up.");
		System.out.println("You just typed out: " + responceString);
		System.out.println();
	}


	public boolean validInt(String example)
	{
		boolean isValid = false;
	
		try
		{
			Integer.parseInt(example);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			System.out.println("Type in a valid int value human!");
		}
		
		return isValid;
	}
	
	
	public boolean validDouble(String example)
	{
		Boolean isValid = false;
		
		try
		{
			Double.parseDouble(example);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			System.out.println("Only floating point values are allowed for input");
		}
	
		return isValid;
	}
	
	
	
	
	
}
