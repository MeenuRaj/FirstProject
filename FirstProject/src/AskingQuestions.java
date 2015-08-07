import java.util.Scanner;


public class AskingQuestions 
{

	public static void main(String[] args) 
	{
		
		Scanner keyboard = new Scanner(System.in);

		int age;
		String height;
		double gpa;

		System.out.print( "How old are you? " );
		age = keyboard.nextInt();

		System.out.print( "How tall are you? " );
		height = keyboard.next();

		System.out.print( "What is your GPA? " );
		gpa = keyboard.nextDouble();

		System.out.println("You are " + age + " years old");
		System.out.println("You are " + height + " feet tall");
		System.out.println("You're GPA is " +gpa);

	}

}
