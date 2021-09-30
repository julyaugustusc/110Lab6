/*-------------------------------------------------------------------------
// AUTHOR: Augustus Crosby
// FILENAME: Lab6.java
// SPECIFICATION: 
// FOR: CSE 110- Lab #6
// TIME SPENT: an hour
//-----------------------------------------------------------*/

import java.util.Scanner;

public class Lab6
{
	public static void main(String[] args)
	{
		// declare a Scanner object
		Scanner in = new Scanner(System.in);
	
		//inputs from user
		System.out.print("Please enter your first name: ");
		String first = in.nextLine();
		System.out.print("Please enter your last name: ");
		String last = in.nextLine();
		System.out.print("Please enter your birth year: ");
		int birth = in.nextInt();
		
		//use the constructor
		//to create a brand-new object Person
		Person p = new Person(first, last, birth);
		
		//Prints a statement
		System.out.println(p.getFirstName() + " " + p.getLastName() + " is " + p.getAge(2018) 
		+ " years old in 2018 will be " + p.getAge(2028) + " years old in 2028.");

	}
}